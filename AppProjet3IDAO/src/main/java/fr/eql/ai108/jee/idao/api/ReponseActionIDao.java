package fr.eql.ai108.jee.idao.api;

import java.util.Date;
import java.util.List;

import fr.eql.ai108.jee.entity.ReponseAction;

public interface ReponseActionIDao extends GenericIDao<ReponseAction> {
	ReponseAction addResponse(ReponseAction reponseAction);
}
