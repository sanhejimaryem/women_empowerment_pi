package tn.esprit.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.CommentTraining;

public interface CommentTRepository extends CrudRepository<CommentTraining, Integer>{

	
	@Query(value ="SELECT  c.content,c.dateCmt FROM CommentTraining c where idTraining=:idTraining order by c.dateCmt DESC")
	
	List<String> findcmtrbypublication(int idTraining);

}
