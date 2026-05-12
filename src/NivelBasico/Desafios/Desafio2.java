package NivelBasico.Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        //Cadastrar os ninjas em um array e depois mostrar opções com Switch cases:

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);
        //Fazer um array de ninjas
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        //Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while(opcao != 3){
            //Menu
            System.out.println("\n=== Menu Ninja ===");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o ninja que deseja adicionar: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        //Somando mais um ninja na lista
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Numero maximo de ninjas cadastrados atingido.");
                    }
                    break;

                case 2:
                    if(ninjasCadastrados == 0){
                        System.out.println("Sem ninjas cadastrados.");
                    } else{
                        System.out.println("==== Lista de Ninjas ===");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Estamos terminando o programa...Aguarde!");
                    break;
                default:
                    System.out.println("Essa opção não é valida.");
                    break;

            }
        }
    }
}
