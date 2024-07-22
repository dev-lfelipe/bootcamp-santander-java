package lfelipe.desafio2.service;

import lfelipe.desafio2.domain.model.Usuario;

public interface UsuarioService {
    Usuario buscarPorId(Long id);
    Usuario criarUsuario(Usuario usuarioNovo);

    void deletarUsuario(Long id);
}
