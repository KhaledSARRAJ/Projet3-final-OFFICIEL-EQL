package fr.eql.ai108.jee.dao.impl;

import java.time.LocalDate;
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
	
	
	/*
	 * Méthode qui extrait les demandes d'action non pourvues dont l'auteur est l'utilisateur passé 
	 * en argument
	 * @param : un int qui est l'id de l'utilisateur dont on veut extraire la liste des demandes non pourvues
	 * @return : une liste de demandes (List<Demande>) non pourvues
	 */
	@Override
	public List<Demande> getDemandesNonPourvues(int idUser) {
		Query query = em.createQuery("SELECT d "
								   + "FROM Demande d "
								   + "WHERE d.user.id = :paramId "
								   + "AND d.dateAnnulation IS NULL "
								   + "AND d.id NOT IN (SELECT r.demande.id "
								   					+ "FROM ReponseAction r "
								   					+ "WHERE r.dateSelection IS NOT NULL "
								   					+ "AND r.dateRejet IS NULL "
								   					+ "AND r.dateDesistement IS NULL )");
		query.setParameter("paramId", idUser);
		List<Demande> demandes = query.getResultList();
		return demandes;
	}
	
	/*
	 * Méthode qui extrait les demandes d'action pourvues dont l'auteur est l'utilisateur passé 
	 * en argument
	 * @param : un int qui est l'id de l'utilisateur dont on veut extraire la liste des demandes pourvues
	 * @return : une liste de demandes (List<Demande>) pourvues
	 */
	@Override
	public List<Demande> getDemandesPourvues(int idUser) {
		Query query = em.createQuery("SELECT d "
				   + "FROM Demande d "
				   + "WHERE d.user.id = :paramId "
				   + "AND d.dateAnnulation IS NULL "
				   + "AND d.id IN (SELECT r.demande.id "
				   			    + "FROM ReponseAction r "
				   			    + "WHERE r.dateSelection IS NOT NULL "
				   				+ "AND r.dateRejet IS NULL "
				   				+ "AND r.dateDesistement IS NULL )");
		query.setParameter("paramId", idUser);
		List<Demande> demandes = query.getResultList();
		return demandes;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Demande> getAll(Integer userId, String labelActivite, String labelVille, LocalDate dateDebut, LocalDate dateFin) {
		Query query = null;
		
		String maRequete = "SELECT d FROM Demande d WHERE d.user.id != :paramIdUtil";
		if(labelActivite != null) {
			maRequete += " AND d.activite.labelActivite = :paramActivite";
		}
		if(labelVille != null) {
			maRequete += " AND d.ville.labelVille = :paramVille";
		}
		if(dateDebut != null) {
			maRequete += " AND d.dateAction > :paramDebut";	
		}
		if(dateFin != null) {
			maRequete += " AND d.dateAction < :paramFin";
		}
		query = em.createQuery(maRequete);
		if(labelActivite != null) {
			query.setParameter("paramActivite", labelActivite);
		}
		if(labelVille != null) {
			query.setParameter("paramVille", labelVille);
		}
		if(dateDebut != null) {
			query.setParameter("paramDebut", dateDebut);
		}
		if(dateFin != null) {
			query.setParameter("paramFin", dateFin);
		}
		query.setParameter("paramIdUtil", userId);
		System.out.println(maRequete);
		List<Demande> demandes = query.getResultList();
		
		return demandes;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Demande> getAllTri(Demande demande) {
		Query query = null;
		String labelActivite = demande.getVille().getLabelVille();
		int userId = 2;
		String labelVille = null;
		String dateDebut = null;
		String dateFin = null;
		
		String maRequete = "SELECT d FROM Demande d WHERE d.user.id != :paramIdUtil";
		if(labelActivite != null) {
			maRequete += " AND d.activite.labelActivite = :paramActivite";
		}
		if(labelVille != null) {
			maRequete += " AND d.ville.labelVille = :paramVille";
		}
		if(dateDebut != null) {
			maRequete += " AND d.dateAction > :paramDebut";	
		}
		if(dateFin != null) {
			maRequete += " AND d.dateAction < :paramFin";
		}
		query = em.createQuery(maRequete);
		if(labelActivite != null) {
			query.setParameter("paramActivite", labelActivite);
		}
		if(labelVille != null) {
			query.setParameter("paramVille", labelVille);
		}
		if(dateDebut != null) {
			query.setParameter("paramDebut", dateDebut);
		}
		if(dateFin != null) {
			query.setParameter("paramFin", dateFin);
		}
		query.setParameter("paramIdUtil", userId);
		System.out.println(maRequete);
		List<Demande> demandes = query.getResultList();
		
		return demandes;
	}

}
