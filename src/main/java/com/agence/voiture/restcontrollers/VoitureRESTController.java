package com.agence.voiture.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agence.voiture.entities.Voiture;
import com.agence.voiture.service.VoitureService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VoitureRESTController {
	@Autowired
	VoitureService voitureService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Voiture> getAllVoitures() {
		return voitureService.getAllVoitures();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Voiture getProduitById(@PathVariable("id") String id) {
		return voitureService.getVoiture(id);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Voiture createVoiture(@RequestBody Voiture voiture) {
	return voitureService.saveVoiture(voiture);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Voiture updateVoiture(@RequestBody Voiture voiture) {
	return voitureService.updateVoiture(voiture);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVoiture(@PathVariable("id") String id)
	{
		voitureService.deleteVoitureById(id);
	}
	@RequestMapping(value="/voitsage/{idAge}",method = RequestMethod.GET)
	public List<Voiture> getVoituresByAgeId(@PathVariable("idAge") Long idAge) {
	return voitureService.findByAgenceIdAge(idAge);
	}
}