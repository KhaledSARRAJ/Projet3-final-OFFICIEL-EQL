package fr.eql.ai108.jee.ibusiness.api;


import java.time.LocalDate;
import java.util.List;

import fr.eql.ai108.jee.entity.Demande;

import fr.eql.ai108.jee.entity.ReponseAction;

public interface ReponseActionIBusiness {
	
	ReponseAction addResponse(ReponseAction reponseAction);

	
	ReponseAction desistementReponse(ReponseAction reponseAction);

}
