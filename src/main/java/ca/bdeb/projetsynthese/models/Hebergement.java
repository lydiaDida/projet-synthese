package ca.bdeb.projetsynthese.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas Wang on 10/27/2022.
 */
@Entity
@Table(name = "Hebergement")
public class Hebergement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "prix")
    private float prix;

    @Column(name = "fraisDeNettoyage")
    private float fraisDeNettoyage;

    @Column(name = "fraisDeService")
    private float fraisDeService;

    @Column(name = "repertoireDePhoto")
    private String repertoireDePhoto;

    @Column(name = "etatDeHebergement")
    private boolean etatDeHebergement;

    /** relation **/
    // relation(1:1) Hebergement(1) ===> Adresse(1)
    @OneToOne
    @JoinColumn(name = "idAdresse")
    private Adresse adresse;

    // relation(1:n) Proprietaire(1) <===> Hebergement(n)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emailProprietaire",
                referencedColumnName = "emailProprietaire")
    private Proprietaire proprietaire;

    // relation(1:1) Hebergement(1) ===> TypeDeHebergement(1)
    @OneToOne
    @JoinColumn(name = "idTypeDeHebergement")
    private TypeDeHebergement typeDeHebergement;

    // relation(1:1) Hebergement(1) ===> SecteurDeHebergement(1)
    @OneToOne
    @JoinColumn(name = "idSecteurDeHebergement")
    private SecteurDeHebergement secteurDeHebergement;

    // relation(1:n) Hebergement(1) <===> DisponibiliteDeLogement(n)
    @OneToMany(mappedBy = "hebergement")
    private List<DisponibiliteDeLogement> disponibiliteDeLogementList = new ArrayList<>();
    /** fin relation **/

    // constructor
    public Hebergement() {
    }

    public Hebergement(float prix,
                       float fraisDeNettoyage,
                       float fraisDeService,
                       String repertoireDePhoto,
                       boolean etatDeHebergement,
                       Adresse adresse,
                       Proprietaire proprietaire,
                       TypeDeHebergement typeDeHebergement,
                       SecteurDeHebergement secteurDeHebergement,
                       List<DisponibiliteDeLogement> disponibiliteDeLogementList) {
        this.prix = prix;
        this.fraisDeNettoyage = fraisDeNettoyage;
        this.fraisDeService = fraisDeService;
        this.repertoireDePhoto = repertoireDePhoto;
        this.etatDeHebergement = etatDeHebergement;
        this.adresse = adresse;
        this.proprietaire = proprietaire;
        this.typeDeHebergement = typeDeHebergement;
        this.secteurDeHebergement = secteurDeHebergement;
        this.disponibiliteDeLogementList = disponibiliteDeLogementList;
    }

    public int getId() {
        return id;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
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

    public String getRepertoireDePhoto() {
        return repertoireDePhoto;
    }

    public void setRepertoireDePhoto(String repertoireDePhoto) {
        this.repertoireDePhoto = repertoireDePhoto;
    }

    public boolean isEtatDeHebergement() {
        return etatDeHebergement;
    }

    public void setEtatDeHebergement(boolean etatDeHebergement) {
        this.etatDeHebergement = etatDeHebergement;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public TypeDeHebergement getTypeDeHebergement() {
        return typeDeHebergement;
    }

    public void setTypeDeHebergement(TypeDeHebergement typeDeHebergement) {
        this.typeDeHebergement = typeDeHebergement;
    }

    public SecteurDeHebergement getSecteurDeHebergement() {
        return secteurDeHebergement;
    }

    public void setSecteurDeHebergement(SecteurDeHebergement secteurDeHebergement) {
        this.secteurDeHebergement = secteurDeHebergement;
    }

    public List<DisponibiliteDeLogement> getDisponibiliteDeLogementList() {
        return disponibiliteDeLogementList;
    }

    public void setDisponibiliteDeLogementList(List<DisponibiliteDeLogement> disponibiliteDeLogementList) {
        this.disponibiliteDeLogementList = disponibiliteDeLogementList;
    }

    @Override
    public String toString() {
        return "Hebergement{" +
                "id=" + id +
                ", prix=" + prix +
                ", fraisDeNettoyage=" + fraisDeNettoyage +
                ", fraisDeService=" + fraisDeService +
                ", repertoireDePhoto='" + repertoireDePhoto + '\'' +
                ", etatDeHebergement=" + etatDeHebergement +
                ", adresse=" + adresse +
                ", proprietaire=" + proprietaire +
                ", typeDeHebergement=" + typeDeHebergement +
                ", secteurDeHebergement=" + secteurDeHebergement +
                ", disponibiliteDeLogementList=" + disponibiliteDeLogementList +
                '}';
    }
}
