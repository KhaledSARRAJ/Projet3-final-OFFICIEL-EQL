package fr.eql.ai108.jee.idao.api;

import java.util.List;

import fr.eql.ai108.jee.entity.Ville;

public interface VilleIDao extends GenericIDao<Ville>{
	List<Ville> getAll();

}
