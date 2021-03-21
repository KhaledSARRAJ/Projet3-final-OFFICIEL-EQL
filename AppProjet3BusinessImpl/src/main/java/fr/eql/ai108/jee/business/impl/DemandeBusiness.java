package fr.eql.ai108.jee.business.impl;

import java.time.LocalDate;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.entity.TypeFinalisation;
import fr.eql.ai108.jee.entity.User;
import fr.eql.ai108.jee.ibusiness.api.DemandeIBusiness;
import fr.eql.ai108.jee.idao.api.DemandeIDao;
import fr.eql.ai108.jee.idao.api.ReponseIDao;

@Remote(DemandeIBusiness.class)
@Stateless
public class DemandeBusiness implements DemandeIBusiness {

	@EJB
	ReponseIDao proxyReponseDao;
	
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
		 proxyDemandeDao.delete(demande);
		
		}
	

	@Override
	public List<Demande> getDemandesNonPourvues(int idUser) {
		return proxyDemandeDao.getDemandesNonPourvues(idUser);
	}

	@Override
	public List<Demande> getDemandesPourvues(int idUser) {
		return proxyDemandeDao.getDemandesPourvues(idUser);
	}

	@Override
	public List<Demande> displayByReponseUser(User user) {
		List<Demande> demandList = proxyDemandeDao.getAllByReponseUser(user);
		
		return demandList;
	}

	
	@Override
	public void clotureDemand(Demande demPourvue) {
		demPourvue.setDateCloture(LocalDate.now());
		TypeFinalisation type = new TypeFinalisation();
		type.setId(1);
		type.setLabelTypeFinal("standard");
		demPourvue.setFinaleDemande(type);
		proxyDemandeDao.update(demPourvue);
	}
	

}
