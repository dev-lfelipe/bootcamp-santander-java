package lfelipe.desafio.controller;

import lfelipe.desafio.listeners.ReceptorEvento;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class GerenciadorEvento {
    Map<String, List<ReceptorEvento>> receptores = new HashMap<>();

    public GerenciadorEvento(String... operacoes){
        for (String operacao : operacoes){
            this.receptores.put(operacao, new ArrayList<>());
            System.out.println(operacao);
        }
    }

    public void inscricao(String tipoDeEvento, ReceptorEvento receptor){
        List<ReceptorEvento> usuarios = receptores.get(tipoDeEvento);
        usuarios.add(receptor);
    }

    public void desinscricao(String tipoDeEvento, ReceptorEvento receptor){
        List<ReceptorEvento> usuarios = receptores.get(tipoDeEvento);
        usuarios.remove(receptor);
    }

    public void notificacao(String tipoDeEvento, File arquivo){
        List<ReceptorEvento> usuarios = receptores.get(tipoDeEvento);
        for (ReceptorEvento receptor : usuarios) {
            receptor.update(tipoDeEvento, arquivo);
        }
    }
}
