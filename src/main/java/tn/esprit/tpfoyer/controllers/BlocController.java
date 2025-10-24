package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/blocController")
public class BlocController {
    @Autowired
    IBlocService blocService;
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc bloc){
        return blocService.addOrUpdateBloc(bloc);
    }

    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc bloc){
        return blocService.addOrUpdateBloc(bloc);
    }

    @DeleteMapping("/deleteBloc/{idBloc}")
    void deleteBloc(@PathVariable long idBloc){
        blocService.deleteBloc(idBloc);

    }
    @GetMapping("/findAllBloc")
    List<Bloc> findAllBloc(){
        return  blocService.getAllBlocs();
    }

    @GetMapping("/findById/{idBloc}")
    Bloc findById(@PathVariable long idBloc){
        return blocService.getBloc(idBloc);
    }
}