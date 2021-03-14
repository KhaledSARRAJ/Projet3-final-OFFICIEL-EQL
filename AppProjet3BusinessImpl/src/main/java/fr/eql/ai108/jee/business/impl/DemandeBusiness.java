package fr.eql.ai108.jee.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;
import fr.eql.ai108.jee.idao.api.DemandeIDao;

@Remote(DemandeIBusiness.class)
@Stateless
public class DemandeBusiness implements DemandeIBusiness {

	@EJB
	DemandeIDao proxyDemandeDao;
	
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

}
