package com.agence.voiture.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agence.voiture.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, String> {

}
