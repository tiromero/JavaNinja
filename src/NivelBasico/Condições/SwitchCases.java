package NivelBasico.Condições;
import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
         /*Switch Cases
         * Servem para gerar casos especificos: Caso aconteça x ele fara y.
         * Objetivo: Pedir para o usuario escolher entre os ninjas
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um Personagem: ");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

        //Pedir para o usuario escolher uma das opções:
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Você digitou o numero: " + escolhaDoUsuario);

        //Reação ao escolher um Personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolher a Sakura Haruno");
                break;
            default:
                System.out.println("Você digitou o numero errado.");
        }

        scanner.close();

    }
}
