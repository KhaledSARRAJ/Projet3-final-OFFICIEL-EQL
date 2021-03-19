package fr.eql.ai108.jee.appdemande.web.controller;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;

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
	
	@ManagedProperty (value = "#{mbConnect.user}")
	private User userConnected;
	
	private List<Demande> demandes;

	private Demande demande = new Demande();
	private List<Ville> villes;
	private List<Activite> activites;
	private List<Heure> heures;
	private List<Minute> minutes;
	private String message = "";
	
	
	@NotNull(message = "L'adresse ne peut pas être vide") 
	private String adresse;

	private Demande selectedDemande;
	
	public void printSelectedDemande() {
		System.out.println(selectedDemande.toString());
	}
	
	public String cancelDemand(Demande demandeCanceled) {
		proxyDemandeBu.deleteDemand(demandeCanceled);
		//message = "Votre demande a bien été annulée.";
		return "/connectedView.xhtml?faces-redirect=true";
	}

	public String updateDemand(Demande demandeUpdated) {
		//message = "Votre demande a bien été modifiée.";
		demande = demandeUpdated;
	return "/updatingDemandForm.xhtml?faces-redirect=true";
	}

	public String confirmUpdate() {
		proxyDemandeBu.updateDemand(demande);
	return "/connectedView.xhtml?faces-redirect=true";
	}

	
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
		//ajoute de la date de soumission
		 demande.setDateSoumission(LocalDate.now());
		 demande.setVoieAction(adresse);
		 //valeur temporaire, dépendra de la personne inscrite

		 demande.setUser(userConnected);
		 System.out.println(demande.getDateAction());
		 //Appel de la fonction d'ajout à la base de données
		 boolean resultat = proxyDemandeBu.addDemand(demande);
		 //affichage d;un message selon les résultat de l'ajout
		 if(resultat) {
			 message = "Enregistrement réussi de votre demande";
			 demande = new Demande();
			 demande.setDateAction(LocalDate.now());
			 adresse = "";
			 
		 } else {
			 message = "Vous avez déjà enregistré cette demande";
			 demande.setDateAction(LocalDate.now());
		 }
		return "/demandForm.xhtml?faces-redirect=true";
	}
	
	//Fonction liée à l'appel Ajax, permet à l'utilisateur de mettre son adresse directement dans le formulaure
	public void copyAdress() {
		this.setAdresse(userConnected.getVoieUtil());
		demande.setVille(userConnected.getVille());
	}
	
	@PostConstruct
	public void init() {
		demandes = proxyDemandeBu.displayDemande();
		villes = proxyVilleBu.displayVille();
		activites = proxyActiviteBu.displayActivite();
		heures = proxyHeureBu.displayHeure();
		minutes = proxyMinuteBu.displayMinute();
		demande.setDateAction(LocalDate.now());
		
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Demande getSelectedDemande() {
		return selectedDemande;
	}

	public void setSelectedDemande(Demande selectedDemande) {
		this.selectedDemande = selectedDemande;
	}
	
}
