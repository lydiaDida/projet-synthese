package ca.bdeb.projetsynthese.dao;

import ca.bdeb.projetsynthese.models.IndisponibiliteDeLogement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIndisponibiliteDeLogementRepository
        extends JpaRepository<IndisponibiliteDeLogement, Integer> {
}
