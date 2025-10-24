package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addOrUpdateFoyer(Foyer foyer);

    void deleteFoyer(long id);

    List<Foyer> getAllFoyers();

    Foyer getFoyer(long id);
}
