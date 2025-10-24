package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.repositories.ChambreRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    @Override
    public Chambre addOrUpdateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(long id) {
        chambreRepository.deleteById(id);

    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre getChambre(long id) {
        return chambreRepository.findById(id).get();
    }
}
