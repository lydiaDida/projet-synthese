package ca.bdeb.projetsynthese.dao;

import ca.bdeb.projetsynthese.models.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Integer> {
}
