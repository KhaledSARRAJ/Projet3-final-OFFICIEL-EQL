package fr.eql.ai108.jee.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.Activite;
import fr.eql.ai108.jee.ibusiness.api.ActiviteIBusiness;
import fr.eql.ai108.jee.idao.api.ActiviteIDao;

@Remote(ActiviteIBusiness.class)
@Stateless

public class ActiviteBusiness implements ActiviteIBusiness {

	@EJB
	ActiviteIDao proxyActiviteDao;

	@Override
	public List<Activite> displayActivite() {
		
		return proxyActiviteDao.getAll();
	}
	
	
}
