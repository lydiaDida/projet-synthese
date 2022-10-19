package ca.bdeb.reservation.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
@Entity
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Propretie> getListePropretie() {
        return listePropretie;
    }

    public void setListePropretie(ArrayList<Propretie> listePropretie) {
        this.listePropretie = listePropretie;
    }

    public Categorie() {
    }

    public Categorie(Long id, String name, ArrayList<Propretie> listePropretie) {
        this.id = id;
        this.name = name;
        this.listePropretie = listePropretie;
    }

    @OneToMany
    private ArrayList<Propretie> listePropretie;
}
