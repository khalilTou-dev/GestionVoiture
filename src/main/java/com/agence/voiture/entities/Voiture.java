package com.agence.voiture.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Voiture {
	@Id
	private String matriculeVoit;
	@NotNull
	@Size (min = 3,max = 15)
	private String marqueVoit;
	
	@Min(value = 5000)
	@Max(value = 1000000)
	private Double prixVoit;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private Date dateRelease;
	
	@ManyToOne
	private Agence agence;
	
	
	public Voiture(String matriculeVoit, String marqueVoit, Double prixVoit, Date dateRelease) {
		super();
		this.matriculeVoit = matriculeVoit;
		this.marqueVoit = marqueVoit;
		this.prixVoit = prixVoit;
		this.dateRelease = dateRelease;
	}
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMatriculeVoit() {
		return matriculeVoit;
	}
	public void setMatriculeVoit(String matriculeVoit) {
		this.matriculeVoit = matriculeVoit;
	}
	public String getMarqueVoit() {
		return marqueVoit;
	}
	public void setMarqueVoit(String marqueVoit) {
		this.marqueVoit = marqueVoit;
	}
	public Double getPrixVoit() {
		return prixVoit;
	}
	public void setPrixVoit(Double prixVoit) {
		this.prixVoit = prixVoit;
	}
	public Date getDateRelease() {
		return dateRelease;
	}
	public void setDateRelease(Date dateRelease) {
		this.dateRelease = dateRelease;
	}
	@Override
	public String toString() {
		return "Voiture [matriculeVoit=" + matriculeVoit + ", marqueVoit=" + marqueVoit + ", prixVoit=" + prixVoit
				+ ", dateRelease=" + dateRelease + "]";
	}

	
	
}
