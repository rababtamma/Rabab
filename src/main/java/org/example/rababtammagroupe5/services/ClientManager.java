package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Client;

import java.util.List;
public interface ClientManager {
    public Client ajouterClient(Client client);
    public Client modifierClient(Client client);
    public void supprimerClient(Client client);
    public List<Client> getAllClients();

    Client getClientById(Long id);
}
