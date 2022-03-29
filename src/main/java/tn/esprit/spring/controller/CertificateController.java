package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Certificate;
import tn.esprit.spring.services.CertificateServiceImpl;
@RestController
@RequestMapping("/eve")
public class CertificateController {

	@Autowired
	CertificateServiceImpl certifService ; 
	
	
	@PostMapping("/add-cert")
	public Certificate AddCert(@RequestBody Certificate C){
		Certificate cert = certifService.AddCert(C);
		return cert;
	}
	
	@DeleteMapping("/delete-cert/{IdCert}")
	public void DeleteCertById(@PathVariable Integer IdCert) {
		certifService.DeleteCertById(IdCert);
		
	}
	
	
	@PutMapping("updateCert")
	public Certificate updateCert(Certificate C){
		return certifService.updateCert(C);
	}
	
	
	@GetMapping("get-all-Cert")
	public List<Certificate> getAllCert() {
		return certifService.getAllCert();
	}
	
	@GetMapping("get-certId/{IdCert}")
	Certificate getCert (@PathVariable Integer IdCert){
		return certifService.getCert(IdCert);
		
	}
	
	
}
