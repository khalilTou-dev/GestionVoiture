package com.agence.voiture;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.agence.voiture.entities.Voiture;
import com.agence.voiture.repos.VoitureRepository;
import com.agence.voiture.service.VoitureService;

@SpringBootTest
class VoituresApplicationTests {
	@Autowired
	private VoitureRepository voitureRepository;
	@Autowired
	private VoitureService voitureService;
	@Test
	public void testCreateVoiture() {
		Voiture voit = new Voiture("180 Tunis 510","GOLF",22000.500,new Date());
		voitureRepository.save(voit);
	}
	@Test
	public void testFindVoiture()
	{ 
		Voiture v = voitureRepository.findById("210 Tunis 510").get(); 
		System.out.println(v);
	}
	@Test
	public void testUpdateVoiture()
	{ 
		Voiture v = voitureRepository.findById("210 Tunis 510").get();
		v.setPrixVoit(99000.0); 
		voitureRepository.save(v);
		System.out.println(v);

	}
	@Test
	public void testDeleteVoiture()
	{ 
		voitureRepository.deleteById("210 Tunis 510");;
	}
	@Test
	public void testListerTousVoiture()
	{
		List<Voiture> voits = voitureRepository.findAll();
		for (Voiture p : voits)
		{
			System.out.println(p);
		}
	}
	@Test
	public void testFindByMarqueVoitContains()
	{
		Page<Voiture> voits = voitureService.getAllVoituresParPage(0,2);
		System.out.println(voits.getSize());
		System.out.println(voits.getTotalElements()); System.out.println(voits.getTotalPages());
		voits.getContent().forEach(p -> {System.out.println(p.toString());
		});
		/*ou bien
		for (Produit p : prods)
		{
		System.out.println(p);
		} */
	}
}
