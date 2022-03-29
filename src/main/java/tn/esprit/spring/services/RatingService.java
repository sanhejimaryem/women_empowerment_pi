package tn.esprit.spring.services;

import tn.esprit.spring.entities.TrainingRating;

public interface RatingService {

	public int AddLikeByPub(TrainingRating r,int idTraining );
	public int AdddisLikeByPub(TrainingRating r,int idTraining );
	public void Updatelike(int idTraining) ;
	public void Updatedislike(int idTraining) ;
	public int NombreLike(int idTraining);
	public int NombredisLike(int idTraining);
	
}
