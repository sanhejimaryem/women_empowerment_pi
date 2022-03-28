package tn.esprit.spring.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "publication")

public class publication  {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpub")
	private int idpub;

	@Column(name = "subject", unique = true)
	private String subject;

	@Column(name = "contents", nullable = true)
	private String contents;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_discussion")
	private Date date_discussion;



	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "publication")
	private Set<comments> comments;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "publication")
	private Set<Vote> Vote;


	@ManyToOne
	@JoinColumn(name = "id_member")
	Member Member;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "publication")
	private Set<Vus> Vus;
	
	
	@Column(name = "etat")
	private String etat;

	public publication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public publication(int idpub, String subject, String contents, Date date_discussion,
			Set<comments> comments, int rating, String etat) {
		super();
		this.idpub = idpub;
		this.subject = subject;
		this.contents = contents;
		this.date_discussion = date_discussion;
		this.comments = comments;
		this.etat = etat;
	}

	public int getIdpub() {
		return idpub;
	}

	public void setIdpub(int idpub) {
		this.idpub = idpub;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getDate_discussion() {
		return date_discussion;
	}

	public void setDate_discussion(Date date_discussion) {
		this.date_discussion = date_discussion;
	}

	public Set<comments> getComments() {
		return comments;
	}

	public void setComments(Set<comments> comments) {
		this.comments = comments;
	}

	

	public Set<Vote> getVote() {
		return Vote;
	}

	public void setVote(Set<Vote> vote) {
		Vote = vote;
	}

	
	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Member getMember() {
		return Member;
	}

	public void setMember(Member member) {
		Member = member;
	}
	public Set<Vus> getVus() {
		return Vus;
	}

	public void setVus(Set<Vus> vus) {
		Vus = vus;
	}
	
}
