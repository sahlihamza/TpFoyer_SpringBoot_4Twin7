package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.repositories.ReservationRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class ReservationService implements IReservationService{
    ReservationRepository etudiantRepository;
    @Override
    public Reservation addOrUpdateReservation(Reservation etudiant) {
        return etudiantRepository.save(etudiant) ;
    }

    @Override
    public void deleteReservation(String id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public List<Reservation> getAllReservations() {
        return etudiantRepository.findAll();
    }

    @Override
    public Reservation getReservation(String id) {
        return etudiantRepository.findById(id).get();
    }
}
