package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Certificate;
import tn.esprit.spring.repositories.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService{
	
	@Autowired 
	private CertificateRepository Cr;

	@Override
	public Certificate AddCert(Certificate C) {
		return Cr.save(C);
	}

	@Override
	public void DeleteCert(Certificate C) {
		Cr.delete(C);
		
	}

	@Override
	public void DeleteCertById(Integer IdCert) {
		Cr.deleteById(IdCert);
		
	}

	@Override
	public List<Certificate> getAllCert() {
		return (List<Certificate>) Cr.findAll();
	}

	@Override
	public Certificate getCert(Integer IdCert) {
		return Cr.findById(IdCert).get();
	}

	@Override
	public Certificate updateCert(Certificate C) {
		
		return Cr.save(C);
	}

	
	

}
