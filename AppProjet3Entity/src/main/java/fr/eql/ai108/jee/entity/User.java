package fr.eql.ai108.jee.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nomUtil")
	private String nomUtil;
	
	@Column(name = "prenomUtil")
	private String prenomUtil;
	
	@Column(name = "dateNaissance")
	private Date dateNaissance;
	
	@Column(name = "emailUtil")
	private String emailUtil;
	
	@Column(name = "telUtil")
	private String telUtil;
	
	@Column(name = "voieUtil")
	private String voieUtil;
	
	@Column(name = "mdpUtil")
	private String mdpUtil;
	
	@Column(name = "dateInscriUtil")
	private Date dateInscriUtil;
	
	@Column(name = "nomContactUrg")
	private String nomContactUrg;
	
	@Column(name = "prenomContactUrg")
	private String prenomContactUrg;
	
	@Column(name = "telContactUrg")
	private String telContactUrg;
//	
	@Column(name = "dateDesinscription")
	private Date dateDesinscription;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Genre genre;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Ville ville;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Motif_desinscription desinscription;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	private Set<Demande> demande;
	/*
	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	private Set<Demande> repondre;
	 */
	public User(String nomUtil, String prenomUtil, Date dateNaissance, String emailUtil,
			String telUtil, String voieUtil, String mdpUtil, Date dateInscriUtil, String nomContactUrg,
			String prenomContactUrg, String telContactUrg) {
		super();
		this.nomUtil = nomUtil;
		this.prenomUtil = prenomUtil;
		this.dateNaissance = dateNaissance;
		this.emailUtil = emailUtil;
		this.telUtil = telUtil;
		this.voieUtil = voieUtil;
		this.mdpUtil = mdpUtil;
		this.dateInscriUtil = dateInscriUtil;
		this.nomContactUrg = nomContactUrg;
		this.prenomContactUrg = prenomContactUrg;
		this.telContactUrg = telContactUrg;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDesinscription == null) ? 0 : dateDesinscription.hashCode());
		result = prime * result + ((dateInscriUtil == null) ? 0 : dateInscriUtil.hashCode());
		result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((emailUtil == null) ? 0 : emailUtil.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mdpUtil == null) ? 0 : mdpUtil.hashCode());
		result = prime * result + ((nomContactUrg == null) ? 0 : nomContactUrg.hashCode());
		result = prime * result + ((nomUtil == null) ? 0 : nomUtil.hashCode());
		result = prime * result + ((prenomContactUrg == null) ? 0 : prenomContactUrg.hashCode());
		result = prime * result + ((prenomUtil == null) ? 0 : prenomUtil.hashCode());
		result = prime * result + ((telContactUrg == null) ? 0 : telContactUrg.hashCode());
		result = prime * result + ((telUtil == null) ? 0 : telUtil.hashCode());
		result = prime * result + ((voieUtil == null) ? 0 : voieUtil.hashCode());
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
		User other = (User) obj;
		if (dateDesinscription == null) {
			if (other.dateDesinscription != null)
				return false;
		} else if (!dateDesinscription.equals(other.dateDesinscription))
			return false;
		if (dateInscriUtil == null) {
			if (other.dateInscriUtil != null)
				return false;
		} else if (!dateInscriUtil.equals(other.dateInscriUtil))
			return false;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (emailUtil == null) {
			if (other.emailUtil != null)
				return false;
		} else if (!emailUtil.equals(other.emailUtil))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mdpUtil == null) {
			if (other.mdpUtil != null)
				return false;
		} else if (!mdpUtil.equals(other.mdpUtil))
			return false;
		if (nomContactUrg == null) {
			if (other.nomContactUrg != null)
				return false;
		} else if (!nomContactUrg.equals(other.nomContactUrg))
			return false;
		if (nomUtil == null) {
			if (other.nomUtil != null)
				return false;
		} else if (!nomUtil.equals(other.nomUtil))
			return false;
		if (prenomContactUrg == null) {
			if (other.prenomContactUrg != null)
				return false;
		} else if (!prenomContactUrg.equals(other.prenomContactUrg))
			return false;
		if (prenomUtil == null) {
			if (other.prenomUtil != null)
				return false;
		} else if (!prenomUtil.equals(other.prenomUtil))
			return false;
		if (telContactUrg == null) {
			if (other.telContactUrg != null)
				return false;
		} else if (!telContactUrg.equals(other.telContactUrg))
			return false;
		if (telUtil == null) {
			if (other.telUtil != null)
				return false;
		} else if (!telUtil.equals(other.telUtil))
			return false;
		if (voieUtil == null) {
			if (other.voieUtil != null)
				return false;
		} else if (!voieUtil.equals(other.voieUtil))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nomUtil=" + nomUtil + ", prenomUtil=" + prenomUtil + ", dateNaissance="
				+ dateNaissance + ", emailUtil=" + emailUtil + ", telUtil=" + telUtil + ", voieUtil=" + voieUtil
				+ ", mdpUtil=" + mdpUtil + ", dateInscriUtil=" + dateInscriUtil + ", nomContactUrg="
				+ nomContactUrg + ", prenomContactUrg=" + prenomContactUrg + ", telContactUrg="
				+ telContactUrg + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Motif_desinscription getDesinscription() {
		return desinscription;
	}

	public void setDesinscription(Motif_desinscription desinscription) {
		this.desinscription = desinscription;
	}

	public String getNomUtil() {
		return nomUtil;
	}

	public void setNomUtil(String nomUtil) {
		this.nomUtil = nomUtil;
	}

	public String getPrenomUtil() {
		return prenomUtil;
	}

	public void setPrenomUtil(String prenomUtil) {
		this.prenomUtil = prenomUtil;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmailUtil() {
		return emailUtil;
	}

	public void setEmailUtil(String emailUtil) {
		this.emailUtil = emailUtil;
	}

	public String getTelUtil() {
		return telUtil;
	}

	public void setTelUtil(String telUtil) {
		this.telUtil = telUtil;
	}

	public String getVoieUtil() {
		return voieUtil;
	}

	public void setVoieUtil(String voieUtil) {
		this.voieUtil = voieUtil;
	}

	public String getMdpUtil() {
		return mdpUtil;
	}

	public void setMdpUtil(String mdpUtil) {
		this.mdpUtil = mdpUtil;
	}

	public Date getDateInscriUtil() {
		return dateInscriUtil;
	}

	public void setDateInscriUtil(Date dateInscriUtil) {
		this.dateInscriUtil = dateInscriUtil;
	}

	public String getNomContactUrg() {
		return nomContactUrg;
	}

	public void setNomContactUrg(String nomContactUrg) {
		this.nomContactUrg = nomContactUrg;
	}

	public String getPrenomContactUrg() {
		return prenomContactUrg;
	}

	public void setPrenomContactUrg(String prenomContactUrg) {
		this.prenomContactUrg = prenomContactUrg;
	}

	public String getTelContactUrg() {
		return telContactUrg;
	}

	public void setTelContactUrg(String telContactUrg) {
		this.telContactUrg = telContactUrg;
	}

	public Date getDateDesinscription() {
		return dateDesinscription;
	}

	public void setDateDesinscription(Date dateDesinscription) {
		this.dateDesinscription = dateDesinscription;
	}

	public Set<Demande> getDemande() {
		return demande;
	}

	public void setDemande(Set<Demande> demande) {
		this.demande = demande;
	}
/*
	public Set<Demande> getRepondre() {
		return repondre;
	}

	public void setRepondre(Set<Demande> repondre) {
		this.repondre = repondre;
	}

*/
	
	
	
}
	
