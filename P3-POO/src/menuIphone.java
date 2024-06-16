import java.util.Scanner;

public class menuIphone{
    public static void main(String[] args) {
        int opcao = 0;
        Scanner escolha = new Scanner(System.in);


        System.out.println("Escolha uma opção:");
        System.out.println("1 - Reprodutor Musical");
        System.out.println("2 - Aparelho Telefonico");
        System.out.println("3 - Navegador Internet");
        System.out.print("Opção: ");
        opcao = escolha.nextInt();
        
        do {
            switch (opcao) {
                case 1:
                    appMusical.reprodutorMusical();
                    break;
                    
                case 2:
                    appTelefone.ligar();
                    break;
                    
                case 3:
                    appInternet.exibirPagina();
                    break;

                case 0:
                    System.out.println("Você desligou o Iphone!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
                }
            }while(opcao != 0);
    escolha.close();
}
}
