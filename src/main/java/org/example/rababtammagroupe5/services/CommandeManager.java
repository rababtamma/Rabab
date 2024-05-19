package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Commande;

import java.util.List;

public interface CommandeManager {
    public Commande ajouterCommande(Commande commande);
    public Commande modifierCommande(Commande commande);
    public void supprimerCommande(Commande commande);
    public List<Commande> getAllCommandes();
}
