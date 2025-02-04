package org.entity;

import java.util.Objects;

public class Vopsit extends Serviciu {
	
  private String tipVopsire; //nuantare, suvite, decolorare
     private String culoare;
	public String getTipVopsire() {
		return tipVopsire;
	}
	public void setTipVopsire(String tipVopsire) {
		this.tipVopsire = tipVopsire;
	}
	public String getCuloare() {
		return culoare;
	}
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	public Vopsit(Integer idServiciu, String denServiciu, Double pretServiciu, String tipVopsire, String culoare) {
		super(idServiciu, denServiciu, pretServiciu);
		this.tipVopsire = tipVopsire;
		this.culoare = culoare;
	}
	public Vopsit(String tipVopsire, String culoare) {
		super();
		this.tipVopsire = tipVopsire;
		this.culoare = culoare;
	}
	public Vopsit(Integer idServiciu, String denServiciu, Double pretServiciu) {
		super(idServiciu, denServiciu, pretServiciu);
	}
	public Vopsit() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(culoare, tipVopsire);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vopsit other = (Vopsit) obj;
		return Objects.equals(culoare, other.culoare) && Objects.equals(tipVopsire, other.tipVopsire);
	}
	@Override
	public String toString() {
		return "Vopsit [tipVopsire=" + tipVopsire + ", culoare=" + culoare + "]";
	}
    
     
     
}