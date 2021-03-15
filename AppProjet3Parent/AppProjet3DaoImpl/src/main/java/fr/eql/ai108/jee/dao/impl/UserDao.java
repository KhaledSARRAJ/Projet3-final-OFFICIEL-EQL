package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.idao.api.UserIDao;


@Remote(UserIDao.class)
@Stateless
public class UserDao extends GenericDao<User> implements UserIDao {
	
	@PersistenceContext(unitName = "AppProjet3DaoImpl")
	private EntityManager em;

	@Override
	public Boolean exist(User user) {
		Query query = em.createQuery("SELECT u FROM User u WHERE u.login = :paramLogin");
		query.setParameter("paramLogin", user.getLogin());
		List<User> users = query.getResultList();
		return users.size() > 0 ? true : false;
	}

	@Override
	public User authenticate(String login, String password) {
		Query query = em.createQuery("SELECT u FROM User u WHERE "
				+ "u.login = :paramLogin AND u.password = :paramPassword");
		User returnedUser = null;
		query.setParameter("paramLogin", login);
		query.setParameter("paramPassword", password);
		List<User> users = query.getResultList();
		if(users.size() > 0) {
			returnedUser = users.get(0);
		}
		return returnedUser;
	}

}
