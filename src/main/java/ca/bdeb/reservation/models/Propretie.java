package ca.bdeb.reservation.models;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Propretie implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String desciption;
    private String photos;
    private double prixCourant;
    @ManyToOne
    private Categorie categorie;

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public Propretie(Long id, String nom, String desciption, String photos, double prixCourant, Categorie categorie) {
        this.id = id;
        this.nom = nom;
        this.desciption = desciption;
        this.photos = photos;
        this.prixCourant = prixCourant;
        this.categorie = categorie;
    }

    public Propretie() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public double getPrixCourant() {
        return prixCourant;
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }



}
