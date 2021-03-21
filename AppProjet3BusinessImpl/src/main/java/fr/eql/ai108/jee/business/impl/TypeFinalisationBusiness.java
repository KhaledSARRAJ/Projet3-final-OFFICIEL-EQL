
package fr.eql.ai108.jee.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import fr.eql.ai108.jee.entity.TypeFinalisation;
import fr.eql.ai108.jee.ibusiness.api.TypeFinalisationIBusiness;
import fr.eql.ai108.jee.idao.api.TypeFinalisationIDao;

@Remote(TypeFinalisationIBusiness.class)
@Stateless
public class TypeFinalisationBusiness implements TypeFinalisationIBusiness{
	
	@EJB
	private TypeFinalisationIDao proxyTypeFinalisation;

	@Override
	public List<TypeFinalisation> displayTypeFinalisation() {
		List<TypeFinalisation> typeFinalisation = new ArrayList<TypeFinalisation>();
		typeFinalisation = proxyTypeFinalisation.getAll();
		return typeFinalisation;
	}
	
}