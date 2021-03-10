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
@Table(name = "motif_annulation")
public class MotifAnnulation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String labelMotifAnnulation;
	
	@OneToMany(mappedBy = "motifAnnul", cascade = CascadeType.PERSIST)
	private Set<Demande> demandes;

	public MotifAnnulation() {
		super();
	}

	public MotifAnnulation(String labelMotifAnnulation) {
		super();
		this.labelMotifAnnulation = labelMotifAnnulation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabelMotifAnnulation() {
		return labelMotifAnnulation;
	}

	public void setLabelMotifAnnulation(String labelMotifAnnulation) {
		this.labelMotifAnnulation = labelMotifAnnulation;
	}

	public Set<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}
	
}
