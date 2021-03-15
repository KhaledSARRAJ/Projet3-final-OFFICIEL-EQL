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
	@EJB 
	private DemandeIDao proxyDemande;
	
	@Override
	public List<Demande> displayDemande() {
		return proxyDemandeDao.getAll();
	}
	
	
	/*
	 * @Override public List<Demande> find(Integer id) { // TODO Auto-generated
	 * method stub return proxyDemande.findById(); }
	 * 
	 * @Override public Demande updateDemande (Demande demande) { Demande
	 * updatedDemande = null; if(!(proxyDemande.exist(demande))) { updatedDemande =
	 * proxyDemande.update(demande); } return updatedDemande; }
	 */


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
	public List<Demande> find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Demande updateDemande(Demande demande) {
		// TODO Auto-generated method stub
		return null;
	}


}
