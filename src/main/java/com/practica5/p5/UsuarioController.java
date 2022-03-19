package com.practica5.p5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UsuarioController {
    @GetMapping("/usuario")
    public String getUsuario() {
        return "Ejecutado con exito";
    }

    @PostMapping("/usuario")
    public Usuario postUsuario(@RequestBody Usuario usuario){
        return usuario;
    }
}
