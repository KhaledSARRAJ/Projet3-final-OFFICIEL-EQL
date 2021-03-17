package fr.eql.ai108.jee.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.eql.ai108.jee.entity.ReponseAction;
import fr.eql.ai108.jee.idao.api.ReponseActionIDao;

@Remote(ReponseActionIDao.class)
@Stateless
public class ReponseActionDao extends GenericDao<ReponseAction> implements ReponseActionIDao{
	
	@PersistenceContext(unitName = "AppProjet3DaoImpl")
	private EntityManager em;
	
	@Override
	public ReponseAction addResponse(ReponseAction reponseAction){
		ReponseAction returnedReponse = new ReponseAction();
		returnedReponse = add(reponseAction);
		return reponseAction;
	}
	
	

}