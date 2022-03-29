package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.CommentTraining;
import tn.esprit.spring.entities.Member;
import tn.esprit.spring.entities.training;
import tn.esprit.spring.repositories.CommentTRepository;
import tn.esprit.spring.repositories.MembreRepository;
import tn.esprit.spring.repositories.TrainingRepository;

@Service
public class CommentTrainingServiceImpl implements CommentTrainingService {

	@Autowired
	CommentTRepository CmtR ;
	
	@Autowired
	MembreRepository membrerep ;
	
	@Autowired
	TrainingRepository TR;
	
	
	
	
	
	
	@Override
	public CommentTraining addcomments(CommentTraining commentT, int idTraining, int id_member) {
		String commentWords = commentT.getContent();
		List<String> badwords1=new ArrayList<String>();
		badwords1.add("bad");
		badwords1.add("words");
		badwords1.add("bads");
		
		if (badwords1.contains(commentWords))
		{    
		     training tr = TR.findById(idTraining).get(); 
		     commentT.setTraining(tr);
			commentT.setContent("***");
			Date currentSqlDate= new Date (System.currentTimeMillis());
			commentT.setDateCmt(currentSqlDate);
			CmtR.save(commentT);
			 
		}
		else
		{   
	       training tr = TR.findById(idTraining).get(); 
	       commentT.setTraining(tr);
			
	       Member member = membrerep.findById(id_member).get(); 
	       commentT.setMember(member);
	       
			Date currentSqlDate= new Date (System.currentTimeMillis());
			commentT.setDateCmt(currentSqlDate);
			CmtR.save(commentT);
			
					}

		 return commentT;
	}
	

	@Override
	public CommentTraining updatecomments(CommentTraining ct) {
		String badwords[] = new String[] { 
				  "bad", "words", "bads" };
		String commentWords[] = ct.getContent().split(" ");
		
   for(String a : commentWords){
			 
	   for(String b : badwords){
			 
		if (b.contains(a))
		{   
			ct.setContent("***");
			Date currentSqlDate= new Date (System.currentTimeMillis());
			ct.setDateCmt(currentSqlDate);
			CmtR.save(ct);
			 
		}
		else
		{
			Date currentSqlDate= new Date (System.currentTimeMillis());
			ct.setDateCmt(currentSqlDate);
			CmtR.save(ct);
			
					}}}
         return ct;
	
	
	}

	@Override
	public List<String> findcmtrbyTraining(int idTraining) {
		return CmtR.findcmtrbypublication(idTraining);
		
	}
	
	@Override
	public void assignCmtToTraining(Integer IdTraining, Integer Idcmt) {
		CommentTraining c = CmtR.findById(Idcmt).get();
		c.setTraining(TR.findById(IdTraining).get()); 
		 
		CmtR.save(c);
		
	}

	@Override
	public void deletecom(int idcmt) {
		CmtR.deleteById(idcmt);
		
	}

	


	

}
