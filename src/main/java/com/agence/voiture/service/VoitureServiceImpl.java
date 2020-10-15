package com.agence.voiture.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agence.voiture.entities.Voiture;
import com.agence.voiture.repos.VoitureRepository;

@Service
public class VoitureServiceImpl implements VoitureService {

	@Autowired
	VoitureRepository VoitureRepository;
	@Override
	public Voiture saveVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return VoitureRepository.save(v);
	}

	@Override
	public Voiture updateVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return VoitureRepository.save(v);
	}

	@Override
	public void deleteVoiture(Voiture v) {
		// TODO Auto-generated method stub
		VoitureRepository.delete(v);
		
	}

	@Override
	public void deleteVoitureById(String id) {
		// TODO Auto-generated method stub
		VoitureRepository.deleteById(id);
	}

	@Override
	public Voiture getVoiture(String id) {
		// TODO Auto-generated method stub
		return VoitureRepository.findById(id).get();
	}

	@Override
	public List<Voiture> getAllVoitures() {
		// TODO Auto-generated method stub
		return VoitureRepository.findAll();
	}

}
