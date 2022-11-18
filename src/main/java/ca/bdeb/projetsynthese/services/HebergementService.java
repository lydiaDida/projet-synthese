package ca.bdeb.projetsynthese.services;
import ca.bdeb.projetsynthese.dao.IHebergementRepository;
import ca.bdeb.projetsynthese.models.Hebergement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class HebergementService {


    @Autowired
    private IHebergementRepository IHebergementRepository;
    private List listHebergement = new ArrayList<>();

    // récupérer la list des hebergements
    public List<Hebergement> getListHebergement() {

        return IHebergementRepository.findAll();

    }
    // récupérer hebergement avec son id
    public Hebergement getAdministrateurById(Integer id) {
        return IHebergementRepository.findById(id).get();
    }



    // ajouter un hebergement
    public Hebergement addHebergement(Hebergement hebergement) {
        return IHebergementRepository.save(hebergement);
    }

    // modifier un hebergement
    public Hebergement updateHebergement(Hebergement hebergement) {
        return IHebergementRepository.save(hebergement);
    }

    // supprimer un hebergement
    public void deleteHebergement(Integer id) {
        IHebergementRepository.deleteById(id);
    }

}
