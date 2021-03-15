package fr.eql.ai108.jee.ibusiness.api;

import fr.eql.ai108.jee.entity.User;

public interface AccountIBusiness {
	User createAccount(User user);
	User connection(String login, String mdpUtil);
}
