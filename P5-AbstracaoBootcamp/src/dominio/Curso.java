package dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Título: " + getTitulo() + '\n' +
                "Descrição do Curso: " + getDescricao() + '\n' +
                "Carga Horária do Curso: " + cargaHoraria + " horas.";
    }
}
