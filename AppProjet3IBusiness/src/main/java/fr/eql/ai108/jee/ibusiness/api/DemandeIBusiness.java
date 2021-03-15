package fr.eql.ai108.jee.ibusiness.api;

import java.util.Date;
import java.util.List;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.entity.User;


public interface DemandeIBusiness {
	List<Demande> displayDemande();
	List<ReponseAction> displayVolunteers(int idDemande);
}
