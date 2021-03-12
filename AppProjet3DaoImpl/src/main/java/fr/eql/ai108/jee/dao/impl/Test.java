package fr.eql.ai108.jee.dao.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.eql.ai108.jee.entity.Activite;
import fr.eql.ai108.jee.entity.Demande;
import fr.eql.ai108.jee.entity.Heure;
import fr.eql.ai108.jee.entity.User;

public class Test {

	public static void main(String[] args) {
		
		DemandeDao dao = new DemandeDao();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Demande demande = new Demande();
		User user = new User();
		user.setId(1);
		Activite activite = new Activite();
		activite.setId(1);
		System.out.println(activite.getId());
		//Date dateAction = new Date("2021-03-11");
		Date dateAction = new Date();
		String dateString = format.format( new Date()   );
		try {
			dateAction = format.parse("2021-03-11");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Heure heuredebut = new Heure();
		heuredebut.setId(1);
		System.out.println(dateAction);
		
		demande.setActivite(activite);
		demande.setDateAction(dateAction);
		demande.setHeureDebut(heuredebut);
		demande.setUser(user);

		
		//System.out.println(dao.sameDemand(demande));
		
		
		 dao.test();
	}

}
