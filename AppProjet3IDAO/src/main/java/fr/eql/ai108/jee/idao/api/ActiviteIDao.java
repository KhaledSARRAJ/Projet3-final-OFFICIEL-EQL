package fr.eql.ai108.jee.idao.api;

import java.util.List;

import fr.eql.ai108.jee.entity.Activite;

public interface ActiviteIDao extends GenericIDao<Activite>{
	List<Activite> getAll();

}
