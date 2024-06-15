import java.util.Scanner;

public class appMusical {
    static String musica;
    static void reprodutorMusical(){
        System.out.println("Bem-vindo ao aplicativo de música!");
        selecionarMusica();
    }
    static void selecionarMusica() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual música você gostaria de ouvir?");
        System.out.print("Escolha: ");
        musica = sc.nextLine();

        iniciarMusica();

        sc.close();
    }

    static void iniciarMusica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando a tocar: " + musica);
        int escolha;
        
        do{
            System.out.println("Deseja pausar a música? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            escolha = sc.nextInt();
        }while(escolha != 1);
        
        pausarMusica();
        

        sc.close();
    }
    
    static void pausarMusica(){
        System.out.println("Música pausada e aplicativo fechado!");
        menuIphone.main(null);
    }
}

