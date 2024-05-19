package org.example.rababtammagroupe5.dao.repositories;

import org.example.rababtammagroupe5.dao.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface stockRepo extends JpaRepository<Stock, Integer> {
}
