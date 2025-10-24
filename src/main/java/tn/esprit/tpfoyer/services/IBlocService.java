package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addOrUpdateBloc(Bloc bloc);

    void deleteBloc(long id);

    List<Bloc> getAllBlocs();

    Bloc getBloc(long id);
}
