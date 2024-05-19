package org.example.rababtammagroupe5.dao.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "Client")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, length = 100)
    private String nom;

    @Column(length = 100)
    private String adresse;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Commande> commande;
}