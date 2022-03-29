package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Quiz;
import tn.esprit.spring.entities.QuizReponse;
import tn.esprit.spring.repositories.QuizRepRepository;
import tn.esprit.spring.repositories.QuizRepository;
import tn.esprit.spring.repositories.TrainingRepository;



@Service
public class QuizServiceImpl  implements QuizService{

	@Autowired
	private QuizRepository QR ;
	private TrainingRepository Tr;
	
	@Autowired
	private QuizRepRepository qr ;
	
	@Override
	public Quiz AddQuiz(Quiz Q) {
		
		return QR.save(Q);
	}

	@Override
	public Quiz updateQuiz(Quiz Q) {
		
		return QR.save(Q);
	}

	@Override
	public void deleteQ(Quiz Q) {
		QR.delete(Q);
	}

	@Override
	public void deleteQByIdT(Integer IdTraining) {
		
		QR.deleteById(IdTraining);
	}

	@Override
	public void assignQuizToTraining(Integer IdTraining, Integer IdQuiz) {
		Quiz quiz = QR.findById(IdQuiz).get();
		quiz.setTraining(Tr.findById(IdTraining).get()); 
		 
		QR.save(quiz);
		
		
	}

	@Override
	public Quiz getQuiz(Integer IdTraining) {
		
			return QR.findById(IdTraining).get();
		
	}

	
	

	@Override
	public int countQuestionsInQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countValidQuestionsInQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/**public void saveScore(Quiz result) {
		Quiz saveResult = new Quiz();
		saveResult.setUsername(result.getMembre());
		saveResult.setTotalCorrect(result.getTotalCorrect());
		QR.save(saveResult);
	}
*/
	
	
}
