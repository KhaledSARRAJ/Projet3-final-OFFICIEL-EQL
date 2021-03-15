package fr.eql.ai108.jee.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ville")
public class Ville implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	private String CP;
	
	private String labelVille;

	@OneToMany(mappedBy = "ville", cascade = CascadeType.PERSIST)
	private Set<User> user;
	
	@OneToMany(mappedBy = "ville", cascade = CascadeType.PERSIST)
	private Set<Demande> demande;
	
	
	public Ville(Integer id, String cP, String ville) {
		super();
		this.id = id;
		CP = cP;
		this.labelVille = ville;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CP == null) ? 0 : CP.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((labelVille == null) ? 0 : labelVille.hashCode());
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
		Ville other = (Ville) obj;
		if (CP == null) {
			if (other.CP != null)
				return false;
		} else if (!CP.equals(other.CP))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (labelVille == null) {
			if (other.labelVille != null)
				return false;
		} else if (!labelVille.equals(other.labelVille))
			return false;
		return true;
	}



	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public String getLabelVille() {
		return labelVille;
	}

	public void setLabelVille(String labelVille) {
		this.labelVille = labelVille;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Ville [id=" + id + ", CP=" + CP + ", labelVille=" + labelVille + "]";
	}
	
	
	
	
}
