package dev.dto;

public class ChauffeurDtoQuery {
	private Integer id;
	private String matricule;
	private String permis;
	private String telephone;
	private Integer collegueId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getPermis() {
		return permis;
	}

	public void setPermis(String permis) {
		this.permis = permis;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getCollegueId() {
		return collegueId;
	}

	public void setCollegueId(Integer collegueId) {
		this.collegueId = collegueId;
	}
}
