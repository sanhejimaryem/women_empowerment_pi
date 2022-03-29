package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.CommentTraining;
import tn.esprit.spring.services.CommentTrainingServiceImpl;

@RestController
@RequestMapping("/eve")
public class CommentTController {
	
	@Autowired
	CommentTrainingServiceImpl Cs ;
	
	
	@PostMapping("/add-cmt/{idTraining}/{id_member}")
	public CommentTraining addcomments(@RequestBody CommentTraining commentT,@PathVariable int idTraining,@PathVariable int id_member){
		return Cs.addcomments(commentT, idTraining, id_member);
	}
	
	
	@PutMapping("/update-cmt")
	public CommentTraining updatecomments(@RequestBody CommentTraining ct){
		return Cs.updatecomments(ct);
	}
	
	
	
	@GetMapping("/find-cmt/{idTraining}")
	public List<String> findcmtrbyTraining(@PathVariable int idTraining){
		return Cs.findcmtrbyTraining(idTraining);
	}
	
	
	@DeleteMapping("/deletecmt/{idcmt}")
	public void deletecom(@PathVariable int idcmt){
		Cs.deletecom(idcmt);
		
	}
	
	
	void assignCmtToTraining (Integer IdTraining ,Integer IdCmt ){
		Cs.assignCmtToTraining(IdTraining, IdCmt);
	}
	
	
	
	

}
