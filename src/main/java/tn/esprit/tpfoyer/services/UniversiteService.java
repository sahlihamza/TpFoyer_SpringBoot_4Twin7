package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repositories.UniversiteRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class UniversiteService implements IUniversiteService{
    UniversiteRepository etudiantRepository;
    @Override
    public Universite addOrUpdateUniversite(Universite etudiant) {
        return etudiantRepository.save(etudiant) ;
    }

    @Override
    public void deleteUniversite(long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public List<Universite> getAllUniversites() {
        return etudiantRepository.findAll();
    }

    @Override
    public Universite getUniversite(long id) {
        return etudiantRepository.findById(id).get();
    }
}
