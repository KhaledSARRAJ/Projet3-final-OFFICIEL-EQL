package fr.eql.ai108.jee.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.ProbDemande;
import fr.eql.ai108.jee.ibusiness.api.ProbDemandeIBusiness;
import fr.eql.ai108.jee.idao.api.ProbDemandeIDao;

@Remote(ProbDemandeIBusiness.class)
@Stateless
public class ProbDemandeBusiness implements ProbDemandeIBusiness{
	
	@EJB
	private ProbDemandeIDao proxyProbDemandeDao;

	@Override
	public List<ProbDemande> displayProbDemande() {
		List<ProbDemande> probDemandes = new ArrayList<ProbDemande>();
		probDemandes = proxyProbDemandeDao.getAll();
		return probDemandes;
	}
	
}
