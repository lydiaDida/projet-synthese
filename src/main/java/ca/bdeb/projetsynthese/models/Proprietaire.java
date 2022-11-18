package ca.bdeb.projetsynthese.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Proprietaire")
@Validated
public class Proprietaire {
    @Id
    @Column(name = "emailProprietaire", columnDefinition = "varchar(100)")
    @Email(message = "The email address is not a valid email address")
    private String emailProprietaire;

    @NotNull
    @Column(name = "motDePasse", columnDefinition = "varchar(25)")
    private String motDePasse;

    @Column(name = "nom", columnDefinition = "varchar(50)")
    private String nom;

    @Column(name = "prenom", columnDefinition="varchar(50)")
    private String prenom;

    @Column(name = "telephone", columnDefinition = "varchar(25)")
    private String telephone;

    @Column(name = "etatDeProprietaire", columnDefinition = "boolean DEFAULT true")
    private boolean etatDeProprietaire;

    /** relation **/
    // relation(1:1) Proprietaire ===> Adresse
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAdresse", referencedColumnName = "id")
    private Adresse adresse;

    // relation(1:n) Proprietaire(1) <===> Hebergement(n)
     @OneToMany(mappedBy = "proprietaire",
                fetch = FetchType.EAGER,
                cascade = CascadeType.ALL)
     @JsonIgnore
     private List<Hebergement> hebergementList = new ArrayList<>();
    /** fin relation **/

    // constructor
    public Proprietaire() {
    }

    public Proprietaire(String emailProprietaire,
                        String motDePasse,
                        String nom,
                        String prenom,
                        String telephone,
                        boolean etatDeProprietaire,
                        Adresse adresse,
                        List<Hebergement> hebergementList) {
        this.emailProprietaire = emailProprietaire;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.etatDeProprietaire = etatDeProprietaire;
        this.adresse = adresse;
        this.hebergementList = hebergementList;
    }

    public String getEmailProprietaire() {
        return emailProprietaire;
    }

    public void setEmailProprietaire(String emailProprietaire) {
        this.emailProprietaire = emailProprietaire;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public boolean isEtatDeProprietaire() {
        return etatDeProprietaire;
    }

    public void setEtatDeProprietaire(boolean etatDeProprietaire) {
        this.etatDeProprietaire = etatDeProprietaire;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Hebergement> getHebergementList() {
        return hebergementList;
    }

//    public void setHebergementList(List<Hebergement> hebergementList) {
//        this.hebergementList = hebergementList;
//    }

    @Override
    public String toString() {
        return "Proprietaire{" +
                "emailProprietaire='" + emailProprietaire + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", etatDeProprietaire=" + etatDeProprietaire +
                ", adresse=" + adresse +
                '}';
    }
}
