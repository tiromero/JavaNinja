package NivelIntermediario.Desafio05;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.01;
        double valorFinal = valor - taxa;
        saldo += valorFinal;
    }

    @Override
    public void sacar(double valor) {}
}
