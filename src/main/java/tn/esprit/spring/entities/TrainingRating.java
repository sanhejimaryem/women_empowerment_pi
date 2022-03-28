package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainingRating implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int IdRate;
	private int LikeT ;
	private int DislikedT;
	

	
	
	public TrainingRating() {
		super();
	}




	public TrainingRating(int idRate, int likeT, int dislikedT, training training) {
		super();
		IdRate = idRate;
		LikeT = likeT;
		DislikedT = dislikedT;
		this.training = training;
	}




	public int getIdRate() {
		return IdRate;
	}




	public void setIdRate(int idRate) {
		IdRate = idRate;
	}




	public int getLikeT() {
		return LikeT;
	}




	public void setLikeT(int likeT) {
		LikeT = likeT;
	}




	public int getDislikedT() {
		return DislikedT;
	}




	public void setDislikedT(int dislikedT) {
		DislikedT = dislikedT;
	}




	public training getTraining() {
		return training;
	}




	public void setTraining(training training) {
		this.training = training;
	}




	@ManyToOne
	
	training training; 

}
