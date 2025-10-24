package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.repositories.FoyerRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class FoyerService implements IFoyerService{
    FoyerRepository etudiantRepository;
    @Override
    public Foyer addOrUpdateFoyer(Foyer etudiant) {
        return etudiantRepository.save(etudiant) ;
    }

    @Override
    public void deleteFoyer(long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public List<Foyer> getAllFoyers() {
        return etudiantRepository.findAll();
    }

    @Override
    public Foyer getFoyer(long id) {
        return etudiantRepository.findById(id).get();
    }
}
