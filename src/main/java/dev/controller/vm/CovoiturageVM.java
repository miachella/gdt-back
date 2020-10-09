package dev.controller.vm;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CovoiturageVM {

	@Future
	private LocalDate date;
	@NotNull
	private LocalTime heureDepart;
	@NotNull
	private LocalTime heureArrive;

	@NotBlank
	@NotNull
	private String depart;
	@NotBlank
	@NotNull
	private String destination;
	@NotNull
	private Integer vehiculeId;
	@NotNull
	private Long chauffeurId;
	private List<Integer> passagersId;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(LocalTime heureDepart) {
		this.heureDepart = heureDepart;
	}

	public LocalTime getHeureArrive() {
		return heureArrive;
	}

	public void setHeureArrive(LocalTime heureArrive) {
		this.heureArrive = heureArrive;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getVehiculeId() {
		return vehiculeId;
	}

	public void setVehiculeId(Integer vehiculeId) {
		this.vehiculeId = vehiculeId;
	}

	public Long getChauffeurId() {
		return chauffeurId;
	}

	public void setChauffeurId(Long chauffeurId) {
		this.chauffeurId = chauffeurId;
	}

	public List<Integer> getPassagersId() {
		return passagersId;
	}

	public void setPassagersId(List<Integer> passagersId) {
		this.passagersId = passagersId;
	}

}
