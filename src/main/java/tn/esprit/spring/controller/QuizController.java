package tn.esprit.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Quiz;
import tn.esprit.spring.services.QuizServiceImpl;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/eve")
public class QuizController {
	@Autowired 
	QuizServiceImpl quizService ;
	
	
	
	@PostMapping("/add-quiz")
	public Quiz AddQuiz (@RequestBody Quiz Q){
		Quiz quiz = quizService.AddQuiz(Q);
	return quiz ;
	}
	
	
	@PutMapping("/update-quiz")
	public Quiz updateQuiz (@RequestBody Quiz Q) {
	return quizService.updateQuiz(Q);
	}
	@GetMapping("/get-Quiz")
	public List<Quiz> getAllQuiz(){
		return quizService.getAllQuiz();
	}
	
	@DeleteMapping ("delete-quiz/{IdTraining}")
	public void deleteQByIdT(@PathVariable Integer IdTraining) {
		
		quizService.deleteQByIdT(IdTraining);
	}
	
	@PutMapping("assign-quiz/{IdQuiz}/{IdTraining}")
	public void assignQuizToTraining(@PathVariable Integer IdTraining,@PathVariable Integer IdQuiz) {
		quizService.assignQuizToTraining(IdTraining, IdQuiz);
	}

	@GetMapping("getquizId/{IdTraining}")
	public Quiz getQuiz (@PathVariable Integer IdTraining){
		return quizService.getQuiz(IdTraining);
	}


}
