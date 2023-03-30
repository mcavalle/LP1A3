package aula5.exemplos;

import javax.management.RuntimeErrorException;

//Conta - Super
//ContaCorrente, ContaPopupanca - Subs
public class Conta {
    private int numero;
    protected double saldo;
    private boolean bloqueada;

    
    public Conta(int numero){
        this.numero = numero;
        this.saldo = 0;
        this.bloqueada = false;
    }

    public void depositar(double valor){
        if(bloqueada){
            throw new IllegalStateException("Conta bloqueada");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }

        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor){
        if(bloqueada){
            throw new IllegalStateException("Conta bloqueada");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }

        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente");
        }

        this.saldo = this.saldo - valor;
    }

    public void transferir(double valor, Conta conta){
        if(bloqueada){
            throw new IllegalStateException("Conta bloqueada");
        }
        
        if(conta.bloqueada){
            throw new IllegalStateException("Conta bloqueada");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }

        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente");
        }

        this.saldo = this.saldo - valor;
        conta.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

}
