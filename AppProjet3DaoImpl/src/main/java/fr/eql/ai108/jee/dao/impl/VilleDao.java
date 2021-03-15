package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.Ville;
import fr.eql.ai108.jee.idao.api.VilleIDao;

@Remote (VilleIDao.class)
@Stateless
public class VilleDao extends GenericDao<Ville> implements VilleIDao {
	
	@PersistenceContext (unitName = "AppProjet3DaoImpl")
	private EntityManager em;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Ville> getAll() {
		Query query = em.createQuery("SELECT v FROM Ville v");
		List<Ville> villes = query.getResultList();
		return villes;
	}

}
