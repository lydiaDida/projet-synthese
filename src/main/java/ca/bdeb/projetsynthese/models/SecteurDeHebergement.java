package ca.bdeb.projetsynthese.models;

import javax.persistence.*;

/**
 * Created by Thomas Wang on 10/27/2022.
 */
@Entity
@Table(name = "SecteurDeHebergement")
public class SecteurDeHebergement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
