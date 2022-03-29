package tn.esprit.spring.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.TrainingRating;

public interface RatingRepository extends CrudRepository<TrainingRating, Integer> {

	
	@Query("SELECT COUNT(liked) from TrainingRating where liked=1 and idTraining=:idT ")
	public int NombreLike(@Param("idT")int idTraining);
	
	@Query("SELECT COUNT(dislike) from TrainingRating where dislike=1 and idTraining=:idT ")
	public int NombredisLike(@Param("idT")int idTraining);
}
