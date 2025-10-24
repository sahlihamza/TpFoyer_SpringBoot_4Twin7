package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    Etudiant addOrUpdateEtudiant(Etudiant etudiant);

    void deleteEtudiant(long id);

    List<Etudiant> getAllEtudiants();

    Etudiant getEtudiant(long id);
}
