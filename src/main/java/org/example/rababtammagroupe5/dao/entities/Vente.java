package org.example.rababtammagroupe5.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "vente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numvente;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private double totalAmount;

    @ManyToOne
    @JoinColumn(name = "vendeur_id")
    private Vendeur vendeur;

    public Vente(Date date, double totalAmount) {
        this.date = date;
        this.totalAmount = totalAmount;
    }
}

