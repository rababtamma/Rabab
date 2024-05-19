package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.GestionnaireStock;

import java.util.List;

public interface GestionnaireStockManager {
    public GestionnaireStock ajoutergestionnairestock(GestionnaireStock gestionnaireStock);
    public GestionnaireStock modifiergestionnairestock(GestionnaireStock gestionnaireStock);
    public void supprimergestionnairestock( GestionnaireStock gestionnaireStock);
    public List<GestionnaireStock> getAllgestionnairestock();


}
