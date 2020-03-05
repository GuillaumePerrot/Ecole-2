package fr.adaming.model;

import java.sql.Date;

public class Salarie {

	private Date dateEmb;
	private double salaire;
	
	public Salarie(Date dateEmb, double salaire) {
		super();
		this.dateEmb = dateEmb;
		this.salaire = salaire;
	}

	public Salarie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDateEmb() {
		return dateEmb;
	}

	public void setDateEmb(Date dateEmb) {
		this.dateEmb = dateEmb;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Salarie [dateEmb=" + dateEmb + ", salaire=" + salaire + "]";
	}
	
}
