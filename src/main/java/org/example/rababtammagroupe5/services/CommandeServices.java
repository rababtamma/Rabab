package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Commande;
import org.example.rababtammagroupe5.dao.repositories.CommandeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServices implements CommandeManager {

    @Autowired
    private CommandeRepo commandeRepo;


    @Override
    public Commande ajouterCommande(Commande commande) {
        return commandeRepo.save(commande);
    }

    @Override
    public Commande modifierCommande(Commande commande) {
        return commandeRepo.save(commande);
    }

    @Override
    public void supprimerCommande(Commande commande) {
        commandeRepo.delete(commande);
    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepo.findAll();
    }

}
