package com.ceica.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //para devolver datos de la api
@RequestMapping("/api") //peticiones en barra api las gestiona esta clase
public class ApiController {

    @GetMapping("/pedirdatos")
    public String prueba(){
        return "hola mundo";
    }
}
