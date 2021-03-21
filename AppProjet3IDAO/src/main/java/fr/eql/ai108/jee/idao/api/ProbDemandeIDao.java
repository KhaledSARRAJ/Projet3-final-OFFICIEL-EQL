package fr.eql.ai108.jee.idao.api;

import java.util.List;

import fr.eql.ai108.jee.entity.ProbDemande;


public interface ProbDemandeIDao extends GenericIDao<ProbDemande>{
	List<ProbDemande> getAll();

}
