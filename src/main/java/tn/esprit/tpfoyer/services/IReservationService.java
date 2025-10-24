package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addOrUpdateReservation(Reservation bloc);

    void deleteReservation(String id);

    List<Reservation> getAllReservations();

    Reservation getReservation(String id);
}
