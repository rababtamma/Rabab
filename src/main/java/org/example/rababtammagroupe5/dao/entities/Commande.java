package org.example.rababtammagroupe5.dao.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Commande")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;


}