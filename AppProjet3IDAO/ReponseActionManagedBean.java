
package fr.eql.ai108.jee.appdemande.web.controller;

import java.time.LocalDate;
import java.util.ArrayList;
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
import fr.eql.ai108.jee.ibusiness.api.ReponseActionIBusiness;

@ManagedBean(name = "mbReponseAction")
@RequestScoped
public class ReponseActionManagedBean{
	
	private List<ReponseAction> reponses;
	private LocalDate filtreDateFin;
	private String ville;
	private String activite;
	private LocalDate filtreDateDebut;
	
	
	@EJB
	private ReponseActionIBusiness proxyReponseBu;
	
	@ManagedProperty (value = "#{mbConnect.user}")
	private User userConnected;
	
	public void saveResponse(Demande demande) {
		ReponseAction reponseAction = new ReponseAction();
		reponseAction.setDateReponse(LocalDate.now());
		reponseAction.setDemande(demande);
		reponseAction.setUser(userConnected);
		proxyReponseBu.addResponse(reponseAction);
	}
	
	@PostConstruct
	public void init() {
	}

	public ReponseActionIBusiness getProxyReponseBu() {
		return proxyReponseBu;
	}

	public void setProxyReponseBu(ReponseActionIBusiness proxyReponseBu) {
		this.proxyReponseBu = proxyReponseBu;
	}

	public User getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
	}

	public List<ReponseAction> getReponses() {
		return reponses;
	}

	public void setReponses(List<ReponseAction> reponses) {
		this.reponses= reponses;
	}
	public LocalDate getFiltreDateFin() {
		return filtreDateFin;
	}

	public void setFiltreDateFin(LocalDate filtreDateFin) {
		this.filtreDateFin = filtreDateFin;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public LocalDate getFiltreDateDebut() {
		return filtreDateDebut;
	}

	public void setFiltreDateDebut(LocalDate filtreDateDebut) {
		this.filtreDateDebut = filtreDateDebut;
	}
}