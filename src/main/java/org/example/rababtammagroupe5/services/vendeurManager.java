package org.example.rababtammagroupe5.services;


import org.example.rababtammagroupe5.dao.entities.Vendeur;

import java.util.List;

public interface vendeurManager {
    public Vendeur ajoutervendeur(Vendeur vendeur);
    public Vendeur modifiervendeur(Vendeur vendeur);
    public void supprimervendeur( Vendeur vendeur);
    public List<Vendeur> getAllvendeur();
}