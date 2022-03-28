package tn.esprit.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer IdQuiz ;
	private String QuizTopic ;
	private Integer result ;
	
	@ManyToOne
	private training training;

	@OneToOne(mappedBy = "quiz",cascade = CascadeType.ALL)
	private Certificate certificate;
	
	@OneToMany(mappedBy = "quiz",cascade = CascadeType.ALL)
	private List<QuizReponse> quizrepList;

	public Integer getIdQuiz() {
		return IdQuiz;
	}

	public void setIdQuiz(Integer idQuiz) {
		IdQuiz = idQuiz;
	}

	public String getQuizTopic() {
		return QuizTopic;
	}

	public void setQuizTopic(String quizTopic) {
		QuizTopic = quizTopic;
	}

	

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public training getTraining() {
		return training;
	}

	public void setTraining(training training) {
		this.training = training;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public List<QuizReponse> getQuizrepList() {
		return quizrepList;
	}

	public void setQuizrepList(List<QuizReponse> quizrepList) {
		this.quizrepList = quizrepList;
	}

	public Quiz(Integer idQuiz, String quizTopic, String question, Integer result,
			training training, Certificate certificate, List<QuizReponse> quizrepList) {
		super();
		IdQuiz = idQuiz;
		QuizTopic = quizTopic;
		
		this.result = result;
		this.training = training;
		this.certificate = certificate;
		this.quizrepList = quizrepList;
	}

	public Quiz() {
		super();
		
	}

	
		
	

	

}
