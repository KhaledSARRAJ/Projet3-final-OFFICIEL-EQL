package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.Minute;
import fr.eql.ai108.jee.idao.api.MinuteIDao;


@Remote (MinuteIDao.class)
@Stateless
public class MinuteDao extends GenericDao<Minute> implements MinuteIDao {
	
	@PersistenceContext (unitName = "AppProjet3DaoImpl")
	private EntityManager em;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Minute> getAll() {
		Query query = em.createQuery("SELECT m FROM Minute m");
		List<Minute> minutes = query.getResultList();
		return minutes;
	}

}
