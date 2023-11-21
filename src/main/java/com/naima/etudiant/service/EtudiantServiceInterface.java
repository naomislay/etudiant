package com.naima.etudiant.service;

import java.util.List;

import com.naima.etudiant.dto.EtudiantRequestDTO;
import com.naima.etudiant.dto.EtudiantResponseDTO;

public interface EtudiantServiceInterface {
	
	public EtudiantResponseDTO findById(Integer apogee);
	public void add(EtudiantRequestDTO etudiantRequestDTO);
	public void update(Integer apogee,EtudiantRequestDTO etudiantRequestDTO);
	public void delete(Integer apogee);
	public List<EtudiantResponseDTO> listeEtudiant();

}
