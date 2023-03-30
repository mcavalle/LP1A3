package aula5.exemplos;

public class ContaCorrente extends Conta {
    private double limite;


    public ContaCorrente(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    public void sacar(double valor){
        if(isBloqueada()){
            throw new IllegalStateException("Conta bloqueada");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }

        if (valor > getSaldo() + limite) {
            throw new RuntimeException("Saldo insuficiente");
        }

        this.saldo = this.saldo - valor;
    }

    private double valorDisponivel(){
        return getSaldo() + limite;
    }

    @Override
    public void transferir(double valor, Conta conta){
        if(isBloqueada()){
            throw new IllegalStateException("Conta bloqueada");
        }
        
        if(conta.isBloqueada()){
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
    
}
