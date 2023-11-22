package com.naima.etudiant.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.naima.etudiant.dto.EtudiantRequestDTO;
import com.naima.etudiant.dto.EtudiantResponseDTO;
import com.naima.etudiant.entities.Etudiant;

@Component
public class EtudiantInterfaceMapImpl implements EtudiantInterfaceMap{

	@Override
	public Etudiant requestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO) {
		// TODO Auto-generated method stub
		Etudiant e = new Etudiant();
		e.setCycle(etudiantRequestDTO.getCycle());
		e.setEmail(etudiantRequestDTO.getEmail());
		e.setNom(etudiantRequestDTO.getNom());
		e.setPrenom(etudiantRequestDTO.getPrenom());
		return e;
	}

	@Override
	public EtudiantResponseDTO etudiant2ResponseDTO(Etudiant etudiant) {
		// TODO Auto-generated method stub
		EtudiantResponseDTO e = new EtudiantResponseDTO();
		BeanUtils.copyProperties(etudiant, e);
		return e;
	}

}
