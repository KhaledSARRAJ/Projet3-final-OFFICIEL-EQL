package fr.eql.ai108.jee.ibusiness.api;


import java.time.LocalDate;

import java.util.List;

import fr.eql.ai108.jee.entity.Demande;

import fr.eql.ai108.jee.entity.ReponseAction;

import fr.eql.ai108.jee.entity.User;


public interface DemandeIBusiness {
	List<Demande> displayDemande(Integer userId, String labelActivite, String labelVille, LocalDate dateDebut, LocalDate dateFin);
	List<Demande> displayDemandeTri(Demande demande);
	boolean addDemand(Demande demande);

	List<Demande> displayByReponseUser(User user);

	List<ReponseAction> displayVolunteers(int idDemande);
	List<Demande> getDemandesNonPourvues(int idUser);
	List<Demande> getDemandesPourvues(int idUser);
	Demande updateDemand(Demande demande);
	void deleteDemand(Demande demande);


}
