package com.ceica.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //así le decimos que es un controller (html) si fuera rest datos(string cadena de texto)
public class ViewController {
    @GetMapping("/")
    public String index(Model model) {
        String nombre="Tomás";
        model.addAttribute("name", nombre);
        return "index";
    }
}
