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

	@SuppressWarnings("unchecked")
	@Override
	public List<Demande> getAll() {
		Query query = em.createQuery("SELECT c FROM Demande c");
		List<Demande> demandes = query.getResultList();
		return demandes;
	}

	
	
	/*
	 * @Override public Boolean exist(Demande demande) { Query query =
	 * em.createQuery("SELECT d FROM Demande WHERE d.id = :paramId");
	 * query.setParameter("paramId", demande.getId()); List<Demande> demandes =
	 * query.getResultList(); return demandes.size() > 0 ? true : false; }
	 */




	//Check whether there are other replicas of this demande
	@SuppressWarnings("unchecked")
	@Override
	public boolean sameDemand(Demande demande) {
		
		boolean result = false;
		
		//Compares the activity; dateOfaction,Starting hiyr and userID for similar demands
		Query query = em.createQuery("SELECT d FROM Demande d WHERE d.activite = :param1 "
														+ "AND d.dateAction = :param2 "
														+ "AND d.heureDebut = :param3 "
														+ "AND d.user = :param4 "
														+ "AND d.dateAnnulation is NULL");
		
		query.setParameter("param1", demande.getActivite());
		query.setParameter("param2", demande.getDateAction());
		query.setParameter("param3", demande.getHeureDebut());
		query.setParameter("param4", demande.getUser());
		List<Demande> demandes = query.getResultList();
		
		if(demandes.size() > 0) {
			result = true;
		}	
		return result;
	}

}
