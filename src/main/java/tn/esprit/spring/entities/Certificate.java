package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Certificate implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer IdCert;
	private String Nom ;
	private String prenom ;
	private String Formation ;
	@Temporal(TemporalType.DATE)
	private Date DateCertif ;
	
	public Integer getIdCert() {
		return IdCert;
	}

	public void setIdCert(Integer idCert) {
		IdCert = idCert;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFormation() {
		return Formation;
	}

	public void setFormation(String formation) {
		Formation = formation;
	}

	public Date getDateCertif() {
		return DateCertif;
	}

	public void setDateCertif(Date dateCertif) {
		DateCertif = dateCertif;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	@OneToOne
	private Quiz quiz;

	
	

}
