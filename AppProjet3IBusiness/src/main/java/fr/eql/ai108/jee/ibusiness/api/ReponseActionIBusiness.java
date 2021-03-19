package fr.eql.ai108.jee.ibusiness.api;

import fr.eql.ai108.jee.entity.ReponseAction;

public interface ReponseActionIBusiness {
	
	ReponseAction addResponse(ReponseAction reponseAction);
	
	ReponseAction desistementReponse(ReponseAction reponseAction);


}
