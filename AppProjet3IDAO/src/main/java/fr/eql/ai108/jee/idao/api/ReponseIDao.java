package fr.eql.ai108.jee.idao.api;

import java.util.List;

import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.entity.User;

public interface ReponseIDao extends GenericIDao<ReponseAction>{
	List<ReponseAction> getVolunteers(int idDemande);
}
