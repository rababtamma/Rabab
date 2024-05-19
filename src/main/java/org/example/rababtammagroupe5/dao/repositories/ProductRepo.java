package org.example.rababtammagroupe5.dao.repositories;

import org.example.rababtammagroupe5.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Product, Integer> {
}
