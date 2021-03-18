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


	//ajout d'une demande en véficiant que cette dernière n'existe pas déjà
	@Override
	public boolean addDemand(Demande demande) {
		
		boolean addedUser= false;
		boolean sameDemand = proxyDemandeDao.sameDemand(demande);
		if(!sameDemand) { 
			proxyDemandeDao.add(demande);
			addedUser= true;
		}
		return addedUser;
	}
		
	@Override
	public List<ReponseAction> displayVolunteers(int idDemande) {
		List<ReponseAction> volunteers;
		volunteers = proxyReponseDao.getVolunteers(idDemande);
		return volunteers;
	}
	
	@Override
	public Demande updateDemand(Demande demande) {
		// TODO Auto-generated method stub
		proxyDemandeDao.update(demande);
		return demande;
	}


	@Override
	public void deleteDemand(Demande demande) {
		// TODO Auto-generated method stub
			proxyDemandeDao.delete(demande);
	}

}
