package org.entity;

import java.util.Objects;

public class Makeup extends Serviciu {
 private String tipMachiaj; // de zi, de seara 

public String getTipMachiaj() {
	return tipMachiaj;
}

public void setTipMachiaj(String tipMachiaj) {
	this.tipMachiaj = tipMachiaj;
}

public Makeup(Integer idServiciu, String denServiciu, Double pretServiciu, String tipMachiaj) {
	super(idServiciu, denServiciu, pretServiciu);
	this.tipMachiaj = tipMachiaj;
}

public Makeup(String tipMachiaj) {
	super();
	this.tipMachiaj = tipMachiaj;
}

public Makeup(Integer idServiciu, String denServiciu, Double pretServiciu) {
	super(idServiciu, denServiciu, pretServiciu);
}

public Makeup() {
	super();
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(tipMachiaj);
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
	Makeup other = (Makeup) obj;
	return Objects.equals(tipMachiaj, other.tipMachiaj);
}

@Override
public String toString() {
	return "Makeup [tipMachiaj=" + tipMachiaj + "]";
}
 
 
}