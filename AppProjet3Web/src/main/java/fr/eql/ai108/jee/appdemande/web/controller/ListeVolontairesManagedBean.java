package fr.eql.ai108.jee.appdemande.web.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;
import fr.eql.ai108.jee.ibusiness.api.ReponseIBusiness;

@ManagedBean(name = "mbListeVolontaires")
@SessionScoped
public class ListeVolontairesManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<ReponseAction> volunteers;
	
	@EJB
	private DemandeIBusiness proxyDemandeBu;
	
	@EJB
	private ReponseIBusiness proxyReponseBu;
	
	public String getVolunteers(Demande demande) {
		volunteers = proxyDemandeBu.displayVolunteers(demande.getId());
		return "/listeVolontaires.xhtml?faces-redirect=true";  
	}
	
	public String selectVolunteer(ReponseAction reponse) {
		Date date = new Date(System.currentTimeMillis());
		reponse.setDateSelection(date);
		proxyReponseBu.selectVolunteer(reponse);
		return "/listeDemandes.xhtml?faces-redirect=true"; 
	}

	public List<ReponseAction> getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(List<ReponseAction> volunteers) {
		this.volunteers = volunteers;
	}

}
