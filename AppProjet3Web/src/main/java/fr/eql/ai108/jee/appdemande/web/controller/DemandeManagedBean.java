package fr.eql.ai108.jee.appdemande.web.controller;


import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import fr.eql.ai108.jee.entity.Activite;
import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.Heure;
import fr.eql.ai108.jee.entity.Minute;
import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.entity.Ville;
import fr.eql.ai108.jee.ibusiness.api.ActiviteIBusiness;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;
import fr.eql.ai108.jee.ibusiness.api.HeureIBusiness;
import fr.eql.ai108.jee.ibusiness.api.MinuteIBusiness;
import fr.eql.ai108.jee.ibusiness.api.VilleIBusiness;



@ManagedBean (name = "mbDemande")
@SessionScoped
public class DemandeManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/*
	@ManagedProperty (value = "#{mbConnect.user}")
	*/
	private User userConnected = new User();
	
	private List<Demande> demandes;
	private Demande demande = new Demande();
	private List<Ville> villes;
	private List<Activite> activites;
	private List<Heure> heures;
	private List<Minute> minutes;
	private String date = "";
	private String message = "";
	
	@EJB
	private DemandeIBusiness proxyDemandeBu;
	
	@EJB
	private VilleIBusiness proxyVilleBu;
	
	@EJB
	private ActiviteIBusiness proxyActiviteBu;
	
	@EJB
	private HeureIBusiness proxyHeureBu;
	
	@EJB
	private MinuteIBusiness proxyMinuteBu;
	
	public String registerNewDemand() {
		message = demande.getVille().getLabelVille() + " et activite " + demande.getActivite().getLabelActivite() +" à " + demande.getHeureDebut() + "h"
				+ "rue " + demande.getVoieAction() + " le " + date;
		Date dateDemande = null;
		/*
		 try {
			System.out.println(date);
			dateDemande=new SimpleDateFormat("yyyy-MM-dd").parse(date);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		*/
		 //demande.setDateAction(dateDemande);
		 demande.setDateSoumission(new Date());
		 
		 userConnected.setId(1);
		 demande.setUser(userConnected);
		 proxyDemandeBu.addDemand(demande);
		return "/demandForm.xhtml?faces-redirect=true";
	}
	
	@PostConstruct
	public void init() {
		demandes = proxyDemandeBu.displayDemande();
		villes = proxyVilleBu.displayVille();
		activites = proxyActiviteBu.displayActivite();
		heures = proxyHeureBu.displayHeure();
		minutes = proxyMinuteBu.displayMinute();
		demande.setDateAction(new Date());
	}

	public List<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public List<Activite> getActivites() {
		return activites;
	}

	public void setActivites(List<Activite> activites) {
		this.activites = activites;
	}

	public List<Heure> getHeures() {
		return heures;
	}

	public void setHeures(List<Heure> heures) {
		this.heures = heures;
	}

	public List<Minute> getMinutes() {
		return minutes;
	}

	public void setMinutes(List<Minute> minutes) {
		this.minutes = minutes;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public User getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
	}

	
	
	
	
}
