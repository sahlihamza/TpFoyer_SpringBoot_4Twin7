package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.repositories.EtudiantRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addOrUpdateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant) ;
    }

    @Override
    public void deleteEtudiant(long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiant(long id) {
        return etudiantRepository.findById(id).get();
    }
}
