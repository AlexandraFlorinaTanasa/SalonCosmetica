package org.test;

import java.util.ArrayList;
import java.util.List;

import org.entity.Client;
import org.entity.Coafat;
import org.entity.Makeup;
import org.entity.ManiPedi;
import org.entity.Serviciu;
import org.entity.Tuns;
import org.entity.Vopsit;


public class TestServicii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			EntityManagerFactory emf =Persistence.createEntityManagerFactory("SalonInfrumusetareJPA");
			EntityManager em=emf.createEntityManager();
			
		
			//Populare clienti
			
			List <Client> lstClientiPersistenti=em.
					createQuery("Select c From Client c",Client.class).
					getResultList();
			
			if(! lstClientiPersistenti.isEmpty()) {
				em.getTransaction().begin();
				for(Client c: lstClientiPersistenti) em.remove(c);
				em.getTransaction().commit();			
			}
			
			//Create
			em.getTransaction().begin();
			em.persist(new Client(10,"Grama Mara"));
			em.persist(new Client(11,"Ignat Ana"));
			em.persist(new Client(12,"Gafencu Madalina"));
			em.persist(new Client(13,"Radu Diana"));
			em.persist(new Client(14,"Necula Sabina"));
			em.persist(new Client(15,"Botez Andra"));
			em.persist(new Client(16,"Iftime Ramona"));
			em.persist(new Client(17,"Benta Maia"));
			em.persist(new Client(18,"Ciobanu Melinda"));
			em.persist(new Client(19,"Mera Ioana"));
			em.getTransaction().commit();
			//Read after create
			lstClientiPersistenti=em.createQuery("Select c From Client c",Client.class).getResultList();
			System.out.println("Lista clientilor persistenti/salvati in baza de date");
			
			for(Client c:lstClientiPersistenti)
				System.out.println("IdClient: "+c.getId()+", nume: "+c.getNume());
			
			
			//POPULARE SERVICII
			List <Serviciu> lstServiciiPersistente=em.createQuery("Select s From Serviciu s",Serviciu.class).getResultList();
			if(!lstServiciiPersistente.isEmpty()) {
				em.getTransaction().begin();
				for(Serviciu s:lstServiciiPersistente) em.remove(s);
				em.getTransaction().commit();
			}
			List<Serviciu> catalogServicii=new ArrayList<Serviciu>();
			//Initializare explicita  a unor servicii oferite
			Coafat s1=new Coafat(1,"Coafat_1",250.0,"Coafat uzual");
			Coafat s2=new Coafat (2,"Coafat_2",140.0, "Coafat de ocazie");
			catalogServicii.add(s1);
			catalogServicii.add(s2);
			
			Tuns s3= new Tuns(3,"Tuns_1",300.0,"Tunsoare noua");
			Tuns s4= new Tuns(4,"Tuns_2",230.0,"Doar scurtat");
			catalogServicii.add(s3);
			catalogServicii.add(s4);
			
			
			Makeup s5=new Makeup(5,"Makeup_1",123.0,"Machiaj de zi");
			Makeup s6=new Makeup(6,"Makeup_2",200.0,"Machiaj de seara");
			catalogServicii.add(s5);
			catalogServicii.add(s6);
			
			
			ManiPedi s7=new ManiPedi(7,"ManiPedi_1",150.0,"clasica","clasica","tratament_hidratare");
			ManiPedi s8=new ManiPedi (8,"ManiPedi_2",100.0,"semipermanenta","clasica","indepartare_cuticule");
			catalogServicii.add(s7);
			catalogServicii.add(s8);
			
			Vopsit s9=new Vopsit(9,"Vopsit_1",130.0,"nuantare","rosu");
			Vopsit s10=new Vopsit (10,"Vopsit_2",190.0,"suvite","verde");
			Vopsit s11=new Vopsit (11,"Vopsit_3",175.0,"decolorare","-");
			catalogServicii.add(s9);
			catalogServicii.add(s10);
			catalogServicii.add(s11);
			
			em.getTransaction().begin();
			catalogServicii.stream().forEach(s->em.persist(s));
			em.getTransaction().commit();
			//Read after create
			lstServiciiPersistente=em.createQuery("Select s From Serviciu s",Serviciu.class).getResultList();
			System.out.println("Lista serviciilor persistente/salvate in baza de date");
			for (Serviciu s:lstServiciiPersistente)
				System.out.println("Id: "+s.getIdServiciu()+", denumire: "+s.getDenServiciu()+", pret: "+s.getPretServiciu().toString());
	}

}
