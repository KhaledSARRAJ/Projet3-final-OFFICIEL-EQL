package fr.eql.ai108.jee.idao.api;

import java.util.List;

import fr.eql.ai108.jee.entity.Demande;

public interface DemandeIDao extends GenericIDao<Demande> {
	List<Demande> getAll();
	boolean sameDemand(Demande demande);
	List<Demande> getDemandesNonPourvues(int idUser);
	List<Demande> getDemandesPourvues(int idUser);
}
