package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiantController")
public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addOrUpdateEtudiant(etudiant);
    }

    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addOrUpdateEtudiant(etudiant);
    }

    @DeleteMapping("/deleteEtudiant/{idEtudiant}")
    void deleteEtudiant(@PathVariable long idEtudiant){
        etudiantService.deleteEtudiant(idEtudiant);

    }
    @GetMapping("/findAllEtudiant")
    List<Etudiant> findAllEtudiant(){
        return  etudiantService.getAllEtudiants();
    }

    @GetMapping("/findById/{idEtudiant}")
    Etudiant findById(@PathVariable long idEtudiant){
        return etudiantService.getEtudiant(idEtudiant);
    }
}