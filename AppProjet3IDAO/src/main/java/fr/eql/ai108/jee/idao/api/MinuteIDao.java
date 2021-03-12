package fr.eql.ai108.jee.idao.api;

import java.util.List;

import fr.eql.ai108.jee.entity.Minute;

public interface MinuteIDao extends GenericIDao<Minute>{
	List<Minute> getAll();

}
