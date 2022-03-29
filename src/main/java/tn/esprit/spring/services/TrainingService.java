package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.entities.Domaine;
import tn.esprit.spring.entities.training;

public interface TrainingService {
	public training addTraining (training T);
	public training updateTraining (training T);
	void deleteTraining(training T);
	void deleteTrainingById(Integer IdTraining);
	training getTraining(Integer IdTraining);
	List<training> getAllTraining();
	List<training> findTrainingByLike();
	public List<training> findTrainingByDomaine(Domaine domaine);
	public List<training> findTrainingByDate(Date DateDTr);
	/**public List<training> findTrainingByTrainer(String nom );
	*/
	void assignTrainingToTrainer (Integer IdTraining ,Integer id_member );
	
	
}
