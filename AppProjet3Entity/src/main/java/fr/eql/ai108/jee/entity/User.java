package fr.eql.ai108.jee.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
	@Column(name = "autreTel")
	private String autreTel;
	@Column(name = "numVoieUtil")
	private String numVoieUtil;
	
	@Column(name = "voieUtil")
	private String voieUtil;
	
	@Column(name = "codePostal")
	private String codePostal;
	
	
	@Column(name = "login")
	private String login;
	
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
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	private Set<ReponseAction> reponseAction;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String nomUtil, String prenomUtil, Date dateNaissance, String emailUtil, String telUtil,
			String autreTel, String numVoieUtil, String voieUtil, String codePostal, String login, String mdpUtil,
			Date dateInscriUtil, String nomContactUrg, String prenomContactUrg, String telContactUrg,
			Date dateDesinscription, Genre genre, Ville ville, Motif_desinscription desinscription,
			Set<Demande> demande, Set<ReponseAction> reponseAction) {
		super();
		this.id = id;
		this.nomUtil = nomUtil;
		this.prenomUtil = prenomUtil;
		this.dateNaissance = dateNaissance;
		this.emailUtil = emailUtil;
		this.telUtil = telUtil;
		this.autreTel = autreTel;
		this.numVoieUtil = numVoieUtil;
		this.voieUtil = voieUtil;
		this.codePostal = codePostal;
		this.login = login;
		this.mdpUtil = mdpUtil;
		this.dateInscriUtil = dateInscriUtil;
		this.nomContactUrg = nomContactUrg;
		this.prenomContactUrg = prenomContactUrg;
		this.telContactUrg = telContactUrg;
		this.dateDesinscription = dateDesinscription;
		this.genre = genre;
		this.ville = ville;
		this.desinscription = desinscription;
		this.demande = demande;
		this.reponseAction = reponseAction;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAutreTel() {
		return autreTel;
	}

	public void setAutreTel(String autreTel) {
		this.autreTel = autreTel;
	}

	public String getNumVoieUtil() {
		return numVoieUtil;
	}

	public void setNumVoieUtil(String numVoieUtil) {
		this.numVoieUtil = numVoieUtil;
	}

	public String getVoieUtil() {
		return voieUtil;
	}

	public void setVoieUtil(String voieUtil) {
		this.voieUtil = voieUtil;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public Set<Demande> getDemande() {
		return demande;
	}

	public void setDemande(Set<Demande> demande) {
		this.demande = demande;
	}

	public Set<ReponseAction> getReponseAction() {
		return reponseAction;
	}

	public void setReponseAction(Set<ReponseAction> reponseAction) {
		this.reponseAction = reponseAction;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autreTel == null) ? 0 : autreTel.hashCode());
		result = prime * result + ((codePostal == null) ? 0 : codePostal.hashCode());
		result = prime * result + ((dateDesinscription == null) ? 0 : dateDesinscription.hashCode());
		result = prime * result + ((dateInscriUtil == null) ? 0 : dateInscriUtil.hashCode());
		result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((demande == null) ? 0 : demande.hashCode());
		result = prime * result + ((desinscription == null) ? 0 : desinscription.hashCode());
		result = prime * result + ((emailUtil == null) ? 0 : emailUtil.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((mdpUtil == null) ? 0 : mdpUtil.hashCode());
		result = prime * result + ((nomContactUrg == null) ? 0 : nomContactUrg.hashCode());
		result = prime * result + ((nomUtil == null) ? 0 : nomUtil.hashCode());
		result = prime * result + ((numVoieUtil == null) ? 0 : numVoieUtil.hashCode());
		result = prime * result + ((prenomContactUrg == null) ? 0 : prenomContactUrg.hashCode());
		result = prime * result + ((prenomUtil == null) ? 0 : prenomUtil.hashCode());
		result = prime * result + ((reponseAction == null) ? 0 : reponseAction.hashCode());
		result = prime * result + ((telContactUrg == null) ? 0 : telContactUrg.hashCode());
		result = prime * result + ((telUtil == null) ? 0 : telUtil.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		if (autreTel == null) {
			if (other.autreTel != null)
				return false;
		} else if (!autreTel.equals(other.autreTel))
			return false;
		if (codePostal == null) {
			if (other.codePostal != null)
				return false;
		} else if (!codePostal.equals(other.codePostal))
			return false;
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
		if (demande == null) {
			if (other.demande != null)
				return false;
		} else if (!demande.equals(other.demande))
			return false;
		if (desinscription == null) {
			if (other.desinscription != null)
				return false;
		} else if (!desinscription.equals(other.desinscription))
			return false;
		if (emailUtil == null) {
			if (other.emailUtil != null)
				return false;
		} else if (!emailUtil.equals(other.emailUtil))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
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
		if (numVoieUtil == null) {
			if (other.numVoieUtil != null)
				return false;
		} else if (!numVoieUtil.equals(other.numVoieUtil))
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
		if (reponseAction == null) {
			if (other.reponseAction != null)
				return false;
		} else if (!reponseAction.equals(other.reponseAction))
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
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
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
				+ dateNaissance + ", emailUtil=" + emailUtil + ", telUtil=" + telUtil + ", autreTel=" + autreTel
				+ ", numVoieUtil=" + numVoieUtil + ", voieUtil=" + voieUtil + ", codePostal=" + codePostal + ", login="
				+ login + ", mdpUtil=" + mdpUtil + ", dateInscriUtil=" + dateInscriUtil + ", nomContactUrg="
				+ nomContactUrg + ", prenomContactUrg=" + prenomContactUrg + ", telContactUrg=" + telContactUrg
				+ ", dateDesinscription=" + dateDesinscription + ", genre=" + genre + ", ville=" + ville
				+ ", desinscription=" + desinscription + ", demande=" + demande + ", reponseAction=" + reponseAction
				+ "]";
	}

	public int getAge() {
		LocalDate todaysDate = LocalDate.now();
		LocalDate dateBirth = Instant.ofEpochMilli(dateNaissance.getTime())
			      .atZone(ZoneId.systemDefault())
			      .toLocalDate();
		Period period = Period.between(dateBirth, todaysDate);
	    return period.getYears();
	}
	
}
	
