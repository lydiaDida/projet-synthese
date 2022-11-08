package ca.bdeb.projetsynthese.models;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

/**
 * Created by Thomas Wang on 10/27/2022.
 */
@Entity
@Table(name = "SecteurDeHebergement")
@Validated
public class SecteurDeHebergement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Length(min = 1, max = 50, message = "La longuer de secteur doit entre 1 et 50")
    @Column(name = "secteurDeHebergement", columnDefinition = "varchar(50)")
    private String secteurDeHebergement;

    // constructor
    public SecteurDeHebergement() {
    }

    public SecteurDeHebergement(String secteurDeHebergement) {
        this.secteurDeHebergement = secteurDeHebergement;
    }

    public int getId() {
        return id;
    }

    public String getSecteurDeHebergement() {
        return secteurDeHebergement;
    }

    public void setSecteurDeHebergement(String secteurDeHebergement) {
        this.secteurDeHebergement = secteurDeHebergement;
    }

    @Override
    public String toString() {
        return "SecteurDeHebergement{" +
                "id=" + id +
                ", secteurDeHebergement='" + secteurDeHebergement + '\'' +
                '}';
    }
}
