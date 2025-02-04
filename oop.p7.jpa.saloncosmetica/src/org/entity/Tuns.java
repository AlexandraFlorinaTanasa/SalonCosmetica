package org.entity;

import java.util.Objects;

public class Tuns extends Serviciu {
	
  private String tipTuns; //doar scurtat, tunsoare noua

public String getTipTuns() {
	return tipTuns;
}

public void setTipTuns(String tipTuns) {
	this.tipTuns = tipTuns;
}

public Tuns(Integer idServiciu, String denServiciu, Double pretServiciu, String tipTuns) {
	super(idServiciu, denServiciu, pretServiciu);
	this.tipTuns = tipTuns;
}

public Tuns(String tipTuns) {
	super();
	this.tipTuns = tipTuns;
}

public Tuns() {
	super();
}

public Tuns(Integer idServiciu, String denServiciu, Double pretServiciu) {
	super(idServiciu, denServiciu, pretServiciu);
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(tipTuns);
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
	Tuns other = (Tuns) obj;
	return Objects.equals(tipTuns, other.tipTuns);
}

@Override
public String toString() {
	return "Tuns [tipTuns=" + tipTuns + "]";
}
  


}