package lfelipe.desafio2.domain.model;

import jakarta.persistence.*;
import java.util.List;


@Entity(name = "tabela_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    
    @OneToOne(cascade = CascadeType.ALL)
    private PlanoEscolhido planoEscolhido;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Favoritos> favoritos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NovasSeries> novasSeries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PlanoEscolhido getPlanoEscolhido() {
        return planoEscolhido;
    }

    public void setPlanoEscolhido(PlanoEscolhido planoEscolhido) {
        this.planoEscolhido = planoEscolhido;
    }

    public List<Favoritos> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Favoritos> favoritos) {
        this.favoritos = favoritos;
    }

    public List<NovasSeries> getNovasSeries() {
        return novasSeries;
    }

    public void setNovasSeries(List<NovasSeries> novasSeries) {
        this.novasSeries = novasSeries;
    }

}
