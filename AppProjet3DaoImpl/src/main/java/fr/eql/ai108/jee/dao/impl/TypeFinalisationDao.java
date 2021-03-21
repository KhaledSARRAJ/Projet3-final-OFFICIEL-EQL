package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.TypeFinalisation;
import fr.eql.ai108.jee.idao.api.TypeFinalisationIDao;

@Remote (TypeFinalisationIDao.class)
@Stateless
public class TypeFinalisationDao extends GenericDao<TypeFinalisation> implements TypeFinalisationIDao{
	
	@PersistenceContext (unitName = "AppProjet3DaoImpl")
	private EntityManager em;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<TypeFinalisation> getAll() {
		Query query = em.createQuery("SELECT t FROM TypeFinalisation t");
		List<TypeFinalisation> typeFinalisations = query.getResultList();
		return typeFinalisations;
	}
}
