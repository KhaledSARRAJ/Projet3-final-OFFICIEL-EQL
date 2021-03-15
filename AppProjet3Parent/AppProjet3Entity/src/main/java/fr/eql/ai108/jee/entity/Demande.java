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
@Table (name = "demande")
public class Demande implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
//	@Column (name = "race")
//	private String race;
	@Column (name = "description")
	private String description;
	@Column (name = "dateRealisation")
	private Date dateRealisation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private User user;
	
    //@OneToMany (mappedBy = "demande", cascade = CascadeType.ALL)
    //private Set<Toy> toys;
	
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demande(Integer id, String name, String race, String description, Date dateRealisation) {
		super();
		this.id = id;
		this.name = name;
		//this.race = race;
		this.description = description;
		this.dateRealisation = dateRealisation;
	}	
	public Demande(Integer id, String name, String description, Date dateRealisation, User user) {
		super();
		this.id = id;
		this.name = name;
		//this.race = race;
		this.description = description;
		this.dateRealisation = dateRealisation;
		this.user = user;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateRealisation == null) ? 0 : dateRealisation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		//result = prime * result + ((race == null) ? 0 : race.hashCode());
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
		Demande other = (Demande) obj;
		if (dateRealisation == null) {
			if (other.dateRealisation != null)
				return false;
		} else if (!dateRealisation.equals(other.dateRealisation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
//		if (race == null) {
//			if (other.race != null)
//				return false;
//		} else if (!race.equals(other.race))
//			return false;
	return true;
	}

	@Override
	public String toString() {
		return "Demande [id=" + id + ", name=" + name + ", description=" + description + ", dateRealisation=" + dateRealisation + "]";
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getRace() {
//		return race;
//	}
//	public void setRace(String race) {
//		this.race = race;
//	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public Date getdateRealisation() {
		return dateRealisation;
	}
	public void setdateRealisation(Date dateRealisation) {
		this.dateRealisation = dateRealisation;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
