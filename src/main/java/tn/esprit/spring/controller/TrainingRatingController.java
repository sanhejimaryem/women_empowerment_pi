package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.TrainingRating;
import tn.esprit.spring.services.RatingServiceImpl;

@RestController
@RequestMapping("/eve")
public class TrainingRatingController {

	@Autowired 
	RatingServiceImpl Rs ;
	
	
	@PostMapping("/add-Like/{idTraining}")
	public int AddLikeByPub(@RequestBody TrainingRating r,@PathVariable int idTraining ){
		return Rs.AddLikeByPub(r,idTraining);
		
	}
	
	@PostMapping("/add-dislike/{idTraining}")
	public int AdddisLikeByPub(@RequestBody TrainingRating r,@PathVariable int idTraining ){
		return Rs.AdddisLikeByPub(r, idTraining);
	}
	
	
	@PutMapping("/update-Like/{idTraining}")
	public void Updatelike(@PathVariable int idTraining) {
		Rs.Updatelike(idTraining);
		
	}
	

	@PutMapping("/update-dislike/{idTraining}")
	public void Updatedislike(@PathVariable int idTraining) {
		Rs.Updatedislike(idTraining);
	}
	
	
	@GetMapping("/get-nmbrlike/{idTraining}")
	public int NombreLike(@PathVariable int idTraining){
		return Rs.NombreLike(idTraining);
	}
	
	
	@GetMapping("/get-nmbrdislike/{idTraining}")
	public int NombredisLike(@PathVariable int idTraining){
		return Rs.NombredisLike(idTraining);
	}
}
