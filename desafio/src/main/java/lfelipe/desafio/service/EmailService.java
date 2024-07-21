package lfelipe.desafio.service;

import org.springframework.stereotype.Service;

import lfelipe.desafio.model.Email;

@Service
public interface EmailService {
    Iterable<Email> buscarTodos();

    Email buscarPorId(Long id);

    void inserir(Email email);
    void atualizar(Long id, Email email);
    void deletar(Long id);
}
