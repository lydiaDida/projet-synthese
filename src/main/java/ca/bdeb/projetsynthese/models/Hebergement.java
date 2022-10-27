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

    // relation(1:1) Hebergement(1) Adresse(1)
    // one way mapping
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

}
