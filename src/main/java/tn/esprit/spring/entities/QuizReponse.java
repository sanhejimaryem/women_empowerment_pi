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
public class QuizReponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdQuizRep ;
	private String Question;
	private String optionA ;
	private String optionB ;
	private String optionC ;
	private String Reponse ;
	private String choix;
	
	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getChoix() {
		return choix;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}

	@ManyToOne
	private Quiz quiz ;

	public Integer getIdQuizRep() {
		return IdQuizRep;
	}

	public void setIdQuizRep(Integer idQuizRep) {
		IdQuizRep = idQuizRep;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getReponse() {
		return Reponse;
	}

	public void setReponse(String reponse) {
		Reponse = reponse;
	}

	

	public QuizReponse() {
		super();
		
	}

	public QuizReponse(Integer idQuizRep, String question, String optionA, String optionB, String optionC,
			String reponse, String choix, Quiz quiz) {
		super();
		IdQuizRep = idQuizRep;
		Question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		Reponse = reponse;
		this.choix = choix;
		this.quiz = quiz;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	

}
