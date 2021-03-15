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
@Table(name = "motif_desinscription")
public class Motif_desinscription implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	private String raisonDesinscription;
	
	@OneToMany(mappedBy = "desinscription", cascade = CascadeType.PERSIST)
	private Set<User> user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRaisonDesinscription() {
		return raisonDesinscription;
	}

	public void setRaisonDesinscription(String raisonDesinscription) {
		this.raisonDesinscription = raisonDesinscription;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	
	
}
