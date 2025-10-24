package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambreController")
public class ChambreController {
    @Autowired
    IChambreService chambreService;
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre Chambre){
        return chambreService.addOrUpdateChambre(Chambre);
    }

    @PutMapping("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre Chambre){
        return chambreService.addOrUpdateChambre(Chambre);
    }

    @DeleteMapping("/deleteChambre/{idChambre}")
    void deleteChambre(@PathVariable long idChambre){
        chambreService.deleteChambre(idChambre);

    }
    @GetMapping("/findAllChambre")
    List<Chambre> findAllChambre(){
        return  chambreService.getAllChambres();
    }

    @GetMapping("/findById/{idChambre}")
    Chambre findById(@PathVariable long idChambre){
        return chambreService.getChambre(idChambre);
    }
}