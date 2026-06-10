package NivelIntermediario.Desafio05;

public class BancoKonoha {

    public void transferir(ContaBancaria contaOrigem,ContaBancaria contaDestino,double valor) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
    }

    public void transferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor, double taxa) {
        contaOrigem.sacar(valor+taxa);
        contaDestino.depositar(valor);
    }
}
