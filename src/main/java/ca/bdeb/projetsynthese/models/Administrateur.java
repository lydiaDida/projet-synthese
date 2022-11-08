package ca.bdeb.projetsynthese.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    @NotNull
    @Column(name = "nomAdministrateur", columnDefinition= "varchar(50)")
    private String nomAdministrateur;

    @NotNull
    @Column(name = "motDePasse", columnDefinition = "varchar(25)")
    private String motDePasse;

    // constructor
    public Administrateur() {
    }

    public Administrateur(String nomAdministrateur, String motDePasse) {
        this.nomAdministrateur = nomAdministrateur;
        this.motDePasse = motDePasse;
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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String toString() {
        return "Administrateur{" +
                "id=" + id +
                ", nomAdministrateur='" + nomAdministrateur + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }
}
