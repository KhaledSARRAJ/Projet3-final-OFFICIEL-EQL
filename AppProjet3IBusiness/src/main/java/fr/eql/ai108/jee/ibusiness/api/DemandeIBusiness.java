package fr.eql.ai108.jee.ibusiness.api;

import java.util.List;

import fr.eql.ai108.jee.entity.Demande;


public interface DemandeIBusiness {
	List<Demande> displayDemande();
	boolean addDemand(Demande demande);
}
