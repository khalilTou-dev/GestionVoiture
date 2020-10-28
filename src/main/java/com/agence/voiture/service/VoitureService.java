package com.agence.voiture.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.agence.voiture.entities.Voiture;

public interface VoitureService {
	Voiture saveVoiture(Voiture v);
	Voiture updateVoiture(Voiture v);
	void deleteVoiture(Voiture v);
	void deleteVoitureById(String id);
	Voiture getVoiture(String id);
	List<Voiture> getAllVoitures();
	Page<Voiture> getAllVoituresParPage(int page, int size);

}
