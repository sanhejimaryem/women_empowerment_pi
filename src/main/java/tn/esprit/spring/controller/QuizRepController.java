package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.QuizReponse;
import tn.esprit.spring.services.QuizReponseServiceImpl;
import tn.esprit.spring.services.QuizServiceImpl;

	@RestController
@RequestMapping("/eve")
public class QuizRepController {

	
	@Autowired 
	QuizReponseServiceImpl Qr ;
	QuizServiceImpl Qs ;
	
	
	
	@GetMapping("addQuest")
	public QuizReponse Addreponse (@RequestBody QuizReponse R){
		return Qr.Addreponse(R);
	}
	
	
	
	@PutMapping("updatequest")
	public QuizReponse updateReponse (@RequestBody QuizReponse R){
		return Qr.updateReponse(R);
	}
	
	
	
	@DeleteMapping("DeleteRep")
	void deleteRep (@RequestBody QuizReponse R){
		Qr.deleteRep(R);
	}
	
	
	@DeleteMapping("DeleteRep/{IdQuizRep}")	
	void deleteRepById(@PathVariable Integer IdQuizRep){
		Qr.deleteRepById(IdQuizRep);
	}
	
	
	@GetMapping("fingQbQ/{IdQuiz}")
	List<QuizReponse> findQuestionsByQuiz(@PathVariable Integer IdQuiz){
		return Qr.findQuestionsByQuiz(IdQuiz);
	}
	
	
	
	
	void assignQuestionToQuiz (@PathVariable Integer IdQuizRep ,@PathVariable Integer IdQuiz ){
		Qr.assignQuestionToQuiz(IdQuizRep, IdQuiz);
		
	}
	
	
	
	@GetMapping("resultQ/{IdQuiz}")
	public QuizReponse getResult (@RequestBody QuizReponse quest ,@PathVariable Integer IdQuiz ){
		return Qr.getResult(quest, IdQuiz);
		
	}
	
	
	
	@GetMapping("CorrectA/{IdQuizRep}")
	Boolean checkIsCorrectAnswer(@RequestBody QuizReponse question,@PathVariable int IdQuizRep){
		return Qr.checkIsCorrectAnswer(question, IdQuizRep);
	}
		
	
	
	@GetMapping("CountQ/{IdQuiz}")
	public int countQuestionsInQuiz(@PathVariable Integer IdQuiz){
		return Qr.countQuestionsInQuiz(IdQuiz);
	}
	
	
}
