package com.agence.voiture.controllers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agence.voiture.entities.Voiture;
import com.agence.voiture.service.VoitureService;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class VoitureController {
	
	@Autowired
	VoitureService voitureService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createVoiture";
	}
	@RequestMapping("/saveVoiture")
	public String saveVoiture(@ModelAttribute("voiture") Voiture voiture,
	@RequestParam("date") String date,ModelMap modelMap) throws ParseException{
		//conversion de la date
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf(date));
		voiture.setDateRelease(dateCreation);
		Voiture saveVoiture = voitureService.saveVoiture(voiture);
		String msg ="voiture enregistré avec Id "+saveVoiture.getMatriculeVoit();
		modelMap.addAttribute("msg", msg);
		return "createVoiture";
	}
	@RequestMapping("/ListeVoitures")
	public String listeProduits(ModelMap modelMap)
	{
		List<Voiture> voits = voitureService.getAllVoitures();
		modelMap.addAttribute("voitures", voits);
		return "listeVoitures";
	}
	@RequestMapping("/supprimerVoiture")
	public String supprimerProduit(@RequestParam("id") String id,
					ModelMap modelMap)
	{
	voitureService.deleteVoitureById(id);
	List<Voiture> voits = voitureService.getAllVoitures();
	modelMap.addAttribute("voitures", voits);
	return "listeVoitures";
	}
	@RequestMapping("/modifierVoiture")
	public String editerVoiture(@RequestParam("id") String id,ModelMap modelMap)
	{
		Voiture p= voitureService.getVoiture(id);
		modelMap.addAttribute("voiture", p);
		return "editerVoiture";
	}
	@RequestMapping("/updateVoiture")
	public String updateProduit(@ModelAttribute("voiture") Voiture voiture,
	@RequestParam("date") String date,
						  ModelMap modelMap) throws ParseException
	{
		//conversion de la date 
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf(date));
		voiture.setDateRelease(dateCreation);
		voitureService.updateVoiture(voiture);
		List<Voiture> voits = voitureService.getAllVoitures();
		modelMap.addAttribute("voitures", voits);
		return "listeVoitures";
	}
}
