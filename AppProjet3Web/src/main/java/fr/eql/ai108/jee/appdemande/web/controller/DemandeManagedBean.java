package fr.eql.ai108.jee.appdemande.web.controller;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;



@ManagedBean (name = "mbDemande")
@RequestScoped
public class DemandeManagedBean {
	
	private List<Demande> demandes;
	private Demande demande = new Demande();
	private String message;
	
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
	
	
	public String updateDemande() {
		demande = proxyDemandeBu.updateDemande(demande);
		if(demande == null) {
			message = "Cette demande a déjà été annulée.";
		}else {
			message ="La demande a bien été annulée.";
		}
		demande = new Demande();
		return"/connectedView.xhtml?faces-redirect=true";
	}
	
	
	

}
