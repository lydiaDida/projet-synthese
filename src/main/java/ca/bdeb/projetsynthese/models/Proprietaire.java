package ca.bdeb.projetsynthese.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas Wang on 10/26/2022.
 */
@Entity
@Table(name = "Proprietaire")
public class Proprietaire {
    @Id
    @Column(name = "emailProprietaire")
    private String emailProprietaire;

    @Column(name = "motDePasse")
    private String motDePasse;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "etatDeProprietaire")
    private boolean etatDeProprietaire;

    // relation(1:1) Proprietaire et Adresse
    // one way mapping, it need not two ways mapping
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAdresse", referencedColumnName = "id")
    private Adresse adresse;

    // relation(1:n) Proprietaire(1) et Hebergement(n)
     @OneToMany(mappedBy = "proprietaire",
                fetch = FetchType.EAGER,
                cascade = CascadeType.ALL)
     private List<Hebergement> hebergementList = new ArrayList<>();

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
