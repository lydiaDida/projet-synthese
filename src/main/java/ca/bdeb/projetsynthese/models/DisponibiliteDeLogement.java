package ca.bdeb.projetsynthese.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Thomas Wang on 10/27/2022.
 */
@Entity
@Table(name = "DisponibiliteDeLogement")
public class DisponibiliteDeLogement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "debutDeDateDeDisponibilite")
    private Date debutDeDateDeDisponibilite;

    @Column(name = "finDeDateDeDisponibilite")
    private Date finDeDateDeDisponibilite;

    @ManyToOne(fetch = FetchType.EAGER,
                cascade = CascadeType.ALL)
    @JoinColumn(name = "idHebergement",
                referencedColumnName = "id")
    private Hebergement hebergement;

    // constructor

    public DisponibiliteDeLogement() {
    }

    public DisponibiliteDeLogement(Date debutDeDateDeDisponibilite,
                                   Date finDeDateDeDisponibilite,
                                   Hebergement hebergement) {
        this.debutDeDateDeDisponibilite = debutDeDateDeDisponibilite;
        this.finDeDateDeDisponibilite = finDeDateDeDisponibilite;
        this.hebergement = hebergement;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public Date getDebutDeDateDeDisponibilite() {
        return debutDeDateDeDisponibilite;
    }

    public void setDebutDeDateDeDisponibilite(Date debutDeDateDeDisponibilite) {
        this.debutDeDateDeDisponibilite = debutDeDateDeDisponibilite;
    }

    public Date getFinDeDateDeDisponibilite() {
        return finDeDateDeDisponibilite;
    }

    public void setFinDeDateDeDisponibilite(Date finDeDateDeDisponibilite) {
        this.finDeDateDeDisponibilite = finDeDateDeDisponibilite;
    }

    public Hebergement getHebergement() {
        return hebergement;
    }

    public void setHebergement(Hebergement hebergement) {
        this.hebergement = hebergement;
    }

    @Override
    public String toString() {
        return "DisponibiliteDeLogement{" +
                "id=" + id +
                ", debutDeDateDeDisponibilite=" + debutDeDateDeDisponibilite +
                ", finDeDateDeDisponibilite=" + finDeDateDeDisponibilite +
                ", hebergement=" + hebergement +
                '}';
    }
}
