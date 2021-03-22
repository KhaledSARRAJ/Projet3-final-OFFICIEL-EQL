
package fr.eql.ai108.jee.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "probleme_demande")
public class ProbDemande implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String labelProblemDemande;
	
	@OneToMany(mappedBy = "probDemande", /*cascade = CascadeType.PERSIST,*/ fetch = FetchType.EAGER)
	private Set<Demande> demandes;

	public ProbDemande() {
		super();
	}

	public ProbDemande(String labelProblemDemande) {
		super();
		this.labelProblemDemande = labelProblemDemande;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabelProblemDemande() {
		return labelProblemDemande;
	}

	public void setLabelProblemDemande(String labelProblemDemande) {
		this.labelProblemDemande = labelProblemDemande;
	}

	public Set<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}
	
	@Override
	public String toString() {
		return "ProbDemande [id=" + id + ", labelProblemDemande=" + labelProblemDemande + ", demandes=" + demandes
				+ "]";
	}
	
}