package org.example.rababtammagroupe5.dao.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "vendeur")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vendeur extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "vendeur")
    private List<Vente> ventes;

    public Vendeur(String name) {
        this.name = name;
    }
}
