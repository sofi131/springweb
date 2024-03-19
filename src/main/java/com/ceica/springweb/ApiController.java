package com.ceica.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //para devolver datos de la api
@RequestMapping("/api") //peticiones en barra api las gestiona esta clase
public class ApiController {

    @GetMapping("/pedirdatos")
    public List<String> prueba(){
        List<String> datos=new ArrayList<>();
        datos.add("hola mundo");
        datos.add("adiós mundo");
        return datos;
    }
}
