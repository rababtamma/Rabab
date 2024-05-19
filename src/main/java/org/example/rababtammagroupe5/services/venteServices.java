package org.example.rababtammagroupe5.services;


import org.example.rababtammagroupe5.dao.entities.Vente;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.rababtammagroupe5.dao.repositories.venteRepo;
import java.util.List;

public class venteServices implements venteManager {

    @Autowired
    private venteRepo  venteRepo;

    @Override
    public Vente ajoutervente(Vente vente) {
        return venteRepo.save(vente);
    }

    @Override
    public  Vente modifiervente(Vente vente) {
        return venteRepo.save(vente);
    }

    @Override
    public void supprimervente(Vente vente) {
        venteRepo.delete(vente);
    }

    @Override
    public List<Vente> getAllvente() {
        return venteRepo.findAll();
    }
}