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
	
	private String heure;
	
	@OneToMany(mappedBy = "heureDebut", cascade = CascadeType.PERSIST)
	private Set<Demande> demandesDebut;
	
	@OneToMany(mappedBy = "heureFin", cascade = CascadeType.PERSIST)
	private Set<Demande> demandesFin;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heure == null) ? 0 : heure.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Heure other = (Heure) obj;
		if (heure == null) {
			if (other.heure != null)
				return false;
		} else if (!heure.equals(other.heure))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
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

	@Override
	public String toString() {
		return "Heure [id=" + id + ", heure=" + heure + "]";
	}
	
	
}
