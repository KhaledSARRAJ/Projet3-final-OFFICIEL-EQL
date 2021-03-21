package fr.eql.ai108.jee.appdemande.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;

@ManagedBean(name = "mbConsultDemande")
@RequestScoped
public class ConsultationDemandesUser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private DemandeIBusiness proxyDemandeBu;
	
	@ManagedProperty(value ="#{mbConnect.user}")
	private User userConnected;
	
	private List<Demande> demandesNonPourvues;
	private List<Demande> demandesPourvues;
	private Demande selectedDemande;
	
	@PostConstruct
	public void init() {
		demandesNonPourvues = proxyDemandeBu.getDemandesNonPourvues(userConnected.getId());
		demandesPourvues = proxyDemandeBu.getDemandesPourvues(userConnected.getId());
	}

	public String chooseVolunteer(Demande demande) {
		selectedDemande = demande;
		return "/listeVolontaires.xhtml?faces-redirect=true";
	}

	public User getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
	}

	public List<Demande> getDemandesNonPourvues() {
		return demandesNonPourvues;
	}

	public void setDemandesNonPourvues(List<Demande> demandesNonPourvues) {
		this.demandesNonPourvues = demandesNonPourvues;
	}

	public List<Demande> getDemandesPourvues() {
		return demandesPourvues;
	}

	public void setDemandesPourvues(List<Demande> demandesPourvues) {
		this.demandesPourvues = demandesPourvues;
	}

	public Demande getSelectedDemande() {
		return selectedDemande;
	}

	public void setSelectedDemande(Demande selectedDemande) {
		this.selectedDemande = selectedDemande;
	}

	public DemandeIBusiness getProxyDemandeBu() {
		return proxyDemandeBu;
	}

	public void setProxyDemandeBu(DemandeIBusiness proxyDemandeBu) {
		this.proxyDemandeBu = proxyDemandeBu;
	}
}
