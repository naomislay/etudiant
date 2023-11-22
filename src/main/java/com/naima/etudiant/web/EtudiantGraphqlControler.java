package com.naima.etudiant.web;

import com.naima.etudiant.dto.EtudiantRequestDTO;
import com.naima.etudiant.entities.Etudiant;
import com.naima.etudiant.mapper.EtudiantInterfaceMap;
import com.naima.etudiant.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class EtudiantGraphqlControler {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    EtudiantInterfaceMap etudiantInterfaceMap;

    @QueryMapping
    public List<Etudiant> listerEtudiants() { return etudiantRepository.findAll();}

    @QueryMapping
    public Etudiant etudiantById(@Argument Integer id){
        return etudiantRepository.findById(id).orElseThrow(()->
                new RuntimeException(String.format("Etudiant %d not found",id)));
    }

    @MutationMapping
    public Etudiant addEtudiant(@Argument EtudiantRequestDTO etudiant){
        Etudiant r = etudiantInterfaceMap.requestDTO2Etudiant(etudiant);
        return etudiantRepository.save(r);
    }
}
