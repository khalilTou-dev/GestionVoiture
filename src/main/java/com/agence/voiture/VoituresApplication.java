package com.agence.voiture;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.agence.voiture.entities.Voiture;
import com.agence.voiture.service.VoitureService;

@SpringBootApplication
public class VoituresApplication implements CommandLineRunner{

	@Autowired
	VoitureService voitureService;
	public static void main(String[] args) {
		SpringApplication.run(VoituresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		voitureService.saveVoiture(new Voiture("160 tunis 1522","Handai", 22600.0, new Date()));
		voitureService.saveVoiture(new Voiture("120 tunis 300","Ferrari", 52600.0, new Date()));
		voitureService.saveVoiture(new Voiture("200 tunis 1211","Ford", 32600.0, new Date()));		
	}

}
