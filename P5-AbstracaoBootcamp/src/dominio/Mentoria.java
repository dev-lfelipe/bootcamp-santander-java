package dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    private LocalDate data;
    DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    public Mentoria(){}

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return "Título: " + getTitulo() + '\n' +
                "Descrição da Mentoria: " + getDescricao() + '\n' +
                "Data da Mentoria: " + data.format(formatada) + '.';
    }

    /* Código que encontrei para servir de base para a formatação da data:
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    System.out.println("Data formatada: " + now.format(formatter));
    */
}
