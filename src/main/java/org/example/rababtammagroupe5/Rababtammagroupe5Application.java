package org.example.rababtammagroupe5;

import org.example.rababtammagroupe5.dao.entities.Product;
import org.example.rababtammagroupe5.dao.entities.User;
import org.example.rababtammagroupe5.services.ProductManager;
import org.example.rababtammagroupe5.services.userManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Rababtammagroupe5Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Rababtammagroupe5Application.class, args);
    }

        @Autowired
        userManager usermanager;
        @Autowired
        ProductManager productManager;

    @Override
    public void run(String... args) throws Exception {

    }
}
