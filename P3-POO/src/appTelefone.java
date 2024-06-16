import java.util.Random;
import java.util.Scanner;

public class appTelefone {
    static int numero;
    static void ligar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Para qual telefone você gostaria de ligar?");
        numero = sc.nextInt();

        System.out.println("Ligando para o número " + numero);
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        atender();
        
        sc.close();
    }

    static double numeroAleatorio(){
        Random numero = new Random();
        return numero.nextDouble();
    }

    static void atender(){
        for(int i = 0; i < 3; i++){
            if (numeroAleatorio() < 0.5) {
                System.out.println("Telefone atendido!");
                menuIphone.main(null);
                break;
            }else{
                System.out.println("Telefone não atendido!");
                correioDeVoz();
            }
        }
        
    }

    static void correioDeVoz(){
        System.out.println("Iniciando o correio de voz!");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Correio de voz finalizado!");

        menuIphone.main(null);
    }
}
