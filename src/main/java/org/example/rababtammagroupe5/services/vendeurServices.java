package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Vendeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.rababtammagroupe5.dao.repositories.vendeurRepo;
import java.util.List;

public class vendeurServices implements vendeurManager {

    @Autowired
    private vendeurRepo  vendeurRepo;

    @Override
    public Vendeur ajoutervendeur(Vendeur vendeur) {
        return vendeurRepo.save(vendeur);
    }

    @Override
    public  Vendeur modifiervendeur(Vendeur vendeur) {
        return vendeurRepo.save(vendeur);
    }

    @Override
    public void supprimervendeur(Vendeur vendeur) {
        vendeurRepo.delete(vendeur);
    }

    @Override
    public List<Vendeur> getAllvendeur() {
        return vendeurRepo.findAll();
    }
}

