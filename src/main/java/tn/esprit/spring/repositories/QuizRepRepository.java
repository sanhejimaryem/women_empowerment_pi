package tn.esprit.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.QuizReponse;


@Repository
public interface QuizRepRepository extends CrudRepository<QuizReponse, Integer>{
	
	@Query("select Q from Quiz Q where Q.IdQuiz = :qt ")
	public List<QuizReponse> findQuestionsByQuiz(@Param("qt") Integer idQuiz);

	@Query("select Q from QuizReponse Q where Q.Question = :qt ")
	public QuizReponse setQuestions(@Param("qt")List<QuizReponse> ques);

}
