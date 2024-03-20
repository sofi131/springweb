package com.ceica.springweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

@RestController //para devolver datos de la api
@RequestMapping("/api") //peticiones en barra api las gestiona esta clase
public class ApiController {

    @GetMapping("/pedirdatos")
    public List<String> prueba(@RequestParam(name = "dat") Integer dat1,@RequestParam String texto){
        List<String> datos=new ArrayList<>();
        datos.add("hola mundo");
        datos.add("adios mundo");
        datos.add("Valor "+dat1);
        datos.add("Texto "+texto);
        return datos;
    }
    @PostMapping("/alumno")
    public Alumno crearAlumno(@RequestBody Alumno alumno){
        System.out.println(alumno.toString());
        alumno.setNombre("Alumno cambiado");
        return alumno;
    }

}