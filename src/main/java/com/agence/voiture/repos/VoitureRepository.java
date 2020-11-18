package com.agence.voiture.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.agence.voiture.entities.Agence;
import com.agence.voiture.entities.Voiture;

@RepositoryRestResource(path = "rest")
public interface VoitureRepository extends JpaRepository<Voiture, String> {
	List<Voiture> findByMarqueVoit(String nom);
	List<Voiture> findByMarqueVoitContains(String nom);
	
	/*@Query("select v from Voiture v where v.marqueVoit like %?1 and v.prixVoit > ?2") 
	List<Voiture> findByMarquePrix (String marque, Double prix);*/
	
	@Query("select v from Voiture v where v.marqueVoit like %:marque and v.prixVoit > :prix")
	List<Voiture> findByMarquePrix (@Param("marque") String nom,@Param("prix") Double prix);
	
	@Query("select v from Voiture v where v.agence = ?1") 
	List<Voiture> findByAgence (Agence agence);
	
	List<Voiture> findByAgenceIdAge(Long id);
	
	List<Voiture> findByOrderByMarqueVoitAsc();
	
	@Query("select v from Voiture v order by v.marqueVoit ASC, v.prixVoit DESC")
	List<Voiture> trierVoituresMarquePrix ();
}
