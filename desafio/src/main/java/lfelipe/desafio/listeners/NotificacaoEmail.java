package lfelipe.desafio.listeners;

import java.io.File;

public class NotificacaoEmail implements ReceptorEvento{
    private String email;

    public NotificacaoEmail(String email){
        this.email = email;
    }

    @Override
    public void update(String tipoDeEvento, File arquivo){
        System.out.println("E-mail enviado para " + email + " quando foi realizada ação: '" + tipoDeEvento + "' com o seguinte arquivo: " + arquivo.getName());
    }
}
