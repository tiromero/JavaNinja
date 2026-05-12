package NivelBasico.Condições;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         *O Scanner = é um jeito de trazer o usuario para dentro de nossa aplicação
         * Objetivo: O usuario vai criar um ninja e vamos validar os dados
         * */

        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Digite seu nome: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: "+nomeDoNinja);

        //Receber a idade do ninja:
        System.out.println("Escreva aqui a idade do ninja = ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " +idadeDoNinja+ " anos.");

        //Tratamento de dados
        if(idadeDoNinja >=18){
            System.out.println("Esse ninja ja é maior de idade e pode ir em missões para fora da aldeia! ");

        } else{
            System.out.println("Esse ninja ainda é muito novo para sair.");
        }



        // Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
