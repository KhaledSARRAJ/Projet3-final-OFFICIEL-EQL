package fr.eql.ai108.jee.idao.api;

import java.util.Date;
import java.util.List;

import fr.eql.ai108.jee.entity.User;

public interface UserIDao extends GenericIDao<User>{
	Boolean exist(User user);
	User authenticate(String login, String mdpUtil);
}
