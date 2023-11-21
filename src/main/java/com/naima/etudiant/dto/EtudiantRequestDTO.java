package com.naima.etudiant.dto;



import com.naima.etudiant.entities.Cycle;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class EtudiantRequestDTO {
	
	private String nom;
	private String prenom;
	private String email;
	private Cycle cycle;

}
