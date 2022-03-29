package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Certificate;

@Repository
public interface CertificateRepository extends CrudRepository<Certificate, Integer> {
}
