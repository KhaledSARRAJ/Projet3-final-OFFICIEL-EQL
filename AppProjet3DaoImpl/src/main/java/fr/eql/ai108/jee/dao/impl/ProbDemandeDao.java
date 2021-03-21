
package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.ProbDemande;
import fr.eql.ai108.jee.entity.TypeFinalisation;
import fr.eql.ai108.jee.idao.api.ProbDemandeIDao;
import fr.eql.ai108.jee.idao.api.TypeFinalisationIDao;

@Remote (ProbDemandeIDao.class)
@Stateless
public class ProbDemandeDao extends GenericDao<ProbDemande> implements ProbDemandeIDao{
	
	@PersistenceContext (unitName = "AppProjet3DaoImpl")
	private EntityManager em;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProbDemande> getAll() {
		Query query = em.createQuery("SELECT p FROM ProbDemande p");
		List<ProbDemande> probDemandes = query.getResultList();
		return probDemandes;
	}

}