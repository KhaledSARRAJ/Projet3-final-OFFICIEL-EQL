
package fr.eql.ai108.jee.appdemande.web.controller;

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
	
	@EJB
	private ReponseActionIBusiness proxyReponseBu;
	
	
	@ManagedProperty (value = "#{mbConnect.user}")
	private User userConnected;
	
	//To do: ajouter l'user dans la reponseAction une fois que la connection sera opérationnelle
	public void saveResponse(Demande demande) {
		
		ReponseAction reponseAction = new ReponseAction();
		reponseAction.setDateReponse(new Date());
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
}