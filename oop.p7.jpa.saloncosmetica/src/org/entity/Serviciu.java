package org.entity;

import java.util.Objects;

public class Serviciu {
	private Integer idServiciu;
	private String denServiciu;
	private Double pretServiciu;
	
	public Integer getIdServiciu() {
		return idServiciu;
	}
	public void setIdServiciu(Integer idServiciu) {
		this.idServiciu = idServiciu;
	}
	public String getDenServiciu() {
		return denServiciu;
	}
	public void setDenServiciu(String denServiciu) {
		this.denServiciu = denServiciu;
	}
	public Double getPretServiciu() {
		return pretServiciu;
	}
	public void setPretServiciu(Double pretServiciu) {
		this.pretServiciu = pretServiciu;
	}
	public Serviciu(Integer idServiciu, String denServiciu, Double pretServiciu) {
		super();
		this.idServiciu = idServiciu;
		this.denServiciu = denServiciu;
		this.pretServiciu = pretServiciu;
	}
	public Serviciu() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(denServiciu, idServiciu, pretServiciu);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serviciu other = (Serviciu) obj;
		return Objects.equals(denServiciu, other.denServiciu) && Objects.equals(idServiciu, other.idServiciu)
				&& Objects.equals(pretServiciu, other.pretServiciu);
	}
	@Override
	public String toString() {
		return "Serviciu [idServiciu=" + idServiciu + ", denServiciu=" + denServiciu + ", pretServiciu=" + pretServiciu
				+ "]";
	}
	
	
}