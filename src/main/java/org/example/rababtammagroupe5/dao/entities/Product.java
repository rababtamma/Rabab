package org.example.rababtammagroupe5.dao.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, unique = true)
    private String name;

    private double price;
    private String url;

    @Column(length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;
}

