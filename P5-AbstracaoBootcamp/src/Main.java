import dominio.*;

import java.time.LocalDate;

/*
 * Esse código foi realizado utilizando como base o código presente na aula de abstração do 
 * Desafio de Projeto da Dio.me
 * 
 * Fonte: https://github.com/cami-la/desafio-poo-dio
 * 
 */

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Programação Java");
        cursoJava.setDescricao("Curso para aprendizado de desenvolvimento na Linguagem Java");
        cursoJava.setCargaHoraria(80);
        
        Curso cursoGit = new Curso();
        cursoGit.setTitulo("Curso Iniciante em Git");
        cursoGit.setDescricao("Curso para ensinar a utilizar o software Gitbash e a plataforma Github");
        cursoGit.setCargaHoraria(10);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Programação Java");
        mentoriaJava.setDescricao("Mentoria para auxiliar no curso de Programação Java");
        mentoriaJava.setData(LocalDate.now());

        //System.out.println(cursoJava);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Desenvolvimento Java para criar novos Devs Java!");
        bootcamp.getConteudos().add(cursoGit);
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz Felipe");
        devLuiz.inscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Luiz: " + devLuiz.getConteudosInscritos());
        devLuiz.progressao();
        devLuiz.progressao();
        System.out.println("----");
        System.out.println("Conteúdos Inscritos do Luiz: " + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos Finalizados do Luiz: " + devLuiz.getConteudosFinalizados());
        System.out.println("XP total do Dev: " + devLuiz.calcularTotalXp());

        System.out.println("===============");

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe: " + devFelipe.getConteudosInscritos());
        devFelipe.progressao();
        devFelipe.progressao();
        devFelipe.progressao();
        System.out.println("----");
        System.out.println("Conteúdos Inscritos Felipe: " + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Finalizados Felipe: " + devFelipe.getConteudosFinalizados());
        System.out.println("XP total do Dev: " + devFelipe.calcularTotalXp());
    }
}
