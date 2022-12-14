package ca.bdeb.projetsynthese.services;

import ca.bdeb.projetsynthese.dao.IAdministrateurRepository;
import ca.bdeb.projetsynthese.dto.LoginDTO;
import ca.bdeb.projetsynthese.models.Administrateur;
import ca.bdeb.projetsynthese.models.Proprietaire;
import ca.bdeb.projetsynthese.vo.AdministrateurLoginVO;
import ca.bdeb.projetsynthese.vo.ProprietaireLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrateurService {

    @Autowired
    private IAdministrateurRepository repository;

    // récupérer la list de l'administrateur
    public List<Administrateur> getAdministrateurList() {
        return repository.findAll();
    }

    // récupérer l'administrateur spécifié par id
    public Administrateur getAdministrateurById(Integer id) {
        return repository.findById(id).get();
    }

    // récupérer l'administrateur spécifié par nom
    public Administrateur getAdministrateurByName(String nom){
        return repository.findByNomAdministrateur(nom);
    }

    // ajouter un administrateur
    public Administrateur addAdministrateur(Administrateur administrateur) {
        return repository.save(administrateur);
    }

    // modifier un administrateur
    public Administrateur updateAdministrateur(Administrateur administrateur) {
        return repository.save(administrateur);
    }

    // supprimer un administrateur
    public void deleteAdministrateur(Integer id) {
        repository.deleteById(id);
    }

    public AdministrateurLoginVO login(LoginDTO loginDTO) {
        Administrateur administrateur = repository.findByNomAdministrateur(loginDTO.getEmail());
        if (administrateur != null) {
            if (administrateur.getMotDePasse().equals(loginDTO.getPassword())) {
                return new AdministrateurLoginVO("Bienvenu " + administrateur.getNomAdministrateur(), administrateur);
            }else{
                return new AdministrateurLoginVO("Mot de passe n'est pas correct!", null);
            }
        }else{
            return new AdministrateurLoginVO("Utilisateur n'exist pas, S'inscrire S.V.P",null);
        }
    }
}
