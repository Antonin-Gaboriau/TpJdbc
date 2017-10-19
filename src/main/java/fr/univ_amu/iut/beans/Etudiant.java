package fr.univ_amu.iut.beans;

import java.io.Serializable;

public class Etudiant implements Serializable {

	private int numEt;
	private String nomEt;
	private String prenomEt;
	private String cpEt;
	private String villeEt;
	
	private int annee;
	private int groupe;

	public Etudiant() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Etudiant etudiant = (Etudiant) o;

		if (numEt != etudiant.numEt) return false;
		if (annee != etudiant.annee) return false;
		if (groupe != etudiant.groupe) return false;
		if (nomEt != null ? !nomEt.equals(etudiant.nomEt) : etudiant.nomEt != null) return false;
		if (prenomEt != null ? !prenomEt.equals(etudiant.prenomEt) : etudiant.prenomEt != null) return false;
		if (cpEt != null ? !cpEt.equals(etudiant.cpEt) : etudiant.cpEt != null) return false;
		return villeEt != null ? villeEt.equals(etudiant.villeEt) : etudiant.villeEt == null;
	}

	@Override
	public int hashCode() {
		int result = numEt;
		result = 31 * result + (nomEt != null ? nomEt.hashCode() : 0);
		result = 31 * result + (prenomEt != null ? prenomEt.hashCode() : 0);
		result = 31 * result + (cpEt != null ? cpEt.hashCode() : 0);
		result = 31 * result + (villeEt != null ? villeEt.hashCode() : 0);
		result = 31 * result + annee;
		result = 31 * result + groupe;
		return result;
	}

	public Etudiant(int numEt, String nomEt, String prenomEt, String cpEt,
					String villeEt, int annee, int groupe) {
		this.numEt = numEt;
		this.nomEt = nomEt;
		this.prenomEt = prenomEt;
		this.cpEt = cpEt;
		this.villeEt = villeEt;
		this.annee = annee;
		this.groupe = groupe;
	}

	public int getAnnee() {
		return annee;
	}

	public String getCpEt() {
		return cpEt;
	}

	public int getGroupe() {
		return groupe;
	}

	public String getNomEt() {
		return nomEt;
	}

	public int getNumEt() {
		return numEt;
	}

	public String getPrenomEt() {
		return prenomEt;
	}

	public String getVilleEt() {
		return villeEt;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public void setCpEt(String cpEt) {
		this.cpEt = cpEt;
	}

	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}

	public void setNomEt(String nomEt) {
		this.nomEt = nomEt;
	}

	public void setNumEt(int numEt) {
		this.numEt = numEt;
	}

	public void setPrenomEt(String prenomEt) {
		this.prenomEt = prenomEt;
	}

	public void setVilleEt(String villeEt) {
		this.villeEt = villeEt;
	}

	@Override
	public String toString() {
		return "Etudiant [numEt=" + numEt + ", "
				+ (nomEt != null ? "nomEt=" + nomEt + ", " : "")
				+ (prenomEt != null ? "prenomEt=" + prenomEt + ", " : "")
				+ (cpEt != null ? "cpEt=" + cpEt + ", " : "")
				+ (villeEt != null ? "villeEt=" + villeEt + ", " : "")
				+ "annee=" + annee + ", groupe=" + groupe + ", "
				+ "]";
	}
}
