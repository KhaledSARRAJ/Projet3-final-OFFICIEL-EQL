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
@Table(name = "activite")
public class Activite implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	private String labelActivite;
	
	@OneToMany(mappedBy = "activite", cascade = CascadeType.PERSIST)
	private Set<Demande> demandes;

	public Activite() {
		super();
	}

	public Activite(String labelActivite) {
		super();
		this.labelActivite = labelActivite;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabelActivite() {
		return labelActivite;
	}

	public void setLabelActivite(String labelActivite) {
		this.labelActivite = labelActivite;
	}

	public Set<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

}
