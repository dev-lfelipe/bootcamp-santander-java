package lfelipe.desafio.service.implementacao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lfelipe.desafio.model.Email;
import lfelipe.desafio.repository.EmailRepository;
import lfelipe.desafio.service.EmailService;


@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    private EmailRepository emailRepository;

	@Override
	public Iterable<Email> buscarTodos(){
        return emailRepository.findAll();
    }

	@Override
	public Email buscarPorId(Long id) {
		Optional<Email> email = emailRepository.findById(id);
		return email.get();
	}

	@Override
	public void inserir(Email email) {
		salvarEventoNoEmail(email);
	}

	@Override
	public void atualizar(Long id, Email email) {
		Optional<Email> emailBanco = emailRepository.findById(id);
		if (emailBanco.isPresent()) {
			salvarEventoNoEmail(email);
		}
	}

	@Override
	public void deletar(Long id) {
		emailRepository.deleteById(id);
	}

	private void salvarEventoNoEmail(Email email) {
		emailRepository.save(email);
    }
}
