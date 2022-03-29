package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Member;

@Service
public class EmailService {
	
	@Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(Member member) {
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo(member.getEmail()); 
        message.setSubject("New trainings available..."); 
        message.setText(String.format(
        		"Hello Mr. %s"
        		+ "\n\nI hope you are doing well."
        		+ "\nI am sending you this email to inform you about the new trainings. Make sure to take a look and participate."
        		+ ""
        		+ "\n\nCordially,", 
        			member.getNom() + " " + member.getPrenom()
        		));
        emailSender.send(message);
    }

}
