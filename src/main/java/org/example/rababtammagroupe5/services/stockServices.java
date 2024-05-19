package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.rababtammagroupe5.dao.repositories.stockRepo;

import java.util.List;
@Service
public class stockServices implements stockManager {

    @Autowired
    private stockRepo stockRepo;


    @Override
    public Stock ajouterstock(Stock stock) {
        return stockRepo.save(stock);
    }

    @Override
    public Stock modifierstock(Stock stock) {
        return stockRepo.save(stock);
    }

    @Override
    public void supprimerstock(Integer id) {
        stockRepo.deleteById(id);
    }

    @Override
    public List<Stock> getAllstock() {
        return stockRepo.findAll();
    }
}

