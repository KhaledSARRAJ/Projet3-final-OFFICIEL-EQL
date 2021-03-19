package fr.eql.ai108.jee.idao.api;

import java.time.LocalDate;
import java.util.List;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.User;

public interface DemandeIDao extends GenericIDao<Demande> {
	boolean sameDemand(Demande demande);

	List<Demande> getAll(Integer userId, String labelActivite, String labelVille, LocalDate dateDebut, LocalDate dateFin);
	List<Demande> getAllTri(Demande demande);


	List<Demande> getAllByReponseUser(User user);
	

	List<Demande> getDemandesNonPourvues(int idUser);
	List<Demande> getDemandesPourvues(int idUser);


}
