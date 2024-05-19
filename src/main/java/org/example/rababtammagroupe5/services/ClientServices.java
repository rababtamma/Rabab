package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.Client;
import org.example.rababtammagroupe5.dao.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServices implements ClientManager {

    @Autowired
    private ClientRepo clientRepo;


    @Override
    public Client ajouterClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public void supprimerClient(Client client) {
        clientRepo.delete(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return null;
    }

}



