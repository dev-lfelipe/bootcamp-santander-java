package lfelipe.desafio.listeners;

import java.io.File;

public interface ReceptorEvento {
    void update(String tipoDeEvento, File arquivo);  
}
