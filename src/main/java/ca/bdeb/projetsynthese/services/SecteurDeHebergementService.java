package ca.bdeb.projetsynthese.services;


import ca.bdeb.projetsynthese.dao.SecteurDeHebergementRepository;
import ca.bdeb.projetsynthese.models.SecteurDeHebergement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Thomas Wang on 11/7/2022.
 */
@Service
public class SecteurDeHebergementService {
    @Autowired
    private SecteurDeHebergementRepository secteurDeHebergementRepository;

    public List<SecteurDeHebergement> getSecteurDeHebergementList(){
        return secteurDeHebergementRepository.findAll();
    }

}
