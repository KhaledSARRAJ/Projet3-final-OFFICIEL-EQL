package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.User;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Demande> getAllByReponseUser(User user) {
		//"SELECT u FROM User u INNER JOIN FETCH u.cats WHERE u.id=1";
		//Query query = em.createQuery("SELECT d FROM Demande d WHERE d.reponseAction.user = :param");	
		Query query = em.createQuery("SELECT d FROM Demande d INNER JOIN FETCH d.reponseAction r WHERE r.user = :param1");
		query.setParameter("param1", user);
		
		List<Demande> demandesUser = query.getResultList();
		return demandesUser;
	}
	
	

	
}
