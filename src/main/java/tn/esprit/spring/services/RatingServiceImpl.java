package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.TrainingRating;
import tn.esprit.spring.entities.training;
import tn.esprit.spring.repositories.RatingRepository;
import tn.esprit.spring.repositories.TrainingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	
	@Autowired
	TrainingRepository tr;
	
	@Autowired 
	RatingRepository Rr;
	
	
	@Override
	public int AddLikeByPub(TrainingRating r, int idTraining) {
		r.setLikeT(1);
		r.setDislikedT(0);
		training pub=tr.findById(idTraining).get();
		
		r.setTraining(pub);
			Rr.save(r);
			return 0;
	}

	@Override
	public int AdddisLikeByPub(TrainingRating r, int idTraining) {
		r.setLikeT(0);
		r.setDislikedT(1);
		training t =tr.findById(idTraining).get();
	
		r.setTraining(t);
			Rr.save(r);
			return 0;
	}

	@Override
	public void Updatelike(int idTraining) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Updatedislike(int idTraining) {
		
		
	}

	@Override
	public int NombreLike(int idTraining) {
		return Rr.NombreLike(idTraining);
	}

	@Override
	public int NombredisLike(int idTraining) {
		return Rr.NombredisLike(idTraining); 
	}

	
	
}
