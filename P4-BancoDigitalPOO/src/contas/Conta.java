package contas;
import cliente.*;
import contaInterface.*;

public abstract class Conta implements iConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int CONTA_SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    public Cliente cliente;
    
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = CONTA_SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar (double valor){
        saldo += valor;
    }

    public void transferir (double valor, iConta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor); 
    }
    
    public void exibirInfos() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}   

}
