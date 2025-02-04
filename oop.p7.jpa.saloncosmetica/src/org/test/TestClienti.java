package org.test;

import java.util.ArrayList;
import java.util.List;

import org.entity.Client;

public class TestClienti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
					List<Client> clienti=new ArrayList<Client>();

					clienti.add(new Client(10,"Grama Mara"));
					clienti.add(new Client(11,"Ignat Ana"));
					clienti.add(new Client(12,"Gafencu Madalina"));
					clienti.add(new Client(13,"Radu Diana"));
					clienti.add(new Client(14,"Necula Sabina"));
					clienti.add(new Client(15,"Botez Andra"));
					clienti.add(new Client(16,"Iftime Ramona"));
					clienti.add(new Client(17,"Benta Maia"));
					clienti.add(new Client(18,"Ciobanu Melinda"));
					clienti.add(new Client(19,"Mera Ioana"));
					
					EntityManagerFactory emf=Persistence.createEntityManagerFactory("SalonInfrumusetareJPA");
					EntityManager em=emf.createEntityManager();
					
					//Clean-up clienti
					em.getTransaction().begin();
					em.createQuery("Delete From Client c").executeUpdate();
					em.getTransaction().commit();
					
					//Create
					em.persist(clienti.get(0));
					em.persist(clienti.get(1));
					em.persist(clienti.get(2));
					em.persist(clienti.get(3));
					em.persist(clienti.get(4));
					em.persist(clienti.get(5));
					em.persist(clienti.get(6));
					em.persist(clienti.get(7));
					em.persist(clienti.get(8));
					em.persist(clienti.get(9));
					
					em.getTransaction().begin();
					em.getTransaction().commit();
					em.clear();
					
					//Read after create
					List<Client> ClientiPersitenti=em.
							createQuery("Select c From Client c",Client.class).getResultList();
					
					System.out.println("Lista clienti persitenti/salvati in baza de date");
					for(Client c:ClientiPersitenti)
						System.out.println("IdClient: "+c.getId()+", nume: "+c.getNume());
					
					//Update/Remove
					em.getTransaction().begin();
					Client c13=em.find(Client.class, 13);
					if(c13 != null) {
						c13.setNume("TIMI SRL Update");
						
					}
					//Read/Remove
					
					//Client c11=(Client)em.createQuery("Select o From Client o where o.idclient=11").getSingleResult();
					Client c11=em.find(Client.class, 11);
					if(c11 !=null) em.remove(c11);
					
					//Realizare tranzactie
					em.getTransaction().commit();
					em.clear();
					
					ClientiPersitenti=em.
							createQuery("Select c From Client c",Client.class).getResultList();
					System.out.println("Lista finala clienti persistenti (salvati in baza de date):");
					for(Client c:ClientiPersitenti)
						System.out.println("IdClient: "+c.getId()+", nume: "+c.getNume());
					

				}

			}

		



	


