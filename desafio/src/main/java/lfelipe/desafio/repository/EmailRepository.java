package lfelipe.desafio.repository;

import lfelipe.desafio.model.Email;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {
    
} 
