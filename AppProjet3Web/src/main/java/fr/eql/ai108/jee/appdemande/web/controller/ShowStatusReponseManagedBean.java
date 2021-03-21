package fr.eql.ai108.jee.appdemande.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.javatuples.Pair;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;
import fr.eql.ai108.jee.ibusiness.api.ReponseActionIBusiness;

@ManagedBean (name = "mbAffichageStatut")
@RequestScoped
public class ShowStatusReponseManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty (value = "#{mbConnect.user}")
	private User userConnected;
	
	private List<Demande> demandes;

	private List<Pair<Demande, String>> pairs;
	
	private List<String> demandeStatut;
	
	private Demande demande;
	
	
	@EJB
	private DemandeIBusiness proxyDemandeBu;
	
	@EJB
	private ReponseActionIBusiness proxyReponseActionBU;
	
	@PostConstruct
	public void init() {
		loadStatuses();
		
	}
	
	public void desist(ReponseAction reponseAction) {
		ReponseAction reponseMod =  proxyReponseActionBU.desistementReponse(reponseAction);
		System.out.println(reponseMod.toString());
		loadStatuses();
	}
	
	private void loadStatuses() {
		
		demandes = proxyDemandeBu.displayByReponseUser(userConnected);
		pairs = new ArrayList<Pair<Demande, String>>();
		demandeStatut = new ArrayList<String>();
		String statut;
		for (Demande demande : demandes) {
			statut = "";
			demande.toString();
			ReponseAction reponseAction = demande.getReponseAction().iterator().next();
			
			if(reponseAction.getDateDesistement()!=null) {
				statut = "Désisté";
			} else if (reponseAction.getDateRejet() != null) {
				statut = "Non sélectionné";
			} else if(reponseAction.getDateSelection() != null){
				statut = "Sélectionné";
			} else {
				statut = "En attente";
			}
			demandeStatut.add(statut);
			Pair<Demande, String> pair = new Pair<Demande, String>(demande, statut);
			pairs.add(pair);
			
		}
		
	}
	
	public void details(Demande demande) {
        this.demande = demande;
        System.out.println(demande.getVoieAction());
        System.out.println(demande.getUser().getVoieUtil());
	}

	public User getUserConnected() {
		return userConnected;
	}


	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
	}


	public List<Demande> getDemandes() {
		return demandes;
	}


	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}


	public List<String> getDemandeStatut() {
		return demandeStatut;
	}


	public void setDemandeStatut(List<String> demandeStatut) {
		this.demandeStatut = demandeStatut;
	}


	public List<Pair<Demande, String>> getPairs() {
		return pairs;
	}


	public void setPairs(List<Pair<Demande, String>> pairs) {
		this.pairs = pairs;
	}

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	



	
	

}
