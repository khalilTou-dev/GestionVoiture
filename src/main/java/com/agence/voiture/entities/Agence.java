package com.agence.voiture.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Agence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAge;
	private String nomAge;
	private String descriptionAge;
	@JsonIgnore
	@OneToMany(mappedBy = "agence")
	private List<Voiture> voitures;

	public Agence(String nomAge, String descriptionAge, List<Voiture> voitures) {
		super();
		this.nomAge = nomAge;
		this.descriptionAge = descriptionAge;
		this.voitures = voitures;
	}

	public Long getIdAge() {
		return idAge;
	}

	public void setIdAge(Long idAge) {
		this.idAge = idAge;
	}

	public String getNomAge() {
		return nomAge;
	}

	public void setNomAge(String nomAge) {
		this.nomAge = nomAge;
	}

	public String getDescriptionAge() {
		return descriptionAge;
	}

	public void setDescriptionAge(String descriptionAge) {
		this.descriptionAge = descriptionAge;
	}

	public List<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}
	
	
	
}
