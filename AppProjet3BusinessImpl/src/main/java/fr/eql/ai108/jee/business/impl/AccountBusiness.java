package fr.eql.ai108.jee.business.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.AccountIBusiness;
import fr.eql.ai108.jee.idao.api.UserIDao;



@Remote(AccountIBusiness.class)
@Stateless
public class AccountBusiness implements AccountIBusiness {
	
	@EJB
	private UserIDao proxyUser;

	@Override
	public User createAccount(User user) {
		User returnedUser = null;
		if(!(proxyUser.exist(user))) {
			returnedUser = proxyUser.add(user);
		}
		return returnedUser;
	}

	@Override
	public User connection(String login, String mdpUtil) {
		
		return proxyUser.authenticate(login, mdpUtil);
	}

	@Override
	public boolean delete(User user) {
		Boolean returnedUser = false;
		if(!(proxyUser.exist(user))) {
		 proxyUser.delete(user);
		 returnedUser =true;
		}
		return returnedUser;
	}

	@Override
	public User update(User user) {
		return proxyUser.update(user);
	}

}
