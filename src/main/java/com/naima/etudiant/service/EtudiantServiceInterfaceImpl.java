package com.naima.etudiant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naima.etudiant.dto.EtudiantRequestDTO;
import com.naima.etudiant.dto.EtudiantResponseDTO;
import com.naima.etudiant.entities.Etudiant;
import com.naima.etudiant.mapper.EtudiantInterfaceMap;
import com.naima.etudiant.repositories.EtudiantRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EtudiantServiceInterfaceImpl implements EtudiantServiceInterface{
	@Autowired
	EtudiantRepository etudiantRepository ;
	@Autowired
	EtudiantInterfaceMap etudiantInterfaceMap;

	@Override
	public EtudiantResponseDTO findById(Integer apogee) {
		// TODO Auto-generated method stub
		Etudiant e = etudiantRepository.findById(apogee).get();
		EtudiantResponseDTO er = etudiantInterfaceMap.etudiant2ResponseDTO(e);
		return er;
	}

	@Override
	public void add(EtudiantRequestDTO etudiantRequestDTO) {
		// TODO Auto-generated method stub
		Etudiant e = etudiantInterfaceMap.requestDTO2Etudiant(etudiantRequestDTO);
		etudiantRepository.save(e);
		
	}

	@Override
	public void update(Integer apogee, EtudiantRequestDTO etudiantRequestDTO) {
		// TODO Auto-generated method stub
		Etudiant e = etudiantRepository.findById(apogee).get();
		if(etudiantRequestDTO.getCycle()!=null) {e.setCycle(etudiantRequestDTO.getCycle());}
		if(etudiantRequestDTO.getEmail()!=null) {e.setEmail(etudiantRequestDTO.getEmail());}
		if(etudiantRequestDTO.getNom()!=null) {e.setNom(etudiantRequestDTO.getNom());}
		if(etudiantRequestDTO.getPrenom()!=null) {e.setPrenom(etudiantRequestDTO.getPrenom());}
		if(e.getCycle()!=null) {e.setCycle(e.getCycle());}
		if(e.getEmail()!=null) {e.setEmail(e.getEmail());}
		if(e.getNom()!=null) {e.setNom(e.getNom());}
		if(e.getPrenom()!=null) {e.setPrenom(e.getPrenom());}
		etudiantRepository.save(e);
		
	}

	@Override
	public void delete(Integer apogee) {
		// TODO Auto-generated method stub
		etudiantRepository.deleteById(apogee);
		
	}

	@Override
	public List<EtudiantResponseDTO> listeEtudiant() {
		// TODO Auto-generated method stub
		List<Etudiant> list = etudiantRepository.findAll();
		List<EtudiantResponseDTO> listdto = new ArrayList();
		for(Etudiant e : list) {listdto.add(etudiantInterfaceMap.etudiant2ResponseDTO(e));}
		return listdto;
	}

}
