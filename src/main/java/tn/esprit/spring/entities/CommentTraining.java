package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentTraining implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int idcmt;
	
	private String content;
	 
     @Temporal(TemporalType.TIMESTAMP)
 	 
     private Date dateCmt;
     
     @ManyToOne
 	training training;
     
     @ManyToOne
     
 	Member Member;

	public int getIdcmt() {
		return idcmt;
	}

	public void setIdcmt(int idcmt) {
		this.idcmt = idcmt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateCmt() {
		return dateCmt;
	}

	public void setDateCmt(Date dateCmt) {
		this.dateCmt = dateCmt;
	}

	public training getTraining() {
		return training;
	}

	public void setTraining(training training) {
		this.training = training;
	}

	public CommentTraining(int idcmt, String content, Date dateCmt, training training) {
		super();
		this.idcmt = idcmt;
		this.content = content;
		this.dateCmt = dateCmt;
		this.training = training;
	}

	public CommentTraining() {
		super();
		
	}

	public Member getMember() {
		return Member;
	}

	public void setMember(Member member) {
		Member = member;
	}

	
    

}
