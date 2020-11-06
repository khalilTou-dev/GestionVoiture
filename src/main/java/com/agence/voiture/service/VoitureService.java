package com.agence.voiture.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.agence.voiture.entities.Agence;
import com.agence.voiture.entities.Voiture;

public interface VoitureService {
	Voiture saveVoiture(Voiture v);

	Voiture updateVoiture(Voiture v);

	void deleteVoiture(Voiture v);

	void deleteVoitureById(String id);

	Voiture getVoiture(String id);

	List<Voiture> getAllVoitures();

	Page<Voiture> getAllVoituresParPage(int page, int size);
	
	List<Voiture> findByMarqueVoit(String nom);

	List<Voiture> findByMarqueVoitContains(String nom);

	List<Voiture> findByMarquePrix(String marque, Double prix);

	List<Voiture> findByAgence(Agence agence);

	List<Voiture> findByAgenceIdAge(Long id);

	List<Voiture> findByOrderByMarqueVoitAsc();
	
	List<Voiture> trierVoituresMarquePrix ();


}
