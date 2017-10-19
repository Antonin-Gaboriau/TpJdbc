package fr.univ_amu.iut.beans;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class Module implements Serializable{
	private String code;
	private String libelle;
	private int hCoursPrev;
	private int hCoursRea;
	private int hTpPrev;
	private int hTpRea;
	private String discipline;
	private int coefTest;
	private int coefCc;
	private Prof responsable;
	private Module pere;
	private Collection<Prof> specialistes;
	
	public Module() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Module module = (Module) o;

		if (hCoursPrev != module.hCoursPrev) return false;
		if (hCoursRea != module.hCoursRea) return false;
		if (hTpPrev != module.hTpPrev) return false;
		if (hTpRea != module.hTpRea) return false;
		if (coefTest != module.coefTest) return false;
		if (coefCc != module.coefCc) return false;
		if (code != null ? !code.equals(module.code) : module.code != null) return false;
		if (libelle != null ? !libelle.equals(module.libelle) : module.libelle != null) return false;
		if (discipline != null ? !discipline.equals(module.discipline) : module.discipline != null) return false;
		if (responsable != null ? !responsable.equals(module.responsable) : module.responsable != null) return false;
		if (pere != null ? !pere.equals(module.pere) : module.pere != null) return false;
		return specialistes != null ? specialistes.equals(module.specialistes) : module.specialistes == null;
	}

	@Override
	public int hashCode() {
		int result = code != null ? code.hashCode() : 0;
		result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
		result = 31 * result + hCoursPrev;
		result = 31 * result + hCoursRea;
		result = 31 * result + hTpPrev;
		result = 31 * result + hTpRea;
		result = 31 * result + (discipline != null ? discipline.hashCode() : 0);
		result = 31 * result + coefTest;
		result = 31 * result + coefCc;
		result = 31 * result + (responsable != null ? responsable.hashCode() : 0);
		result = 31 * result + (pere != null ? pere.hashCode() : 0);
		result = 31 * result + (specialistes != null ? specialistes.hashCode() : 0);
		return result;
	}

	public String getCode() {
		return code;
	}

	public int getCoefCc() {
		return coefCc;
	}

	public int getCoefTest() {
		return coefTest;
	}

	public String getDiscipline() {
		return discipline;
	}

	public int gethCoursPrev() {
		return hCoursPrev;
	}

	public int gethCoursRea() {
		return hCoursRea;
	}

	public int gethTpPrev() {
		return hTpPrev;
	}

	public int gethTpRea() {
		return hTpRea;
	}

	public String getLibelle() {
		return libelle;
	}

	public Module getPere() {
		return pere;
	}

	public Prof getResponsable() {
		return responsable;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCoefCc(int coefCc) {
		this.coefCc = coefCc;
	}

	public void setCoefTest(int coeffTest) {
		this.coefTest = coeffTest;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public void sethCoursPrev(int hCoursPrev) {
		this.hCoursPrev = hCoursPrev;
	}

	public void sethCoursRea(int hCoursRea) {
		this.hCoursRea = hCoursRea;
	}

	public void sethTpPrev(int hTpPrev) {
		this.hTpPrev = hTpPrev;
	}

	public void sethTpRea(int hTpRea) {
		this.hTpRea = hTpRea;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setPere(Module pere) {
		this.pere = pere;
	}

	public void setResponsable(Prof responsable) {
		this.responsable = responsable;
	}

	public Collection<Prof> getSpecialistes() {
		return specialistes;
	}
	
	@Override
	public String toString() {
		return "Module [" + (code != null ? "code=" + code + ", " : "")
				+ (libelle != null ? "libelle=" + libelle + ", " : "")
				+ "hCoursPrev=" + hCoursPrev + ", hCoursRea=" + hCoursRea
				+ ", hTpPrev=" + hTpPrev + ", hTpRea=" + hTpRea + ", "
				+ (discipline != null ? "discipline=" + discipline + ", " : "")
				+ "coeffTest=" + coefTest + ", coefCc=" + coefCc + ", "
				+ (responsable != null ? "responsable=" + responsable.getNomProf() + ", " : "")
				+ (pere != null ? "pere=" + pere.getCode() : "") + "]";
	}
}
