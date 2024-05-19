package org.example.rababtammagroupe5.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactusController {

    @GetMapping("/contactus")
    public String showIndex() {
        return "contactus";
    }
}

