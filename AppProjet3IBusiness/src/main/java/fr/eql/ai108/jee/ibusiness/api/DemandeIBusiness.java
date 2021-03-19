package fr.eql.ai108.jee.ibusiness.api;

import java.time.LocalDate;
import java.util.List;

import fr.eql.ai108.jee.entity.Demande;


public interface DemandeIBusiness {
	List<Demande> displayDemande(Integer userId, String labelActivite, String labelVille, LocalDate dateDebut, LocalDate dateFin);
	List<Demande> displayDemandeTri(Demande demande);
	boolean addDemand(Demande demande);
}
