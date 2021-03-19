package fr.eql.ai108.jee.business.impl;

import java.time.LocalDate;
import java.util.ArrayList;
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
	public List<Demande> displayDemande(Integer userId, String labelActivite, String labelVille, LocalDate dateDebut, LocalDate dateFin) {
		return proxyDemandeDao.getAll(userId, labelActivite, labelVille, dateDebut, dateFin);
	}
	
	@Override
	public List<Demande> displayDemandeTri(Demande demande) {
		return proxyDemandeDao.getAllTri(demande);
	}
}
