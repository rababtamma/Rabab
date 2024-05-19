package org.example.rababtammagroupe5.services;

import org.example.rababtammagroupe5.dao.entities.User;

import java.util.List;

public interface userManager {
    public User ajouteruser(User user);
    public User modifieruser(User user);
    public void supprimeruser( User user);
    public List<User> getAlluser();
}
