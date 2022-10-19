package ca.bdeb.reservation.dao;

import ca.bdeb.reservation.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins= "http://4200")
@RepositoryRestResource
public interface ICategorieDAO extends JpaRepository<Categorie, Long> {
}
