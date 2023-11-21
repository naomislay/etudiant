package com.naima.etudiant.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naima.etudiant.dto.EtudiantRequestDTO;
import com.naima.etudiant.dto.EtudiantResponseDTO;
import com.naima.etudiant.service.EtudiantServiceInterface;




@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController{
	
	@Autowired
	EtudiantServiceInterface etudiantServiceInterface ;
	
	@PostMapping("/etudiant")
	public void add(@RequestBody EtudiantRequestDTO etudiantRequestDTO) {
		
		etudiantServiceInterface.add(etudiantRequestDTO);
		
	}
	
	@PutMapping("/etudiant/{id}")
	public void update(@PathVariable("id")Integer apogee,@RequestBody  EtudiantRequestDTO etudiantRequestDTO) {
		
		etudiantServiceInterface.update(apogee, etudiantRequestDTO);
	}
	
	@DeleteMapping("/etudiant/{id}")
	public void delete(@PathVariable("id") Integer apogee) {
		
		etudiantServiceInterface.delete(apogee);
	}
	
	@GetMapping("/etudiant/{id}")
	public EtudiantResponseDTO findById(@PathVariable("id") Integer apogee) {
		return etudiantServiceInterface.findById(apogee);
	}
	
	@GetMapping("/etudiant")
	public List<EtudiantResponseDTO> listeEtudiant(){
		
		return etudiantServiceInterface.listeEtudiant();
	}

}
