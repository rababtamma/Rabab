package org.example.rababtammagroupe5.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "gestionnaire_stock")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GestionnaireStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @Column(length = 100)
    private String name;

}