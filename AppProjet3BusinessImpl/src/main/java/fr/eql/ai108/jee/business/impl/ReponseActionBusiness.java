package fr.eql.ai108.jee.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

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
}
