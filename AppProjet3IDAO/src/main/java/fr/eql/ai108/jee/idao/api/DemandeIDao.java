package fr.eql.ai108.jee.idao.api;

import java.time.LocalDate;
import java.util.List;

import fr.eql.ai108.jee.entity.Demande;

public interface DemandeIDao extends GenericIDao<Demande> {
	boolean sameDemand(Demande demande);
	List<Demande> getAll(Integer userId, String labelActivite, String labelVille, LocalDate dateDebut, LocalDate dateFin);
	List<Demande> getAllTri(Demande demande);
}
