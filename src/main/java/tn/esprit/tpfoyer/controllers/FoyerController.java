package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyerController")
public class FoyerController {
    @Autowired
    IFoyerService foyerService;
    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer foyer){
        return foyerService.addOrUpdateFoyer(foyer);
    }

    @PutMapping("/updateFoyer")
    Foyer updateFoyer(@RequestBody Foyer foyer){
        return foyerService.addOrUpdateFoyer(foyer);
    }

    @DeleteMapping("/deleteFoyer/{idFoyer}")
    void deleteFoyer(@PathVariable long idFoyer){
        foyerService.deleteFoyer(idFoyer);

    }
    @GetMapping("/findAllFoyer")
    List<Foyer> findAllFoyer(){
        return  foyerService.getAllFoyers();
    }

    @GetMapping("/findById/{idFoyer}")
    Foyer findById(@PathVariable long idFoyer){
        return foyerService.getFoyer(idFoyer);
    }
}