package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import org.springframework.beans.factory.annotation.Autowired;




@Entity
public class Member implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id_member;
	private String prenom;
	private String nom;
	private String age;
	private Integer cin;
	private String adresse;
	private String email;
	private Integer numtel;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Member")
	private List<Vus> Vus;
	
	@OneToMany(mappedBy="member")
    private Set<Claim> claims;
	
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "membres")
	private Set<training> training;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "jackpot")
	private List<Jackpot> jackpots;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Member")
	private List<comments> comments;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Member")
	private List<publication> publication;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Member")
	private List<Vote> Vote;

	public List<comments> getComments() {
		return comments;
	}

	public void setComments(List<comments> comments) {
		this.comments = comments;
	}

	public List<publication> getPublication() {
		return publication;
	}

	public void setPublication(List<publication> publication) {
		this.publication = publication;
	}

	public List<Vote> getVote() {
		return Vote;
	}

	public void setVote(List<Vote> vote) {
		Vote = vote;
	}
	
	
	public List<Vus> getVus() {
		return Vus;
	}

	public void setVus(List<Vus> vus) {
		Vus = vus;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Integer getCin() {
		return cin;
	}
	public void setCin(Integer cin) {
		this.cin = cin;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getNumtel() {
		return numtel;
	}
	public void setNumtel(Integer numtel) {
		this.numtel = numtel;
	}
	

}
