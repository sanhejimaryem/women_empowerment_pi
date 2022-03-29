package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.CommentTraining;

public interface CommentTrainingService {

	 public CommentTraining  addcomments(CommentTraining commentT, int idTraining, int id_member);
		
		//update comment
		public CommentTraining updatecomments(CommentTraining ct);
		//comment
		public List<String> findcmtrbyTraining(int idTraining);
		//delete
		public void deletecom(int idcmt);
		void assignCmtToTraining (Integer IdTraining ,Integer Idcmt );
		
}
