package fr.eql.ai108.jee.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "reponseAction")
public class ReponseAction implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private User user;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id") 
	private Demande demande; 
	
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private MotifDesist motifDesist; //A faire
	
	private Date dateReponse;
	private Date dateSelection;
	private Date dateDesistement;
	private Date dateRejet;
	
	public Date getDateReponse() {
		return dateReponse;
	}

	public void setDateReponse(Date dateReponse) {
		this.dateReponse = dateReponse;
	}

	public Date getDateSelection() {
		return dateSelection;
	}

	public void setDateSelection(Date dateSelection) {
		this.dateSelection = dateSelection;
	}

	public Date getDateDesistement() {
		return dateDesistement;
	}

	public void setDateDesistement(Date dateDesistement) {
		this.dateDesistement = dateDesistement;
	}

	public Date getDateRejet() {
		return dateRejet;
	}

	public void setDateRejet(Date dateRejet) {
		this.dateRejet = dateRejet;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ReponseAction(Integer id, Date dateReponse, Date dateSelection, Date dateDesistement, Date dateRejet) {
		super();
		this.id = id;
		this.dateReponse = dateReponse;
		this.dateSelection = dateSelection;
		this.dateDesistement = dateDesistement;
		this.dateRejet = dateRejet;
	}

	public ReponseAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDesistement == null) ? 0 : dateDesistement.hashCode());
		result = prime * result + ((dateRejet == null) ? 0 : dateRejet.hashCode());
		result = prime * result + ((dateReponse == null) ? 0 : dateReponse.hashCode());
		result = prime * result + ((dateSelection == null) ? 0 : dateSelection.hashCode());
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
		ReponseAction other = (ReponseAction) obj;
		if (dateDesistement == null) {
			if (other.dateDesistement != null)
				return false;
		} else if (!dateDesistement.equals(other.dateDesistement))
			return false;
		if (dateRejet == null) {
			if (other.dateRejet != null)
				return false;
		} else if (!dateRejet.equals(other.dateRejet))
			return false;
		if (dateReponse == null) {
			if (other.dateReponse != null)
				return false;
		} else if (!dateReponse.equals(other.dateReponse))
			return false;
		if (dateSelection == null) {
			if (other.dateSelection != null)
				return false;
		} else if (!dateSelection.equals(other.dateSelection))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReponseAction [id=" + id + ", dateReponse=" + dateReponse + ", dateSelection=" + dateSelection
				+ ", dateDesistement=" + dateDesistement + ", dateRejet=" + dateRejet + "]";
	}	
}
