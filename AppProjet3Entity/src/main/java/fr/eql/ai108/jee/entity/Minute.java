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
@Table(name = "minute")
public class Minute implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String minute;
	
	@OneToMany(mappedBy = "minuteDebut", cascade = CascadeType.PERSIST)
	private Set<Demande> demandesDebut;
	
	@OneToMany(mappedBy = "minuteFin", cascade = CascadeType.PERSIST)
	private Set<Demande> demandesFin;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((minute == null) ? 0 : minute.hashCode());
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
		Minute other = (Minute) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (minute == null) {
			if (other.minute != null)
				return false;
		} else if (!minute.equals(other.minute))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
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
		return "Minute [id=" + id + ", minute=" + minute + "]";
	}
	
	
	
}
