package org.entity;

import java.util.Objects;

public class Coafat extends Serviciu {

private String tipCoafat;//de ocazie, uzual

public String getTipCoafat() {
	return tipCoafat;
}

public void setTipCoafat(String tipCoafat) {
	this.tipCoafat = tipCoafat;
}

public Coafat(Integer idServiciu, String denServiciu, Double pretServiciu, String tipCoafat) {
	super(idServiciu, denServiciu, pretServiciu);
	this.tipCoafat = tipCoafat;
}

public Coafat(String tipCoafat) {
	super();
	this.tipCoafat = tipCoafat;
}

public Coafat(Integer idServiciu, String denServiciu, Double pretServiciu) {
	super(idServiciu, denServiciu, pretServiciu);
}

public Coafat() {
	super();
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(tipCoafat);
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
	Coafat other = (Coafat) obj;
	return Objects.equals(tipCoafat, other.tipCoafat);
}

@Override
public String toString() {
	return "Coafat [tipCoafat=" + tipCoafat + "]";
}



}
