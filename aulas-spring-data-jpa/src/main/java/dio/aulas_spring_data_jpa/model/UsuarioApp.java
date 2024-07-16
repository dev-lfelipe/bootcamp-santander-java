package dio.aulas_spring_data_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_user")
public class UsuarioApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`user_id`")
    private Integer id;
    @Column(name = "`nome`", length = 50, nullable = false)
    private String name;
    @Column(name = "`usuario`", length = 20, nullable = false)
    private String usuario;
    @Column(name = "`senha`", length = 100, nullable = false)
    private String senha;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", usuario=" + usuario + ", senha=" + senha + "]";
    }

    
   
}
