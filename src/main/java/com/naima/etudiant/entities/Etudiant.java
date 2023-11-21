package com.naima.etudiant.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Etudiant {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer apogee;
	private String nom;
	private String prenom;
	private String email;
	@Enumerated(EnumType.STRING)
	private Cycle cycle;
	

}
