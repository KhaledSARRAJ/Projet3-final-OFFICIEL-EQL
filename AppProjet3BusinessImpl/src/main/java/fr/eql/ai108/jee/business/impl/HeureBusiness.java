package fr.eql.ai108.jee.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.Heure;
import fr.eql.ai108.jee.ibusiness.api.HeureIBusiness;
import fr.eql.ai108.jee.idao.api.HeureIDao;

@Remote(HeureIBusiness.class)
@Stateless

public class HeureBusiness implements HeureIBusiness {

	@EJB
	HeureIDao proxyHeureDao;

	@Override
	public List<Heure> displayHeure() {
		
		return proxyHeureDao.getAll();
	}
	
	
}
