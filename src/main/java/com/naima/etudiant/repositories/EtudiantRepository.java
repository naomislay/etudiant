package com.naima.etudiant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import com.naima.etudiant.entities.Etudiant;


public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

}
