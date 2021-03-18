package fr.eql.ai108.jee.business.impl;

import java.time.LocalDate;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.ibusiness.api.ReponseActionIBusiness;
import fr.eql.ai108.jee.idao.api.ReponseActionIDao;

@Remote(ReponseActionIBusiness.class)
@Stateless
public class ReponseActionBusiness implements ReponseActionIBusiness {
	
	@EJB
	private ReponseActionIDao proxyReponseAction;
	
	@Override
	public ReponseAction addResponse(ReponseAction reponseAction) {
		ReponseAction returnedReponse = new ReponseAction();
		returnedReponse = proxyReponseAction.addResponse(reponseAction);
		return returnedReponse;
	}

	@Override
	public ReponseAction desistementReponse(ReponseAction reponseAction) {
		ReponseAction desistReponse = reponseAction;
		desistReponse.setDateDesistement(LocalDate.now());
		proxyReponseAction.update(desistReponse);
		return desistReponse;
	}
}
