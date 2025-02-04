package org.entity;

import java.util.Objects;

public class Programare {
  private Integer idProgramare;
  private String tipProgramare; //urgenta, de intretinere
public Integer getIdProgramare() {
	return idProgramare;
}
public void setIdProgramare(Integer idProgramare) {
	this.idProgramare = idProgramare;
}
public String getTipProgramare() {
	return tipProgramare;
}
public void setTipProgramare(String tipProgramare) {
	this.tipProgramare = tipProgramare;
}
public Programare(Integer idProgramare, String tipProgramare) {
	super();
	this.idProgramare = idProgramare;
	this.tipProgramare = tipProgramare;
}
public Programare() {
	super();
}
@Override
public int hashCode() {
	return Objects.hash(idProgramare, tipProgramare);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Programare other = (Programare) obj;
	return Objects.equals(idProgramare, other.idProgramare) && Objects.equals(tipProgramare, other.tipProgramare);
}
@Override
public String toString() {
	return "Programare [idProgramare=" + idProgramare + ", tipProgramare=" + tipProgramare + "]";
}
  
  
  
}
