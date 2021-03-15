package fr.eql.ai108.jee.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.Ville;
import fr.eql.ai108.jee.ibusiness.api.VilleIBusiness;
import fr.eql.ai108.jee.idao.api.VilleIDao;

@Remote(VilleIBusiness.class)
@Stateless

public class VilleBusiness implements VilleIBusiness {

	@EJB
	VilleIDao proxyVilleDao;

	@Override
	public List<Ville> displayVille() {
		
		return proxyVilleDao.getAll();
	}
	
	
}
