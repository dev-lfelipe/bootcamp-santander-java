# Desafio 2 - API Rest com deploy na nuvem usando Railway e PostgreSQL

## Diagrama de Classes desse projeto:

``` mermaid
classDiagram
  class Usuario {
    -Long idUsuario
    -String email
    -String senha
    -PlanoEscolhido[] planoEscolhido
    -NovasSeries[] novasSeries
    -Favoritos[] favoritos
  }

  class PlanoEscolhido {
    -Float valorPlano
    -String tipoPlano
    -Boolean anuncios
  }

  class NovasSeries {
    -String thumb
    -String nomeDaSerie
  }

  class Favoritos {
    -String thumb
    -String nomeDaSerie
  }

  Usuario *-- PlanoEscolhido
  Usuario *-- NovasSeries
  Usuario *-- Favoritos
```
