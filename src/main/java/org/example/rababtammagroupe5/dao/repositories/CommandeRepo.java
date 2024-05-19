package org.example.rababtammagroupe5.dao.repositories;

import org.example.rababtammagroupe5.dao.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepo extends JpaRepository<Commande, Integer>  {
}