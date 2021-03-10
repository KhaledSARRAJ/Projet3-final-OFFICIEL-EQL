package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.idao.api.DemandeIDao;

@Remote(DemandeIDao.class)
@Stateless
public class DemandeDao extends GenericDao<Demande> implements DemandeIDao {
	
	@PersistenceContext (unitName = "AppProjet3DaoImpl")
	private EntityManager em;

	@Override
	public List<Demande> getAll() {
		Query query = em.createQuery("SELECT c FROM Demande c");
		List<Demande> demandes = query.getResultList();
		return demandes;
	}

	@Override
	public boolean sameDemand(Demande demande) {
		Query query = em.createQuery("SELECT d FROM Demande d WHERE d.activite = :param1 AND d.dateAction = :param1 AND d.heureDebut = :param3 AND ");
		
		
		return false;
	}
	
	

}
