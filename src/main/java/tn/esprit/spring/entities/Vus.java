package tn.esprit.spring.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="Vus")
public class Vus  {

	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int nbVus;
	
	@Temporal (TemporalType.DATE)
    private Date dateAjout;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "idpub")
	publication publication;

	@ManyToOne
    @JoinColumn(name="id_member")
	Member Member;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNbVus() {
		return nbVus;
	}

	public void setNbVus(int nbVus) {
		this.nbVus = nbVus;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public publication getPublication() {
		return publication;
	}

	public void setPublication(publication publication) {
		this.publication = publication;
	}

	public Member getMember() {
		return Member;
	}

	public void setMember(Member member) {
		Member = member;
	}
	
	
	
	
}
