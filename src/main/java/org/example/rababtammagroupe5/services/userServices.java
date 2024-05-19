package org.example.rababtammagroupe5.services;


import org.example.rababtammagroupe5.dao.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.rababtammagroupe5.dao.repositories.userRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServices implements userManager {

    @Autowired
    private userRepo userRepo;

    @Override
    public User ajouteruser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User modifieruser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void supprimeruser(User user) {
        userRepo.delete(user);
    }

    @Override
    public List<User> getAlluser() {
        return userRepo.findAll();
    }

}



