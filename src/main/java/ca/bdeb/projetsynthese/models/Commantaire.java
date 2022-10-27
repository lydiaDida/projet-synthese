package ca.bdeb.projetsynthese.models;

import javax.persistence.*;

/**
 * Created by Thomas Wang on 10/27/2022.
 */
@Entity
@Table(name = "Commantaire")
public class Commantaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "commantaire")
    private String commantaire;


    @Column(name = "etatDecommantaire")
    private boolean etatDecommantaire;

    /** relation **/
    // relation(1:n) Locataire(1) <===> Commantaire(n)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emailLocataire",
                referencedColumnName = "emailLocataire")
    private Locataire locataire;
    /** fin relation **/

    // constructor
    public Commantaire() {
    }

    public Commantaire(String commantaire,
                       boolean etatDecommantaire,
                       Locataire locataire) {
        this.commantaire = commantaire;
        this.etatDecommantaire = etatDecommantaire;
        this.locataire = locataire;
    }

    public int getId() {
        return id;
    }

    public String getCommantaire() {
        return commantaire;
    }

    public void setCommantaire(String commantaire) {
        this.commantaire = commantaire;
    }

    public boolean isEtatDecommantaire() {
        return etatDecommantaire;
    }

    public void setEtatDecommantaire(boolean etatDecommantaire) {
        this.etatDecommantaire = etatDecommantaire;
    }

    public Locataire getLocataire() {
        return locataire;
    }

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }

    @Override
    public String toString() {
        return "Commantaire{" +
                "id=" + id +
                ", commantaire='" + commantaire + '\'' +
                ", etatDecommantaire=" + etatDecommantaire +
                ", locataire=" + locataire +
                '}';
    }
}
