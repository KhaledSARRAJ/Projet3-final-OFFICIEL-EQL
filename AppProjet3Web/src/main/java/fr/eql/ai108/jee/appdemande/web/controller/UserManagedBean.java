package fr.eql.ai108.jee.appdemande.web.controller;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.AccountIBusiness;

@ManagedBean(name = "mbConnnectUser")
@ViewScoped
public class UserManagedBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<User> users;
	private User nouvelleUser = new User();
	private User selectedUser;
	private Integer activeTabIndex;
	
	@ManagedProperty (value="#{mbConnect.user}")
	private User user;
	
	@EJB
	private AccountIBusiness proxyAccountBu;
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public User getNouvelleUser() {
		return nouvelleUser;
	}
	public void setNouvelleUser(User nouvelleUser) {
		this.nouvelleUser = nouvelleUser;
	}
	public User getSelectedUser() {
		return selectedUser;
	}
	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}
	public Integer getActiveTabIndex() {
		return activeTabIndex;
	}
	public void setActiveTabIndex(Integer activeTabIndex) {
		this.activeTabIndex = activeTabIndex;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String Update() {
	   		proxyAccountBu.update(user);
	       return  "/EspacePersoUser.xhtml?faces-redirect=true";
	}

	public String Delete() {
		proxyAccountBu.delete(user);
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();
		return "/welcome.xhtml?faces-redirect=true";
	}

	
}
