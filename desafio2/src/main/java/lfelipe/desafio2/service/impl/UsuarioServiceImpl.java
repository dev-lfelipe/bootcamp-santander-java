package lfelipe.desafio2.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import lfelipe.desafio2.domain.model.Usuario;
import lfelipe.desafio2.domain.repository.UsuarioRepository;
import lfelipe.desafio2.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario buscarPorId(Long id){
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario criarUsuario(Usuario usuarioNovo){
        if (usuarioRepository.existsByEmail(usuarioNovo.getEmail())) {
            throw new IllegalArgumentException("Esse e-mail já possui cadastro! Realize o login ou recupere sua senha");
        }
        return usuarioRepository.save(usuarioNovo);
    }

    @Override
    public void deletarUsuario(Long id){
        if (usuarioRepository.existsById(id) == false) {
            throw new IllegalArgumentException("Esse ID não está cadastrado! Não é possível excluir");
        }
        usuarioRepository.deleteById(id);
    }
}
