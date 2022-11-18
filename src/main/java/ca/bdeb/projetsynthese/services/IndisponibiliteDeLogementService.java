package ca.bdeb.projetsynthese.services;

import ca.bdeb.projetsynthese.dao.IHebergementRepository;
import ca.bdeb.projetsynthese.dao.IIndisponibiliteDeLogementRepository;
import ca.bdeb.projetsynthese.models.Hebergement;
import ca.bdeb.projetsynthese.models.IndisponibiliteDeLogement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class IndisponibiliteDeLogementService {
    @Autowired
    private IIndisponibiliteDeLogementRepository repository;

    @Autowired
    private IHebergementRepository IHebergementRepository;

    // get indisponibiliteDeLogement list
    public List<IndisponibiliteDeLogement> getIndisponibiliteDeLogementList() {
        return repository.findAll();
    }

    // get indisponibiliteDeLogement by id
    public IndisponibiliteDeLogement getIndisponibiliteDeLogementById(Integer id) {
        return repository.findById(id).get();
    }

    // add new indisponibilite de logement
    public IndisponibiliteDeLogement addIndisponibiliteDeLogement(
            @RequestBody IndisponibiliteDeLogement indisponibiliteDeLogement){
        // get hebergement for this indisponibiliteDeLogement
        Hebergement hebergement =
                IHebergementRepository.findById(indisponibiliteDeLogement.getHebergement().getId()).get();
        indisponibiliteDeLogement.setHebergement(hebergement);

        return repository.save(indisponibiliteDeLogement);
    }

    // update indisponibilite de logement
    public IndisponibiliteDeLogement updateIndisponibiliteDeLogement(
            @RequestBody IndisponibiliteDeLogement indisponibiliteDeLogement) {
        IndisponibiliteDeLogement indisponibiliteDeLogementExist =
                repository.findById(indisponibiliteDeLogement.getId()).get();
        if(indisponibiliteDeLogementExist != null){
            indisponibiliteDeLogementExist = indisponibiliteDeLogement;
            // get hebergement fot this indisponibiliteDeLogement
            Hebergement hebergement =
                    IHebergementRepository.findById(indisponibiliteDeLogement.getHebergement().getId()).get();
            indisponibiliteDeLogementExist.setHebergement(hebergement);
            return repository.save(indisponibiliteDeLogementExist);
        }else{
            return null;
        }
    }

    // delete indisponibilite de logement
    public void deleteIndisponibiliteDeLogement(Integer id){
        repository.deleteById(id);
    }
}
