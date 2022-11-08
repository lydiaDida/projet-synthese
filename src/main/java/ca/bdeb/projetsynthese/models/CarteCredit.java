package ca.bdeb.projetsynthese.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Thomas Wang on 10/27/2022.
 */
@Entity
@Table(name = "CarteCredit")
public class CarteCredit {
    @Id
    @Column(name = "numero", columnDefinition = "varchar(25)")
    private String numero;

    @Column(name = "expiration")
    private Date expiration;

    // constructor
    public CarteCredit() {
    }

    public CarteCredit(String numero, Date expiration) {
        this.numero = numero;
        this.expiration = expiration;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "CarteCredit{" +
                "numero='" + numero + '\'' +
                ", expiration=" + expiration +
                '}';
    }
}
