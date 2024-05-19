package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Product;
import org.example.rababtammagroupe5.dao.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServices implements ProductManager {

    @Autowired
    private ProductRepo productRepo;


    @Override
    public Product ajouterProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product modifierProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void supprimerProduct(Integer id) {
        productRepo.deleteById(id);
    }



    @Override
    public List<Product> getAllProduct() {
       return productRepo.findAll();
    }
}

