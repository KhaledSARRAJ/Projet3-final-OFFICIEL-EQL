package fr.eql.ai108.jee.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.jee.entity.Minute;
import fr.eql.ai108.jee.ibusiness.api.MinuteIBusiness;
import fr.eql.ai108.jee.idao.api.MinuteIDao;

@Remote(MinuteIBusiness.class)
@Stateless

public class MinuteBusiness implements MinuteIBusiness {

	@EJB
	MinuteIDao proxyMinuteDao;

	@Override
	public List<Minute> displayMinute() {
		
		return proxyMinuteDao.getAll();
	}
	
	
}
