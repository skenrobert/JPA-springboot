package com.springsimplespasos.universidad.universidadbackend.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/restapi")
public class PrimerRestController {

    @GetMapping("/hola-mundo")
    public ResponseEntity<Map<String, String>> holaMundo(){
        Map<String, String> mensaje = new HashMap<>();
        mensaje.put("saludo", "Hola Mundo! =D");
        return new ResponseEntity<>(mensaje, HttpStatus.ACCEPTED);
    }

}
