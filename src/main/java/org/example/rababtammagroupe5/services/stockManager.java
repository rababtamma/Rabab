package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Stock;

import java.util.List;

public interface stockManager {
    public Stock ajouterstock(Stock stock);
    public Stock modifierstock(Stock stock);
    public void supprimerstock(Integer id);
    public List<Stock> getAllstock();
}