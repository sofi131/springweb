package com.ceica.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController { //así le decimos que es un controller (html) si fuera rest datos(string cadena de texto)
    @GetMapping("/")
    public String index(Model model) {
        String nombre="Tomas";
        model.addAttribute("name",nombre);
        return "index";
    }

    @PostMapping("/")
    public String login(@RequestParam String nombre,@RequestParam String password,Model model){
        if(nombre.equals("admin") & password.equals("1234")){
            return "redirect:/admin";
        }else{
            model.addAttribute("msg","Usuario o Contraseña incorrecta");
            return "index";
        }
    }
}

