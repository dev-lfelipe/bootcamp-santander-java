import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        int primeiroNum, segundoNum;

        System.out.print("Digite o primeiro número: ");
        primeiroNum = resposta.nextInt();
        System.out.print("Digite o segundo número: ");
        segundoNum = resposta.nextInt();

        try{
            contar(primeiroNum, segundoNum);
        }catch (ParametrosInvalidosException exception){
            System.out.println("O primeiro número precisa ser menor que o segundo!");      
        }

        resposta.close();
    }

    static void contar(int primeiroNum, int segundoNum) throws ParametrosInvalidosException{        
        if (primeiroNum > segundoNum){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = segundoNum - primeiroNum;

            for(int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        }
    }
}