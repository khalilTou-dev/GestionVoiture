package com.agence.voiture.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {
	@Id
	private String matriculeVoit;
	private String marqueVoit;
	private Double prixVoit;
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
