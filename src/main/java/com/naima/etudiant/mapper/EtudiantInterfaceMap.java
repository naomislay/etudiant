package com.naima.etudiant.mapper;

import com.naima.etudiant.dto.EtudiantRequestDTO;
import com.naima.etudiant.dto.EtudiantResponseDTO;
import com.naima.etudiant.entities.Etudiant;

public interface EtudiantInterfaceMap {
	
	public Etudiant requestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO);
	public EtudiantResponseDTO etudiant2ResponseDTO(Etudiant etudiant);

}
