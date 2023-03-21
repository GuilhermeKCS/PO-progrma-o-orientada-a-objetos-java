package fatec.poo.model;

public class ContaCorrente {
    private int numero;
    private double saldo;
    

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double a){
        saldo = saldo - a;
    }
    
    public void depositar(double b){
        saldo = saldo + b;
    }
    
}
