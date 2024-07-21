package lfelipe.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lfelipe.desafio.model.Email;
import lfelipe.desafio.service.EmailService;

@RestController
@RequestMapping("emails")
public class EmailController {
    
    @Autowired
    private EmailService emailService;

    @GetMapping
    public ResponseEntity<Iterable<Email>> buscarTodos(){
        return ResponseEntity.ok(emailService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Email> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(emailService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Email> inserir(@RequestBody Email email){
        emailService.inserir(email);
        return ResponseEntity.ok(email);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Email> atualizar(@PathVariable Long id, @RequestBody Email email) {
		emailService.atualizar(id, email);
		return ResponseEntity.ok(email);
	}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        emailService.deletar(id);
        return ResponseEntity.ok().build();
    }    
}
