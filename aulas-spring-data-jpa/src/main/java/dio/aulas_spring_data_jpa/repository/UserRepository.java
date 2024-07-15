package dio.aulas_spring_data_jpa.repository;

import dio.aulas_spring_data_jpa.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsuarioApp, Integer> {
    
}
