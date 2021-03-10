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
@Table (name = "motifDesist")
public class MotifDesist implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String libelleMotif;
	
	@OneToMany(mappedBy = "ReponseAction", cascade = CascadeType.PERSIST)
    private Set<ReponseAction> reponseAction;

	public MotifDesist(Integer id, String libelleMotif) {
		super();
		this.id = id;
		this.libelleMotif = libelleMotif;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelleMotif() {
		return libelleMotif;
	}

	public void setLibelleMotif(String libelleMotif) {
		this.libelleMotif = libelleMotif;
	}

	public Set<ReponseAction> getReponseAction() {
		return reponseAction;
	}

	public void setReponseAction(Set<ReponseAction> reponseAction) {
		this.reponseAction = reponseAction;
	}

	public MotifDesist() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifDesist [id=" + id + ", libelleMotif=" + libelleMotif + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((libelleMotif == null) ? 0 : libelleMotif.hashCode());
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
		MotifDesist other = (MotifDesist) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (libelleMotif == null) {
			if (other.libelleMotif != null)
				return false;
		} else if (!libelleMotif.equals(other.libelleMotif))
			return false;
		return true;
	}
}
