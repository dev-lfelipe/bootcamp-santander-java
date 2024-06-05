import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        int primeiroNum, segundoNum;

        System.out.println("Digite o primeiro número: ");
        primeiroNum = resposta.nextInt();
        System.out.println("Digite o segundo número: ");
        segundoNum = resposta.nextInt();

        try{
            contar(primeiroNum, segundoNum);
        }catch (ParametrosInvalidosException exception){
            System.out.println("O primeiro número precisa ser menor que o segundo!")       
        }

        resposta.close();
    }

    static void contar(int primeiroNum, int segundoNum) throws ParametrosInvalidosException{
        int contagem = primeiroNum - segundoNum;

        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + contagem);
        }
    }
}