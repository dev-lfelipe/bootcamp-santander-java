import cliente.Cliente;
import contas.*;
import contaInterface.*;

public class Main {
    public static void main(String[] args) {
        Cliente luiz = new Cliente();
        luiz.setNome("Luiz Felipe");

        iConta cc = new ContaCorrente(luiz);
        iConta poupanca = new ContaPoupanca(luiz);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
