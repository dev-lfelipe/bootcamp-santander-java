package lfelipe.desafio.listeners;

import java.io.File;

public class LogOpenListener implements ReceptorEvento {
    private File log;

    public LogOpenListener(String nomeDoArquivo){
        this.log = new File(nomeDoArquivo);
    }

    @Override
    public void update(String tipoDeEvento, File arquivo){
        System.out.println("Salvado no log " + log + ": quando alguém realizou a ação " + tipoDeEvento + " com o seguinte arquivo: " + arquivo.getName());
    }
}
