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




@Entity
@Table(name ="comments")
public class comments  {



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int idcomment;
	
	 @Column(name="contents")
     private String contents;
	 
     @Temporal(TemporalType.TIMESTAMP)
 	 @Column(name="dateComment")
     private Date dateComment;
     
    @ManyToOne
    @JoinColumn(name="idpub")
	publication publication; 
	 
    @ManyToOne
    @JoinColumn(name="id_member")
	Member Member;
    

    
    @OneToMany(cascade=CascadeType.ALL,mappedBy="comments")
	private Set<Vote> Vote ;
    
    
	public comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public comments(int idcomment, String contents, Date dateComment, publication publication) {
		super();
		this.idcomment = idcomment;
		this.contents = contents;
		this.dateComment = dateComment;
		this.publication = publication;
	
	}



	public int getIdcomment() {
		return idcomment;
	}
	public void setIdcomment(int idcomment) {
		this.idcomment = idcomment;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getDateComment() {
		return dateComment;
	}
	public void setDateComment(Date dateComment) {
		this.dateComment = dateComment;
	}
	public publication getPublication() {
		return publication;
	}
	public void setPublication(publication publication) {
		this.publication = publication;
	}

	
	public Set<Vote> getVote() {
		return Vote;
	}

	public void setVote(Set<Vote> vote) {
		Vote = vote;
	}

	public Member getMember() {
		return Member;
	}

	public void setMember(Member member) {
		Member = member;
	}

	
	
}
