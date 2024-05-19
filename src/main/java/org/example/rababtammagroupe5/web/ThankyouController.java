package org.example.rababtammagroupe5.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThankyouController {

    @GetMapping("/thank you")
    public String showIndex() {
        return "thank you";
    }
}
