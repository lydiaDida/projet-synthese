package ca.bdeb.projetsynthese.models;

import javax.persistence.*;

/**
 * Created by Thomas Wang on 10/26/2022.
 */
@Entity
@Table(name = "Adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "numeroDeRue", columnDefinition = "varchar(25)")
    private String numeroDeRue;

    @Column(name = "rue", columnDefinition = "varchar(50)")
    private String rue;

    @Column(name = "ville", columnDefinition = "varchar(50) DEFAULT 'Montreal'")
    private String ville;

    @Column(name = "province", columnDefinition = "varchar(50) DEFAULT 'Quebec'")
    private String province;

    @Column(name = "pays", columnDefinition = "varchar(50) DEFAULT 'Canada'")
    private String pays;

    @Column(name = "codePostale", columnDefinition = "varchar(25)")
    private String codePostale;

    // constructor
    public Adresse() {
    }

    public Adresse(String numeroDeRue, String rue, String ville, String province, String pays, String codePostale) {
        this.numeroDeRue = numeroDeRue;
        this.rue = rue;
        this.ville = ville;
        this.province = province;
        this.pays = pays;
        this.codePostale = codePostale;
    }

    public int getId() {
        return id;
    }

    public String getNumeroDeRue() {
        return numeroDeRue;
    }

    public void setNumeroDeRue(String numeroDeRue) {
        this.numeroDeRue = numeroDeRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", numeroDeRue='" + numeroDeRue + '\'' +
                ", rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", province='" + province + '\'' +
                ", pays='" + pays + '\'' +
                ", codePostale='" + codePostale + '\'' +
                '}';
    }
}
