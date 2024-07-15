package dio.aulas_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aulas_spring_data_jpa.model.UsuarioApp;
import dio.aulas_spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        UsuarioApp user = new UsuarioApp();
        user.setName("Luiz");
        user.setUsuario("luizfelipe");
        user.setSenha("aulasdiopassword1313");

        repository.save(user);

        for(UsuarioApp u: repository.findAll()){
            System.out.println(u);
        }
    }
    
}
