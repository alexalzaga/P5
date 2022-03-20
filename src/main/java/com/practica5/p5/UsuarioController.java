package com.practica5.p5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UsuarioController {

    private static Usuario usuarioReg = new Usuario(null,null,null,null,null,null);
    @GetMapping("/usuario")
    public String getUsuario() {
        return usuarioReg.toString();
    }

    @PostMapping("/usuario")
    public Usuario postUsuario(@RequestBody Usuario usuario){
        usuarioReg = usuario;
        return usuario;
    }
}
