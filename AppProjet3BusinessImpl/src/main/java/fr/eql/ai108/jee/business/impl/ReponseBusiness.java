package fr.eql.ai108.jee.business.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.ibusiness.api.ReponseIBusiness;
import fr.eql.ai108.jee.idao.api.ReponseIDao;

@Remote(ReponseIBusiness.class)
@Stateless
public class ReponseBusiness implements ReponseIBusiness {

	@EJB
	ReponseIDao proxyReponse;
	
	@Override
	public ReponseAction selectVolunteer(ReponseAction reponse) {
		return proxyReponse.update(reponse);
	}

}
