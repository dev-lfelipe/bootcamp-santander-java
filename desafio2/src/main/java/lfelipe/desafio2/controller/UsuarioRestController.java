package lfelipe.desafio2.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lfelipe.desafio2.domain.model.Usuario;
import lfelipe.desafio2.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {
    private final UsuarioService usuarioService;

    public UsuarioRestController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
        var usuario = usuarioService.buscarPorId(id);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuarioNovo){
        var usuarioCriado = usuarioService.criarUsuario(usuarioNovo);
        URI localizacao = ServletUriComponentsBuilder.fromCurrentRequest()
                                                    .path("/{id}")
                                                    .buildAndExpand(usuarioCriado.getId())
                                                    .toUri();
        return ResponseEntity.created(localizacao).body(usuarioCriado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable Long id){
        usuarioService.deletarUsuario(id); 
        return ResponseEntity.ok().build();
    }
}
