package org.example.rababtammagroupe5.dao.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true,length = 100)
    private String username;

    @Column(length = 100, unique = true)
    private String password;

    @Column(length = 100, unique = true)
    private String role;
}

