package NivelIntermediario.Desafio05;

public class main {
    public static void main(String[] args) {

        ContaPoupanca test = new ContaPoupanca(0);

        System.out.println("\n");

        ContaCorrente test2 = new ContaCorrente(101);


        System.out.println("\n");

        BancoKonoha bancoKonoha = new BancoKonoha();
        bancoKonoha.transferir(test2,test,100,1);

        System.out.println("Seu saldo de Conta Corrente é: R$"+test2.consultarSaldo());
        System.out.println("Seu saldo de Conta Poupança é: R$"+test.consultarSaldo());

    }
}
