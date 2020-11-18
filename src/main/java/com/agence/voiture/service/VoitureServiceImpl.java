package com.agence.voiture.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.agence.voiture.entities.Agence;
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

	

	@Override
	public Page<Voiture> getAllVoituresParPage(int page, int size) {
		return VoitureRepository.findAll(PageRequest.of(page, size));
	}
	

	@Override
	public List<Voiture> findByMarqueVoitContains(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voiture> findByMarquePrix(String marque, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voiture> findByAgence(Agence agence) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voiture> findByAgenceIdAge(Long id) {
		// TODO Auto-generated method stub
		return VoitureRepository.findByAgenceIdAge(id);
	}

	@Override
	public List<Voiture> findByOrderByMarqueVoitAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voiture> findByMarqueVoit(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voiture> trierVoituresMarquePrix() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
