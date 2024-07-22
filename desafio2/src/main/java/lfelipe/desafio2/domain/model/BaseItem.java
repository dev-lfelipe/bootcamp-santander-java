package lfelipe.desafio2.domain.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String thumb;
    private String nomeDaSerie;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getThumb() {
        return thumb;
    }
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
    public String getNomeDaSerie() {
        return nomeDaSerie;
    }
    public void setNomeDaSerie(String nomeDaSerie) {
        this.nomeDaSerie = nomeDaSerie;
    }

    
}
