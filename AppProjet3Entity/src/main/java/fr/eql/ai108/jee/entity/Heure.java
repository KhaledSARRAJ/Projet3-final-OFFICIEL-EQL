package fr.eql.ai108.jee.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "heure")
public class Heure implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int heure;
	
	@OneToMany(mappedBy = "heureDebut", cascade = CascadeType.PERSIST)
	private Set<Demande> demandesDebut;
	
	@OneToMany(mappedBy = "heureFin", cascade = CascadeType.PERSIST)
	private Set<Demande> demandesFin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public Set<Demande> getDemandesDebut() {
		return demandesDebut;
	}

	public void setDemandesDebut(Set<Demande> demandesDebut) {
		this.demandesDebut = demandesDebut;
	}

	public Set<Demande> getDemandesFin() {
		return demandesFin;
	}

	public void setDemandesFin(Set<Demande> demandesFin) {
		this.demandesFin = demandesFin;
	}
	
}
