package lfelipe.desafio.model;

import java.io.File;

import lfelipe.desafio.controller.GerenciadorEvento;

public class Editor {
    public GerenciadorEvento eventos;
    private File arquivo;

    public Editor(){
        this.eventos = new GerenciadorEvento("abrir", "salvar");
    }

    public void abrirArquivo (String caminhoArquivo){
        this.arquivo = new File(caminhoArquivo);
        eventos.notificacao("abrir", arquivo);
    }

    public void salvarArquivo() throws Exception{
        if(this.arquivo != null){
            eventos.notificacao("salvar", arquivo);
        }else{
            throw new Exception("Por favor, abra um arquivo primeiro!");
        }        
    }
}
