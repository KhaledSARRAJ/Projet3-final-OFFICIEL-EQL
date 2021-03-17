package fr.eql.ai108.jee.ibusiness.api;

import java.util.List;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.User;


public interface DemandeIBusiness {
	List<Demande> displayDemande();
	boolean addDemand(Demande demande);
	List<Demande> displayByReponseUser(User user);
}
