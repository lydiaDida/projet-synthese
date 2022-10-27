package ca.bdeb.projetsynthese.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas Wang on 10/26/2022.
 */
@Entity
@Table(name = "Locataire")
public class Locataire {
    @Id
    @Column(name = "emailLocataire")
    private String emailLocataire;

    @Column(name = "motDePasse")
    private String motDePasse;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "etatDeLocataire")
    private boolean etatDeLocataire;

    // relation(1:1) Locataire(1) et Adresse(1)
    // one way mapping, it need not two ways mapping
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAdresse", referencedColumnName = "id")
    private Adresse adresse;

    // relation(1:n) Locataire(1) et Commantaire(n)
    @OneToMany(mappedBy = "locataire",
                fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    private List<Commantaire> commantaireList = new ArrayList<>();

    // relation(1:n) Locataire(1) et Facture(n)
     @OneToMany(mappedBy = "locataire",
                fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
     private List<Facture> factureList = new ArrayList<>();

    // relation(1:n) Locataire(1) et Reservation(n)
     @OneToMany

    // constructor
    public Locataire() {
    }

    public Locataire(String emailLocataire, String motDePasse, String nom,
                     String prenom, String telephone, boolean etatDeLocataire,
                     Adresse adresse) {
        this.emailLocataire = emailLocataire;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.etatDeLocataire = etatDeLocataire;
        this.adresse = adresse;
    }

    public String getEmailLocataire() {
        return emailLocataire;
    }

    public void setEmailLocataire(String emailLocataire) {
        this.emailLocataire = emailLocataire;
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

    public boolean isEtatDeLocataire() {
        return etatDeLocataire;
    }

    public void setEtatDeLocataire(boolean etatDeLocataire) {
        this.etatDeLocataire = etatDeLocataire;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Locataire{" +
                "emailLocataire='" + emailLocataire + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", etatDeLocataire=" + etatDeLocataire +
                ", adresse=" + adresse +
                '}';
    }
}
