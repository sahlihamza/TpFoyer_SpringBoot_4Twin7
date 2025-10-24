package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservationController")
public class ReservationController {
    @Autowired
    IReservationService reservationService;
    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation reservation){
        return reservationService.addOrUpdateReservation(reservation);
    }

    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation reservation){
        return reservationService.addOrUpdateReservation(reservation);
    }

    @DeleteMapping("/deleteReservation/{idReservation}")
    void deleteReservation(@PathVariable String idReservation){
        reservationService.deleteReservation(idReservation);

    }
    @GetMapping("/findAllReservation")
    List<Reservation> findAllReservation(){
        return  reservationService.getAllReservations();
    }

    @GetMapping("/findById/{idReservation}")
    Reservation findById(@PathVariable String idReservation){
        return reservationService.getReservation(idReservation);
    }
}