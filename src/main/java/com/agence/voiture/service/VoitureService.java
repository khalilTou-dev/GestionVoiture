package com.agence.voiture.service;

import java.util.List;

import com.agence.voiture.entities.Voiture;

public interface VoitureService {
	Voiture saveVoiture(Voiture v);
	Voiture updateVoiture(Voiture v);
	void deleteVoiture(Voiture v);
	void deleteVoitureById(String id);
	Voiture getVoiture(String id);
	List<Voiture> getAllVoitures();

}
