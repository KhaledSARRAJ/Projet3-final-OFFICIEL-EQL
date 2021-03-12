package fr.eql.ai108.jee.idao.api;

import java.util.List;

import fr.eql.ai108.jee.entity.Heure;

public interface HeureIDao extends GenericIDao<Heure>{
	List<Heure> getAll();

}
