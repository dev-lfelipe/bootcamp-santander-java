package lfelipe.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * Esse projeto do Design Pattern - Observer foi desenvolvido com base num projeto de demonstração do 
 * Refactoring.guru! A parte do Spring Boot tive como base o modelo presente no Github da Dio.me
 * 
 * Fontes: https://refactoring.guru/pt-br/design-patterns/observer/java/example
 * 		   https://github.com/digitalinnovationone/lab-padroes-projeto-spring
 * 
 * Autor da réplica: @dev-lfelipe
 * 
 * Para rodar a versão "Java Spring 3" do Padrões de Projeto coloque ".old" neste arquivo e retire do outro.
 * Base de ideia dessa versão: cadastrar usuários e e-mails em um banco de dados
 * para recebimento de Newsletter. Evento = Tipo de Newsletter (produto novo, dicas de saúde, etc)
 *  
 */

@SpringBootApplication
public class DesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

}
