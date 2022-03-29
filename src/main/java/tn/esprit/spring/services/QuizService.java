package tn.esprit.spring.services;

import tn.esprit.spring.entities.Quiz;

public interface QuizService {
	
	public Quiz AddQuiz (Quiz Q);
	public Quiz updateQuiz (Quiz Q);
	void deleteQ (Quiz Q);
	void deleteQByIdT (Integer IdTraining);
	void assignQuizToTraining (Integer IdTraining ,Integer IdQuiz );
	public Quiz getQuiz (Integer IdTraining);

	int countQuestionsInQuiz(Quiz quiz);

	int countValidQuestionsInQuiz(Quiz quiz);
	
	

}
