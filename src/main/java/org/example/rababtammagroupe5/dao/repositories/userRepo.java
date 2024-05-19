package org.example.rababtammagroupe5.dao.repositories;

import org.example.rababtammagroupe5.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User, Integer>  {
}
