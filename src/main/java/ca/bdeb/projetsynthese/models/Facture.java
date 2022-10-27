package ca.bdeb.projetsynthese.models;

import javax.persistence.*;

/**
 * Created by Thomas Wang on 10/27/2022.
 */
@Entity
@Table(name = "Facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroDeFacture;

    @Column(name = "sommeDeSejout")
    private float sommeDeSejout;

    @Column(name = "fraisDeNettoyage")
    private float fraisDeNettoyage;

    @Column(name = "fraisDeService")
    private float fraisDeService;

    @Column(name = "tax")
    private float tax;

    @Column(name = "total")
    private float total;

    /** relation **/
    // relation(1:n) Locataire(1) <===> Facture(n)
    @ManyToOne
    @JoinColumn(name = "emailLocataire",
                referencedColumnName = "emailLocataire")
    private Locataire locataire;

    // relation(1:1) Reservation(1) <===> Facture(1)
    @OneToOne(mappedBy = "facture")
    private Reservation reservation;
    /** fin relation **/

    // constructor
    public Facture() {
    }

    public Facture(float sommeDeSejout,
                   float fraisDeNettoyage,
                   float fraisDeService,
                   float tax,
                   float total,
                   Locataire locataire,
                   Reservation reservation) {
        this.sommeDeSejout = sommeDeSejout;
        this.fraisDeNettoyage = fraisDeNettoyage;
        this.fraisDeService = fraisDeService;
        this.tax = tax;
        this.total = total;
        this.locataire = locataire;
        this.reservation = reservation;
    }

    public int getNumeroDeFacture() {
        return numeroDeFacture;
    }

    public float getSommeDeSejout() {
        return sommeDeSejout;
    }

    public void setSommeDeSejout(float sommeDeSejout) {
        this.sommeDeSejout = sommeDeSejout;
    }

    public float getFraisDeNettoyage() {
        return fraisDeNettoyage;
    }

    public void setFraisDeNettoyage(float fraisDeNettoyage) {
        this.fraisDeNettoyage = fraisDeNettoyage;
    }

    public float getFraisDeService() {
        return fraisDeService;
    }

    public void setFraisDeService(float fraisDeService) {
        this.fraisDeService = fraisDeService;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Locataire getLocataire() {
        return locataire;
    }

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "numeroDeFacture=" + numeroDeFacture +
                ", sommeDeSejout=" + sommeDeSejout +
                ", fraisDeNettoyage=" + fraisDeNettoyage +
                ", fraisDeService=" + fraisDeService +
                ", tax=" + tax +
                ", total=" + total +
                ", locataire=" + locataire +
                '}';
    }
}
