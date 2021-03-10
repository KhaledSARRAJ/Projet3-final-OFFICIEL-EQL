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
	
	
	
	
}
