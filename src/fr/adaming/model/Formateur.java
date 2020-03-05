package fr.adaming.model;

public class Formateur {

	private String matricule;

	public Formateur(String matricule) {
		super();
		this.matricule = matricule;
	}
	
	public Formateur() {
		super();
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Override
	public String toString() {
		return "Formateur [matricule=" + matricule + "]";
	}
	
}
