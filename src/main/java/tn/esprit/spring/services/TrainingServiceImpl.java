package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Domaine;
import tn.esprit.spring.entities.Member;
import tn.esprit.spring.entities.Quiz;
import tn.esprit.spring.entities.training;
import tn.esprit.spring.repositories.MembreRepository;
import tn.esprit.spring.repositories.TrainingRepository;

@Service
public class TrainingServiceImpl implements TrainingService{
    @Autowired
    private TrainingRepository trainingRepository;
    
    @Autowired
    private MembreRepository Mr ;
    
    @Autowired
    private EmailService emailService;
    
    
    
    public training addTraining (training T){
    	List<Member> members = Mr.findAll();
    	for(Member m : members){
    		emailService.sendSimpleMessage(m);
    	}
    	return trainingRepository.save(T);
    }


	@Override
	public training updateTraining(training T) {
		
		return trainingRepository.save(T);
	}


	@Override
	public void deleteTraining(training T) {
		trainingRepository.delete(T);
	}


	@Override
	public List<training> getAllTraining() {
		return (List<training>)trainingRepository.findAll();
	}


	@Override
	public void deleteTrainingById(Integer IdTraining) {
		trainingRepository.deleteById(IdTraining);
	}


	
	@Override
	public training getTraining(Integer IdTraining) {
		return trainingRepository.findById(IdTraining).get();
	}


	@Override
	public List<training> findTrainingByDomaine(Domaine domaine) {
		return trainingRepository.findTrainingByDomaine(domaine);
	
		}


	@Override
	public List<training> findTrainingByDate(Date DateDTr) {
		
		return trainingRepository.findTrainingByDate (DateDTr);
	}


	@Override
	public List<training> findTrainingByLike() {
		
		 return trainingRepository.findTrainingByLike();
	}

/**
	@Override
	public List<training> findTrainingByTrainer(String nom) {
		return trainingRepository.findTrainingByTrainer (nom);
	}
	**/

	@Override
	public void assignTrainingToTrainer(Integer IdTraining, Integer id_member) {
		/**training training = trainingRepository.findById(IdTraining).get();
		training.setMembres(membre).findById(id_member).get();
		trainingRepository.save(training);**/
	
	}
	}
    
	


