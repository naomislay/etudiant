package com.naima.etudiant;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.naima.etudiant.entities.Cycle;
import com.naima.etudiant.entities.Etudiant;
import com.naima.etudiant.repositories.EtudiantRepository;

@SpringBootApplication
public class EtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
		
	}
	
	@Bean
	CommandLineRunner start(EtudiantRepository etudiantRepository) {
		return args -> {
			for(int i=0; i<10; i++) {
			Etudiant e = Etudiant.builder()
					.nom("nom"+i)
					.prenom("prenom"+i)
					.email("email"+i+"@gmail.com")
					.cycle(Math.random()>0.5?Cycle.DEUG:Cycle.LICENCE)
					.build();
			etudiantRepository.save(e);
			}
	
	
		};
	}

}
