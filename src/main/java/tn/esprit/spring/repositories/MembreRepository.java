package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.Member;

public interface MembreRepository extends JpaRepository< Member, Integer> {

}
