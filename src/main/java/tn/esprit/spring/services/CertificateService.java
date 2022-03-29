package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Certificate;


public interface CertificateService {
	
	public Certificate AddCert ( Certificate C);
	public Certificate updateCert(Certificate C);
	public void DeleteCert ( Certificate C);
	public void DeleteCertById (Integer IdCert );
	List<Certificate> getAllCert();
	Certificate getCert (Integer IdCert);
	

}
