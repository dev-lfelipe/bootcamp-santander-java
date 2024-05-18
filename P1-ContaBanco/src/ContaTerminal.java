import java.util.Scanner;

public class ContaTerminal {    
    public static void main(String[] args){
        // Declaração de varíaveis
        int numeroConta;
        String nomeCliente, agencia;
        double saldo;
        
        // Abertura do Scanner para registrar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Programa em si, pegando o número digitado pelo usuário e pré definindo nome, agência e saldo 
        System.out.print("Por favor, digite o número da sua Conta: ");
        numeroConta = sc.nextInt();
        agencia = "100-3";
        nomeCliente = "Marco Reus";
        saldo = 10000.30;

        // Mensagem final mostrando o dado digitado pelo usuário e os dados pré informados (o número de conta digitado não interfere nos valores pré informados no código)
        System.out.println("Olá " + nomeCliente + "! Agradecemos por escolher nós como seu banco! Sua agência é " + agencia + ", conta "+ numeroConta + " e o seu saldo disponível para saque é: " + saldo);

        sc.close();
    }
}
