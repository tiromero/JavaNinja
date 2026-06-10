package NivelIntermediario.Desafio05;

public abstract class ContaBancaria implements Conta {

    double saldo;
    TipoConta tipoDeConta;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, TipoConta tipoDeConta) {
        this( saldo );
        this.tipoDeConta = tipoDeConta;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public abstract void sacar(double valor);
}
