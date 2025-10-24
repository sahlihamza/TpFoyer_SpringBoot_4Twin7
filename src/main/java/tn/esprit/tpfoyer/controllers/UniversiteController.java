package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/UniversiteController")
public class UniversiteController {
    @Autowired
    IUniversiteService universiteService;
    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite universite){
        return universiteService.addOrUpdateUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite universite){
        return universiteService.addOrUpdateUniversite(universite);
    }

    @DeleteMapping("/deleteUniversite/{idUniversite}")
    void deleteUniversite(@PathVariable long idUniversite){
        universiteService.deleteUniversite(idUniversite);

    }
    @GetMapping("/findAllUniversite")
    List<Universite> findAllUniversite(){
        return  universiteService.getAllUniversites();
    }

    @GetMapping("/findById/{idUniversite}")
    Universite findById(@PathVariable long idUniversite){
        return universiteService.getUniversite(idUniversite);
    }
}
