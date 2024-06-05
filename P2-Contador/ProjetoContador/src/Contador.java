import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Declaração de variáveis e criação do Scanner
        Scanner resposta = new Scanner(System.in);
        int primeiroNum, segundoNum;

        // Código utilizando o scanner para digitação dos números escolhidos pelo usuário
        System.out.print("Digite o primeiro número: ");
        primeiroNum = resposta.nextInt();
        System.out.print("Digite o segundo número: ");
        segundoNum = resposta.nextInt();

        // Try-Catch para tratar a exceção onde o usuário digitou o primeiro número maior que o segundo
        try{
            contar(primeiroNum, segundoNum);
        }catch (ParametrosInvalidosException exception){
            // Mensagem caso a exceção seja ativada (o usuário digitou o primeiro número maior)
            System.out.println("O primeiro número precisa ser menor que o segundo!");      
        }

        // Fechamento do Scanner (ele precisa sempre ser fechado)
        resposta.close();
    }

    // Laço for para imprimir os números do primeiro ao segundo parâmetro (começando do 1)
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