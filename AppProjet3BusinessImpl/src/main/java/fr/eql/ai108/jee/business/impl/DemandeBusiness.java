package fr.eql.ai108.jee.business.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;
import fr.eql.ai108.jee.idao.api.DemandeIDao;
import fr.eql.ai108.jee.idao.api.ReponseIDao;
import fr.eql.ai108.jee.idao.api.UserIDao;

@Remote(DemandeIBusiness.class)
@Stateless
public class DemandeBusiness implements DemandeIBusiness {

	@EJB
	DemandeIDao proxyDemandeDao;

	@EJB
	ReponseIDao proxyReponseDao;
	
	@Override
	public List<Demande> displayDemande() {
		// TODO Auto-generated method stub
		return proxyDemandeDao.getAll();
	}

	@Override
	public List<ReponseAction> displayVolunteers(int idDemande) {
		List<ReponseAction> volunteers;
		volunteers = proxyReponseDao.getVolunteers(idDemande);
		return volunteers;
	}

}
