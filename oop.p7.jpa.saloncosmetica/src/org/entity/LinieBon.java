package org.entity;

import java.util.Objects;

public class LinieBon {
	private Integer idLinie;
	Serviciu serviciu;
	BonDeCasa bonDeCasa;
	private Double TVALinie;
	private Double valoareLinie;
	
	public Integer getIdLinie() {
		return idLinie;
	}
	public void setIdLinie(Integer idLinie) {
		this.idLinie = idLinie;
	}
	public Serviciu getServiciu() {
		return serviciu;
	}
	public void setServiciu(Serviciu serviciu) {
		this.serviciu = serviciu;
	}
	public BonDeCasa getBonDeCasa() {
		return bonDeCasa;
	}
	public void setBonDeCasa(BonDeCasa bonDeCasa) {
		this.bonDeCasa = bonDeCasa;
	}
	
	public Double getTVALinie() {
		if(TVALinie==null || TVALinie==0) TVALinie=calcTVALinie();
		return TVALinie;
	}
	public Double getValoareLinie() {
		if(valoareLinie==null || valoareLinie==0.0) valoareLinie=calcValLinie();
		return valoareLinie;
	}
	Double calcValLinie() {
		Double val=null;
		if(serviciu!=null)
			val=serviciu.getPretServiciu();
		return val;
	}
	Double calcTVALinie() {
		Double valTVA=null;
		if(serviciu!=null )
			valTVA=0.19/1.19*(serviciu.getPretServiciu());
		return valTVA;
	}
	public LinieBon(Integer idLinie, Serviciu serviciu, BonDeCasa bonDeCasa, Double TVALinie,
			Double valoareLinie) {
		super();
		this.idLinie = idLinie;
		this.serviciu = serviciu;
		this.bonDeCasa = bonDeCasa;
		this.TVALinie = TVALinie;
		this.valoareLinie = valoareLinie;
	}
	public LinieBon() {
		super();
	}
	public static void add(LinieBon linieBon) {
		LinieBon.add(linieBon);
	}
	@Override
	public int hashCode() {
		return Objects.hash(TVALinie, bonDeCasa, idLinie, serviciu, valoareLinie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinieBon other = (LinieBon) obj;
		return Objects.equals(TVALinie, other.TVALinie) && Objects.equals(bonDeCasa, other.bonDeCasa)
				&& Objects.equals(idLinie, other.idLinie) && Objects.equals(serviciu, other.serviciu)
				&& Objects.equals(valoareLinie, other.valoareLinie);
	}
	@Override
	public String toString() {
		return "LinieBon [idLinie=" + idLinie + ", serviciu=" + serviciu + ", bonDeCasa=" + bonDeCasa + ", TVALinie="
				+ TVALinie + ", valoareLinie=" + valoareLinie + "]";
	}
	
	
}
