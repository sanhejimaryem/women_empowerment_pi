package tn.esprit.spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Domaine;
import tn.esprit.spring.entities.training;
import tn.esprit.spring.services.TrainingServiceImpl;

@RestController
@RequestMapping("/eve")
public class TrainingController {

	@Autowired
	TrainingServiceImpl trainingService ;
	
	@GetMapping("/get-all-training")
	
	public List<training> getAllTraining(){
		
		return trainingService.getAllTraining() ;
	}
	
	
	@PostMapping("/add-training")
	public training addTraining (@RequestBody training T){
		training training = trainingService.addTraining(T);
	return training;
	}
	
	
	@PutMapping("/update-training")
	public training updateTraining(@RequestBody training T) {
	return trainingService.updateTraining(T);
	}
	
	
	@DeleteMapping("/remove-training")
	@ResponseBody
	public void  deleteTrainingById(Integer IdTraining) {
		trainingService.deleteTrainingById(IdTraining);
	}
	
	
	@GetMapping("/find-Domaine/{domaine}")
	@ResponseBody
	public List<training> findTrainingByDomaine(@PathVariable Domaine domaine) {
		return trainingService.findTrainingByDomaine(domaine);
	}


	@GetMapping("/find-Date/{DateDTr}")
	@ResponseBody
	public List<training> findTrainingByDate(@PathVariable Date DateDTr) {
		
		return trainingService.findTrainingByDate (DateDTr);
	}
	/**@GetMapping("/find-Trainer/{nom}/{prenom}")
	@ResponseBody
	public List<training> findTrainingByTrainer(@PathVariable String nom ){
		return trainingService.findTrainingByTrainer (nom);
		
	}*/
	@GetMapping("/find-Like/{Like}")
	public List<training> findTrainingByLike(){
		return trainingService.findTrainingByLike ();

	}
	
	@GetMapping("/get-training/{IdTraining}")
	public training getTraining(@PathVariable Integer IdTraining){
		return trainingService.getTraining(IdTraining) ;

		
	}
	
	void assignTrainingToTrainer (@PathVariable Integer IdTraining ,@PathVariable Integer id_member ){
		/** TrainingRepository.assignTrainingToTrainer(IdTraining,id_member);
		 * **/
		 
	}
}
