package dio.primeira_api_web.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Bem-vindo(a) a minha aplicação Spring Boot Web API!";
    }
}
