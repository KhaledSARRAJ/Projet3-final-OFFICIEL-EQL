package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.Heure;
import fr.eql.ai108.jee.idao.api.HeureIDao;


@Remote (HeureIDao.class)
@Stateless
public class HeureDao extends GenericDao<Heure> implements HeureIDao {
	
	@PersistenceContext (unitName = "AppProjet3DaoImpl")
	private EntityManager em;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Heure> getAll() {
		Query query = em.createQuery("SELECT h FROM Heure h");
		List<Heure> heures = query.getResultList();
		return heures;
	}

}
