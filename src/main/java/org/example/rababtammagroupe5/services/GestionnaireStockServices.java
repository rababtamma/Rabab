package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.GestionnaireStock;
import org.example.rababtammagroupe5.dao.repositories.GestionnaireStockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionnaireStockServices implements GestionnaireStockManager {

    @Autowired
    private GestionnaireStockRepo gestionnaireStockRepo;


    @Override
    public GestionnaireStock ajoutergestionnairestock(GestionnaireStock gestionnaireStock) {
        return gestionnaireStockRepo.save(gestionnaireStock);
    }

    @Override
    public GestionnaireStock modifiergestionnairestock(GestionnaireStock gestionnaireStock) {
        return gestionnaireStockRepo.save(gestionnaireStock);
    }

    @Override
    public void supprimergestionnairestock(GestionnaireStock gestionnaireStock) {
         gestionnaireStockRepo.delete(gestionnaireStock);
    }

    @Override
    public List<GestionnaireStock> getAllgestionnairestock() {
        return gestionnaireStockRepo.findAll();
    }

}



