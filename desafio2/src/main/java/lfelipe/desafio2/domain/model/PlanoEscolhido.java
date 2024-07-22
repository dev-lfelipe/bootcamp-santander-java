package lfelipe.desafio2.domain.model;

import jakarta.persistence.*;

@Entity(name = "tabela_planoEscolhido")
public class PlanoEscolhido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoPlano;

    private float valorPlano;

    private Boolean anuncios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public float getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    public Boolean getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(Boolean anuncios) {
        this.anuncios = anuncios;
    }

    
}
