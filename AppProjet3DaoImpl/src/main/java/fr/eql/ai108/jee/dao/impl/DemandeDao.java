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
		
		boolean result = false;
		
		//Check whether there are other replicas of this demande
		Query query = em.createQuery("SELECT d FROM Demande d WHERE d.activite_id = :param1 "
														+ "AND d.dateAction = :param2 "
														+ "AND d.heureDebut_id = :param3 "
														+ "AND d.user_id = :param4");
		
		query.setParameter("param1", demande.getActivite().getId());
		query.setParameter("param2", demande.getDateAction());
		query.setParameter("param3", demande.getHeureDebut().getId());
		query.setParameter("param4", demande.getUser().getId());
		List<Demande> demandes = query.getResultList();
		
		if(demandes.size() > 0) {
			result = true;
		}
		
		return result;
	}
	
	public void test() {
		Query query = em.createQuery("SELECT d FROM Demande d");
		Demande demande = new Demande();
		
		List<Demande> demandes = query.getResultList();
		
		if(demandes.size() > 0) {
			System.out.println(demandes.size());
			demande = demandes.get(0);
		}
		System.out.println(demande.toString());
		
	}
	
	

}
