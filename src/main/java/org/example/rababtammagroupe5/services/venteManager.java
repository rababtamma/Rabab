package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Vente;

import java.util.List;

public interface venteManager {
    public Vente ajoutervente(Vente vente);
    public Vente modifiervente(Vente vente);
    public void supprimervente( Vente vente);
    public List<Vente> getAllvente();
}