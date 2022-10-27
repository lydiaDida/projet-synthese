package ca.bdeb.projetsynthese.models;


import javax.persistence.*;

/**
 * Created by Thomas Wang on 10/26/2022.
 */
@Entity
@Table(name = "Administrateur")
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nomAdministrateur")
    private String nomAdministrateur;

    @Column(name = "motDepasse")
    private String motDepasse;

    // constructor
    public Administrateur() {
    }

    public Administrateur(String nomAdministrateur, String motDepasse) {
        this.nomAdministrateur = nomAdministrateur;
        this.motDepasse = motDepasse;
    }

    // setter and getter
    public int getId() {
        return id;
    }

    public String getNomAdministrateur() {
        return nomAdministrateur;
    }

    public void setNomAdministrateur(String nomAdministrateur) {
        this.nomAdministrateur = nomAdministrateur;
    }

    public String getMotDepasse() {
        return motDepasse;
    }

    public void setMotDepasse(String motDepasse) {
        this.motDepasse = motDepasse;
    }

    @Override
    public String toString() {
        return "Administrateur{" +
                "id=" + id +
                ", nomAdministrateur='" + nomAdministrateur + '\'' +
                ", motDepasse='" + motDepasse + '\'' +
                '}';
    }
}
