
package fr.eql.ai108.jee.appdemande.web.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
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
	
	/*prendre le vrai user
	@ManagedProperty (value = "#{mbConnect.user}")
	private User userConnected;
	*/
	
	User fakeUser = new User();
	
	@PostConstruct
	public void init() {
		
	}
	
	//To do: ajouter l'user dans la reponseAction une fois que la connection sera opérationnelle
	public void saveResponse(Demande demande/*, User user*/) {
		//Insérer une réponse en BDD
		fakeUser.setId(1);
		
		ReponseAction reponseAction = new ReponseAction();
		reponseAction.setDateReponse(new Date());
		reponseAction.setDemande(demande);
		reponseAction.setUser(fakeUser);
		proxyReponseBu.addResponse(reponseAction);
	}

	public List<ReponseAction> getReponses() {
		return reponses;
	}

	public void setReponses(List<ReponseAction> reponses) {
		this.reponses= reponses;
	}
}