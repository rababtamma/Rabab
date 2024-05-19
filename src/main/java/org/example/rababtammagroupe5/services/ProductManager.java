package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Product;

import java.util.List;

public interface ProductManager {
    public Product ajouterProduct(Product Product);
    public  Product modifierProduct(Product Product);
    public void supprimerProduct(Integer id);
    public List< Product> getAllProduct();
}