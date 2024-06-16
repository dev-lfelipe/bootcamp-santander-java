import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class appInternet {
    static String url;
    static Scanner sc = new Scanner(System.in);
    static void exibirPagina(){
        
        System.out.println("Qual página você gostaria de visitar? (Digite a URL com HTTP ou HTTPS!)");
        url = sc.nextLine();

        try {
            Desktop urlAberta = Desktop.getDesktop();
            URI uri = new URI(url);

            //Quando a URL é digita incorretamente, o programa abre a pasta do diretório no computador (não sei resolver)
            urlAberta.browse(uri);
            menuIphone.main(null);
        } catch (Exception e) {
            atualizarPagina();
        }

        sc.close();
    }
    static void atualizarPagina(){
        System.out.println("Estamos atualizando a página para carregá-la!");
        System.out.println("Deseja adicionar uma nova aba para pesquisar outra url?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int escolha = sc.nextInt();

        if (escolha == 2) {
            System.out.println("A página está carregada!");
            menuIphone.main(null);
        }else{
            adicionarAba();
        }
    }

    static void adicionarAba(){
        System.out.println("Nova aba aberta! Pesquise uma nova url!");
        url = sc.nextLine();
        exibirPagina();
    }
}
