package lfelipe.desafio2.controller.exception;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBusinessException(IllegalArgumentException businessException) {
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchException(NoSuchElementException noSuchException) {
        return new ResponseEntity<>("O ID deste usuário não foi encontrado! Verifique se ele realmente está cadastrado", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleSurpriseException(Throwable surpriseException) {
        var mensagem = "Erro inesperado. Por favor verifique o log!";
        log.error(mensagem, surpriseException);
        return new ResponseEntity<>(mensagem, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
