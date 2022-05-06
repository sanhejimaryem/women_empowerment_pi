package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.QuizReponse;


public interface QuizReponseService {
	
	
	
	public QuizReponse Addreponse (QuizReponse R);
	public QuizReponse updateReponse (QuizReponse R);
	void deleteRep (QuizReponse R);
	void deleteRepById(Integer IdQuizRep);
	QuizReponse getTraining(Integer IdQuizRep);
	public List<QuizReponse> getAllRep();
	List<QuizReponse> findQuestionsByQuiz(Integer IdQuiz);
	
	void assignQuestionToQuiz (Integer IdQuizRep ,Integer IdQuiz );
	
	Boolean checkIsCorrectAnswer(QuizReponse question, int IdQuizRep);
	public int countQuestionsInQuiz(Integer IdQuiz);
	public int getResult(QuizReponse quest , Integer IdQuiz , int IdQuizRep);
	public void assignQuizToTraining(Integer IdQuizRep, Integer IdQuiz);

}
