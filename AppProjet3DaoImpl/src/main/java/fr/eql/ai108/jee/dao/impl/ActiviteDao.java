package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.Activite;
import fr.eql.ai108.jee.idao.api.ActiviteIDao;


@Remote (ActiviteIDao.class)
@Stateless
public class ActiviteDao extends GenericDao<Activite> implements ActiviteIDao {
	
	@PersistenceContext (unitName = "AppProjet3DaoImpl")
	private EntityManager em;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Activite> getAll() {
		Query query = em.createQuery("SELECT a FROM Activite a");
		List<Activite> activites = query.getResultList();
		return activites;
	}

}
