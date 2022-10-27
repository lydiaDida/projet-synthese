package ca.bdeb.projetsynthese.models;

import javax.persistence.*;

/**
 * Created by Thomas Wang on 10/27/2022.
 */
@Entity
@Table(name = "TypeDeHebergement")
public class TypeDeHebergement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "typeDeHebergement")
    private String typeDeHebergement;

    // constructor
    public TypeDeHebergement() {
    }

    public TypeDeHebergement(String typeDeHebergement) {
        this.typeDeHebergement = typeDeHebergement;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getTypeDeHebergement() {
        return typeDeHebergement;
    }

    public void setTypeDeHebergement(String typeDeHebergement) {
        this.typeDeHebergement = typeDeHebergement;
    }

    @Override
    public String toString() {
        return "TypeDeHebergement{" +
                "id=" + id +
                ", typeDeHebergement='" + typeDeHebergement + '\'' +
                '}';
    }
}
