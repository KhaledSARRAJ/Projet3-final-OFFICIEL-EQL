
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
@Table(name = "type_finalisation")
public class TypeFinalisation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String labelTypeFinal;
	
	@OneToMany(mappedBy = "finaleDemande", /*cascade = CascadeType.PERSIST,*/ fetch = FetchType.EAGER)
	private Set<Demande> demandes;
	
	

	public TypeFinalisation() {
		super();
	}

	public TypeFinalisation(String labelTypeFinal) {
		super();
		this.labelTypeFinal = labelTypeFinal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabelTypeFinal() {
		return labelTypeFinal;
	}

	public void setLabelTypeFinal(String labelTypeFinal) {
		this.labelTypeFinal = labelTypeFinal;
	}

	public Set<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

	@Override
	public String toString() {
		return "TypeFinalisation [id=" + id + ", labelTypeFinal=" + labelTypeFinal + ", demandes=" + demandes + "]";
	}

}
=======
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
@Table(name = "type_finalisation")
public class TypeFinalisation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String labelTypeFinal;
	
	@OneToMany(mappedBy = "finaleDemande", /*cascade = CascadeType.PERSIST,*/ fetch = FetchType.EAGER)
	private Set<Demande> demandes;
	
	

	public TypeFinalisation() {
		super();
	}

	public TypeFinalisation(String labelTypeFinal) {
		super();
		this.labelTypeFinal = labelTypeFinal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabelTypeFinal() {
		return labelTypeFinal;
	}

	public void setLabelTypeFinal(String labelTypeFinal) {
		this.labelTypeFinal = labelTypeFinal;
	}

	public Set<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

	@Override
	public String toString() {
		return "TypeFinalisation [id=" + id + ", labelTypeFinal=" + labelTypeFinal + ", demandes=" + demandes + "]";
	}

}

