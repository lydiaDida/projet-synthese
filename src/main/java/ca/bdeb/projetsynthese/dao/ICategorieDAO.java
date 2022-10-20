package ca.bdeb.projetsynthese.dao;
import ca.bdeb.projetsynthese.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
public interface ICategorieDAO extends JpaRepository<Categorie, Long> {
}
