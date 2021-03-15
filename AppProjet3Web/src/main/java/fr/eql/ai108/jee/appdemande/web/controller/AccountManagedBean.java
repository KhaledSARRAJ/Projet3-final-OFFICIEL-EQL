package fr.eql.ai108.jee.appdemande.web.controller;


import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.AccountIBusiness;

@ManagedBean (name = "mbInscription")
@SessionScoped
public class AccountManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	

	private User  user = new User();
	private String message;
	
	@EJB
	private AccountIBusiness proxyAccountBu;
	
	public String createAccount() {
		
		user = proxyAccountBu.createAccount(user);
		if(user == null) {
			message = "Veuillez inscrire SVP";
		}else {
			/*
			message = "Merci " + user.getLogin() + ". Votre compte a bien été créé";
			*/
		}
		
		user = new User();
		return "/confirmation.xhtml?faces-redirect=true";
	}
	

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
