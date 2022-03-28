package tn.esprit.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class training implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer IdTraining;
	@Enumerated(EnumType.STRING)
	private Domaine Domaine ;
	private String Description ;
	

	@Temporal(TemporalType.DATE)
	private Date DateDTr ;
	@Temporal(TemporalType.DATE)
	private Date DateFTr ;
	
	
	public training(Domaine domaine, String description, Date dateDTr, Date dateFTr,
			Set<Member> membres, List<Quiz> quizList, Set<TrainingRating> trainingRating,
			Set<CommentTraining> commentT) {
		super();
		Domaine = domaine;
		Description = description;
		DateDTr = dateDTr;
		DateFTr = dateFTr;
		this.membres = membres;
		this.quizList = quizList;
		TrainingRating = trainingRating;
		this.commentT = commentT;
	}
	
	
	
	public training() {
		super();
	}



	public Integer getIdTraining() {
		return IdTraining;
	}

	public void setIdTraining(Integer idTraining) {
		IdTraining = idTraining;
	}

	public Domaine getDomaine() {
		return Domaine;
	}

	public void setDomaine(Domaine domaine) {
		Domaine = domaine;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getDateDTr() {
		return DateDTr;
	}

	public void setDateDTr(Date dateDTr) {
		DateDTr = dateDTr;
	}

	public Date getDateFTr() {
		return DateFTr;
	}

	public void setDateFTr(Date dateFTr) {
		DateFTr = dateFTr;
	}

	public Set<Member> getMembres() {
		return membres;
	}

	public void setMembres(Set<Member> membres) {
		this.membres = membres;
	}

	public List<Quiz> getQuizList() {
		return quizList;
	}

	public void setQuizList(List<Quiz> quizList) {
		this.quizList = quizList;
	}

	public Set<TrainingRating> getTrainingRating() {
		return TrainingRating;
	}

	public void setTrainingRating(Set<TrainingRating> trainingRating) {
		TrainingRating = trainingRating;
	}

	public Set<CommentTraining> getCommentT() {
		return commentT;
	}

	public void setCommentT(Set<CommentTraining> commentT) {
		this.commentT = commentT;
	}

	@ManyToMany(mappedBy="training", cascade = CascadeType.ALL)
	private Set<Member> membres;
	
	@OneToMany(mappedBy = "training",cascade = CascadeType.ALL)
	private List<Quiz> quizList;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "training")
	private Set<TrainingRating> TrainingRating;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "training")
	private Set<CommentTraining> commentT;
	
	
	

}
