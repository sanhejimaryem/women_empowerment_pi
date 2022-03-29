package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.QuizReponse;
import tn.esprit.spring.repositories.QuizRepRepository;
import tn.esprit.spring.repositories.QuizRepository;

@Service
public class QuizReponseServiceImpl implements QuizReponseService{

	
	@Autowired
	private QuizRepRepository Rr ;
	
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
	public List<QuizReponse> getAllTraining() {
		return (List<QuizReponse>)Rr.findAll();
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

		return question.equals(IdQuizRep);
	}

	@Override
	public QuizReponse getResult(QuizReponse quest , Integer IdQuiz) {
		
			
			int correct = 0;
			List<QuizReponse> Ques = Rr.findQuestionsByQuiz(IdQuiz);
			for (QuizReponse q: Ques )
			if(quest.getChoix() == quest.getReponse()){
				
				correct++;
			}
			if (correct <10){
				
			}
					
			
		return null ;
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
	
}
