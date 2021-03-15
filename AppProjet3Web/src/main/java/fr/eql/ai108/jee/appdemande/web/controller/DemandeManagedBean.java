package fr.eql.ai108.jee.appdemande.web.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;



@ManagedBean (name = "mbDemande")
@RequestScoped
public class DemandeManagedBean {
	
	private List<Demande> demandes;
	private Demande selectedDemande;
	
	@EJB
	private DemandeIBusiness proxyDemandeBu;
	
	@PostConstruct
	public void init() {
		demandes = proxyDemandeBu.displayDemande();
	}

	public List<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}

	public Demande getSelectedDemande() {
		return selectedDemande;
	}

	public void setSelectedDemande(Demande selectedDemande) {
		this.selectedDemande = selectedDemande;
	}
	
}
