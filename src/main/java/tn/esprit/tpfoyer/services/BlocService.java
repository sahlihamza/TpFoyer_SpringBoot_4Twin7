package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.repositories.BlocRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class BlocService implements IBlocService {

    BlocRepository blocRepository;

    @Override
    public Bloc addOrUpdateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(long id) {
        blocRepository.deleteById(id);

    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getBloc(long id) {
        return blocRepository.findById(id).get();
    }
}
