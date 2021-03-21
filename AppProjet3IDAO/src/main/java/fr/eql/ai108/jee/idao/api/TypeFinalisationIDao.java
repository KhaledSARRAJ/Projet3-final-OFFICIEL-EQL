package fr.eql.ai108.jee.idao.api;

import java.util.List;

import fr.eql.ai108.jee.entity.TypeFinalisation;

public interface TypeFinalisationIDao extends GenericIDao<TypeFinalisation>{
	List<TypeFinalisation> getAll();

}
