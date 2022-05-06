package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Quiz;
import tn.esprit.spring.entities.QuizReponse;
import tn.esprit.spring.repositories.QuizRepRepository;
import tn.esprit.spring.repositories.QuizRepository;

@Service
public class QuizReponseServiceImpl implements QuizReponseService{

	
	@Autowired
	private QuizRepRepository Rr ;
	@Autowired
	private QuizRepository Qr;
	
	
	@Override
	public QuizReponse Addreponse(QuizReponse R) {
		
		return Rr.save(R);
	}

	@Override
	public QuizReponse updateReponse(QuizReponse R) {
		
		return Rr.save(R);
	}

	@Override
	public void deleteRep(QuizReponse R) {
		Rr.delete(R);
	}

	@Override
	public void deleteRepById(Integer IdQuizRep) {
		Rr.deleteById(IdQuizRep);
	}

	@Override
	public QuizReponse getTraining(Integer IdQuizRep) {
		return Rr.findById(IdQuizRep).get();
	}

	
	@Override
	public List<QuizReponse> findQuestionsByQuiz(Integer IdQuiz) {
		
		return Rr.findQuestionsByQuiz(IdQuiz);
	}


	@Override
	public Boolean checkIsCorrectAnswer(QuizReponse question, int IdQuizRep) {
		if (question.getChoix() == question.getReponse()) {
			return true;
		}

		else return false;
	}

	@Override
	public int getResult(QuizReponse quest , Integer IdQuiz , int IdQuizRep) {
		
			
			int correct = 0;
			List<QuizReponse> Ques = Rr.findQuestionsByQuiz(IdQuiz);
			for (QuizReponse q: Ques )
			if(checkIsCorrectAnswer(q, IdQuizRep)==true){
				
				correct++;
			}
			if (correct <10){
				System.out.println("you have to work more !");
				
			}
			else if (10 <correct && correct<15){
				System.out.println("good job! You have to work harder ");
			}
			else if (correct>15){
				System.out.println("excellet! You have succeded ");
			}
					
			
		return correct ;
	}
	

	@Override
	public void assignQuestionToQuiz(Integer IdQuizRep, Integer IdQuiz) {
		QuizReponse quizR = Rr.findById(IdQuizRep).get();
		quizR.setQuiz(Qr.findById(IdQuiz).get()); 
		 
		Rr.save(quizR);
		
		
		
		
	}

	@Override
	public int countQuestionsInQuiz(Integer IdQuiz) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<QuizReponse> getAllRep() {
		
		return (List<QuizReponse>)Rr.findAll();
	}

	@Override
	public void assignQuizToTraining(Integer IdQuizRep, Integer IdQuiz) {
		QuizReponse quizR = Rr.findById(IdQuizRep).get();
		quizR.setQuiz(Qr.findById(IdQuiz).get()); 
		 
		Rr.save(quizR);
		
		
	}

	
	
}
