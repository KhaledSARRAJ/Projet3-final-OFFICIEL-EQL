package fr.eql.ai108.jee.appdemande.web.controller;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;
import fr.eql.ai108.jee.ibusiness.api.ReponseIBusiness;

@ManagedBean(name = "mbListeVolontaires")
@RequestScoped
public class ListeVolontairesManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//@ManagedProperty(value = "#{mbDemande.selectedDemande}")
	private Demande demande = new Demande();
	
	//@ManagedProperty(value = "#{mbConnect.user}")
	private User user = new User();
	
	private List<ReponseAction> volunteers;
	
	@EJB
	private DemandeIBusiness proxyDemandeBu;
	
	@EJB
	private ReponseIBusiness proxyReponseBu;
	
	@PostConstruct
	public void getListVolunteers() {
		//volunteers = proxyDemandeBu.displayVolunteers(demande.getId());
		volunteers = proxyDemandeBu.displayVolunteers(1);
	}
	
	public void selectVolunteer(ReponseAction reponse) {
		Date date = new Date(System.currentTimeMillis());
		reponse.setDateSelection(date);
		proxyReponseBu.selectVolunteer(reponse);
	}
	
	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	public List<ReponseAction> getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(List<ReponseAction> volunteers) {
		this.volunteers = volunteers;
	}

}
