
package fr.eql.ai108.jee.appdemande.web.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.ProbDemande;
import fr.eql.ai108.jee.entity.TypeFinalisation;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;
import fr.eql.ai108.jee.ibusiness.api.ProbDemandeIBusiness;
import fr.eql.ai108.jee.ibusiness.api.TypeFinalisationIBusiness;

@ManagedBean(name = "mbCloture")
@SessionScoped
public class ClotureManagedBean implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@EJB
	private DemandeIBusiness proxyDemandeBu;
	
	@EJB
	private ProbDemandeIBusiness proxyProbDemandeBu;
	
	@EJB
	private TypeFinalisationIBusiness proxyTypeFinalisation;
	

	private Demande selectedDemande;
	private List<TypeFinalisation> typeFinalisations;
	private List<ProbDemande> probDemandes;
	
	@PostConstruct
	public void init() {
		typeFinalisations = proxyTypeFinalisation.displayTypeFinalisation();
		probDemandes = proxyProbDemandeBu.displayProbDemande();
	}

	//Méthode pour afficher page cloture demande
	public String clotureDemand(Demande demPourvue) {
	selectedDemande = demPourvue;
	return "/finalisation.xhtml?faces-redirect=true";
	}
	
	//Méthode pour enregistrer la cloture
	public String saveCloture() {
		proxyDemandeBu.clotureDemand(selectedDemande);
		return "/listeDemandes.xhtml?faces-redirect=true";
	}

	public Demande getSelectedDemande() {
		return selectedDemande;
	}

	public void setSelectedDemande(Demande selectedDemande) {
		this.selectedDemande = selectedDemande;
	}

	public List<TypeFinalisation> getTypeFinalisations() {
		return typeFinalisations;
	}

	public void setTypeFinalisations(List<TypeFinalisation> typeFinalisations) {
		this.typeFinalisations = typeFinalisations;
	}

	public List<ProbDemande> getProbDemandes() {
		return probDemandes;
	}

	public void setProbDemandes(List<ProbDemande> probDemandes) {
		this.probDemandes = probDemandes;
	}
}

