package fr.eql.ai108.jee.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.idao.api.ReponseIDao;

@Remote
@Stateless
public class ReponseDao extends GenericDao<ReponseAction> implements ReponseIDao {
	
	@PersistenceContext(unitName = "AppProjet3DaoImpl")
	private EntityManager em;
	
	/*
	 * Méthode qui permet d'extraire une liste de réponses à une demande donnée. Les réponses extraites
	 * n'ont été ni sélectionnées ni rejetées ni retirées.
	 * @param : un int idDemande qui représente l'id de la demande pour laquelle on souhaite extraire
	 * 			la liste des réponses
	 * @return : une liste de User
	 */
	@Override
	public List<ReponseAction> getVolunteers(int idDemande) {
		Query query = em.createQuery("SELECT r "
				+ "FROM Demande d LEFT JOIN d.reponseAction r "
				+ "WHERE d.id = :paramIdDemande "
				+ "AND r.dateSelection IS NULL "
				+ "AND r.dateRejet IS NULL "
				+ "AND r.dateSelection IS NULL");
		query.setParameter("paramIdDemande", idDemande);
		List<ReponseAction> reponse = query.getResultList();
		if(reponse == null || reponse.get(0) == null ) {
			return null;
		} else {
			return reponse;
		}
	}

}
