package org.entity;

import java.util.Objects;

public class ManiPedi extends Serviciu {
 private String tipManichiura; // permanenta,semipermanenta, clasica, cu gel
 private String tipPedichiura;
 private String tratamente;
public String getTipManichiura() {
	return tipManichiura;
}
public void setTipManichiura(String tipManichiura) {
	this.tipManichiura = tipManichiura;
}
public String getTipPedichiura() {
	return tipPedichiura;
}
public void setTipPedichiura(String tipPedichiura) {
	this.tipPedichiura = tipPedichiura;
}
public String getTratamente() {
	return tratamente;
}
public void setTratamente(String tratamente) {
	this.tratamente = tratamente;
}
public ManiPedi(Integer idServiciu, String denServiciu, Double pretServiciu, String tipManichiura, String tipPedichiura,
		String tratamente) {
	super(idServiciu, denServiciu, pretServiciu);
	this.tipManichiura = tipManichiura;
	this.tipPedichiura = tipPedichiura;
	this.tratamente = tratamente;
}
public ManiPedi(String tipManichiura, String tipPedichiura, String tratamente) {
	super();
	this.tipManichiura = tipManichiura;
	this.tipPedichiura = tipPedichiura;
	this.tratamente = tratamente;
}
public ManiPedi(Integer idServiciu, String denServiciu, Double pretServiciu) {
	super(idServiciu, denServiciu, pretServiciu);
}
public ManiPedi() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(tipManichiura, tipPedichiura, tratamente);
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
	ManiPedi other = (ManiPedi) obj;
	return Objects.equals(tipManichiura, other.tipManichiura) && Objects.equals(tipPedichiura, other.tipPedichiura)
			&& Objects.equals(tratamente, other.tratamente);
}
@Override
public String toString() {
	return "ManiPedi [tipManichiura=" + tipManichiura + ", tipPedichiura=" + tipPedichiura + ", tratamente="
			+ tratamente + "]";
}



}
