package tn.esprit.spring.repositories;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Domaine;
import tn.esprit.spring.entities.training;
import tn.esprit.spring.entities.TrainingRating;

@Repository
public interface TrainingRepository extends CrudRepository< training, Integer> {
	@Query("select T from training T where T.Domaine = :D ")
	public List<training> findTrainingByDomaine(@Param("D") Domaine domaine);
	
	@Query("select T from training T where T.DateDTr = :DateD ")
	public List<training> findTrainingByDate(@Param ("DateD") Date DateDTr);

	/**@Query("select M from Membre M where (M.nom = :nom) ")
	public List<training> findTrainingByTrainer(@Param("nom")String nom);
	*/
	@Query("select Tr from TrainingRating Tr where LikeT= :LikeT order by Tr.LikeT DESC ")
	public List<training> findTrainingByLike();
 }
