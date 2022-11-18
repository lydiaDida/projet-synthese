package ca.bdeb.projetsynthese.services;

import ca.bdeb.projetsynthese.dao.*;
import ca.bdeb.projetsynthese.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HebergementService {

    @Autowired
    private IHebergementRepository repository;
    @Autowired
    private IAdresseRepository adresseRepository;
    @Autowired
    private IProprietaireRepository proprietaireRepository;
    @Autowired
    private ITypeDeHebergementRepository typeDeHebergementRepository;
    @Autowired
    private ISecteurDeHebergementRepository secteurDeHebergementRepository;

    // récupérer la list des hebergements
    public List<Hebergement> getList() {
        return repository.findAll();
    }

    // récupérer hebergement avec son id
    public Hebergement getById(Integer id) {
        return repository.findById(id).get();
    }

    // ajouter un hebergement
    public Hebergement add(Hebergement hebergement) {

        Adresse adresse =
                adresseRepository.findById(hebergement.getAdresse().getId()).get();
        Proprietaire proprietaire =
                proprietaireRepository.findByEmailProprietaire(hebergement.getProprietaire().getEmailProprietaire());
        TypeDeHebergement typeDeHebergement =
                typeDeHebergementRepository.findById(hebergement.getTypeDeHebergement().getId()).get();
        SecteurDeHebergement secteurDeHebergement =
                secteurDeHebergementRepository.findById(hebergement.getSecteurDeHebergement().getId()).get();
        hebergement.setAdresse(adresse);
        hebergement.setProprietaire(proprietaire);
        hebergement.setTypeDeHebergement(typeDeHebergement);
        hebergement.setSecteurDeHebergement(secteurDeHebergement);
        return repository.save(hebergement);
    }

    // modifier un hebergement
    public Hebergement update(Hebergement hebergement) {
        Hebergement hebergementExisted = repository.findById(hebergement.getId()).get();

        if(hebergementExisted != null) {
            hebergementExisted = hebergement;
            Adresse adresse =
                    adresseRepository.findById(hebergement.getAdresse().getId()).get();
            Proprietaire proprietaire =
                    proprietaireRepository.findByEmailProprietaire(hebergement.getProprietaire().getEmailProprietaire());
            TypeDeHebergement typeDeHebergement =
                    typeDeHebergementRepository.findById(hebergement.getTypeDeHebergement().getId()).get();
            SecteurDeHebergement secteurDeHebergement =
                    secteurDeHebergementRepository.findById(hebergement.getSecteurDeHebergement().getId()).get();
            hebergement.setAdresse(adresse);
            hebergement.setProprietaire(proprietaire);
            hebergement.setTypeDeHebergement(typeDeHebergement);
            hebergement.setSecteurDeHebergement(secteurDeHebergement);
            return repository.save(hebergementExisted);
        }else{
            return null;
        }

    }

    // supprimer un hebergement
    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
