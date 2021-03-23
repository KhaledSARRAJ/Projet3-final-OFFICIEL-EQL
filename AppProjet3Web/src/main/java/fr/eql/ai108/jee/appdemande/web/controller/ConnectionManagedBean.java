package fr.eql.ai108.jee.appdemande.web.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.AccountIBusiness;

@ManagedBean(name = "mbConnect")
@SessionScoped
public class ConnectionManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String login;
	private String mdpUtil;
	private User user = new User();
	private String message;

	@EJB
	private AccountIBusiness proxyAccountBu;

	public String connection() {
		String retour = "";
		user = proxyAccountBu.connection(user.getLogin(), user.getMdpUtil());

		if (user != null) {
			retour = "/connectedView.xhtml?faces-redirect=true";
		} else {
			retour = "/connection.xhtml?faces-redirect=true";

		}
		return retour;
	}


	public String disconnect() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();
		// Réinitialisation des champs:
		login = "";
		mdpUtil = "";
		user = new User();
		return "/connection.xhtml?faces-redirect=true";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdpUtil() {
		return mdpUtil;
	}

	public void setMdpUtil(String mdpUtil) {
		this.mdpUtil = mdpUtil;
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
