package desafios.DesafioDia1;

import desafios.DesafioDia1.RankNinja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List <Ninjas> ninjasList = new ArrayList<>();

        while (true) {
            //Criar menu e opções
            System.out.println("======= Menu =======");
            System.out.println("1. Cadastrar Ninjas");
            System.out.println("2. Ver Lista de Ninjas");
            System.out.println("3. Sair do Sistema.");
            System.out.println("====================\n");

            System.out.println("Digite o numero que deseja fazer: ");
            //Criar input do usuario e validar
            int input2 = input.nextInt();
            input.nextLine();

            switch (input2) {
                case 1:
                    System.out.println("====== Criar Ninja ======");
                    Ninjas novonninja = new Ninjas();
                    System.out.println("Nome do Ninja: ");
                    String nome = input.nextLine();
                    novonninja.setNome(nome);
                    System.out.println("Idade do Ninja: ");
                    int idade = input.nextInt();
                    if(idade <= 15){
                        System.out.println("Este cidadão ainda é menor de idade: "+idade+" anos.\nnão pode ser um Ninja ainda!\n");
                        break;
                    } else {
                        System.out.println("Idade: "+ idade +" anos, Permitidaa inscrição!\n");
                    }
                    novonninja.setIdade(idade);
                    input.nextLine();
                    System.out.println("Aldeia do Ninja: ");
                    String aldeia = input.nextLine();
                    novonninja.setAldeia(aldeia);
                    System.out.println("Rank Identificado: ");
                    System.out.println("1. GENIN\n2. CHUNIN\n3. JONIN\n4.KAGE |");
                    RankNinja rank = RankNinja.valueOf(input.next().toUpperCase());
                    novonninja.setRank(rank);
                    input.nextLine();
                    System.out.println("Ninja Cadastrado com sucesso!\n");
                    ninjasList.add(novonninja);
                    break;
                case 2:
                    System.out.println("====== Ver Lista de Ninjas ======");
                    if(ninjasList.isEmpty()){
                        System.out.println("Nenhum ninja cadastrado no momento!\n");
                    } else {
                        for(int i = 0; i < ninjasList.size(); i++){
                            System.out.println("------------------- \n");
                            System.out.println("Nome do Ninja: " + ninjasList.get(i).getNome());
                            System.out.println("Idade do Ninja: " + ninjasList.get(i).getIdade());
                            System.out.println("Aldeia do Ninja:" + ninjasList.get(i).getAldeia());
                            System.out.println("Rank Identificado: " + ninjasList.get(i).getRank());
                            System.out.println("------------------- \n");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
            }


        }
    }
}
