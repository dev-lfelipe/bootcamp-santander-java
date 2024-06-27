package contas;
import cliente.*;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

    public void imprimirExtrato(){
        System.out.println("=== Extrato Bancário da Conta Poupança ===");
        super.exibirInfos();
    }
}
