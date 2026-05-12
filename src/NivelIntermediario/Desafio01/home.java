package NivelIntermediario.Desafio01;

import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        //Escrever Menu de acesso;
        Scanner scanner = new Scanner(System.in);

        //Array de Ninjas em database
        Ninja[] ninjasDB = new Ninja[10];

        //Variaveis
        int ninjasCadastrados = 0;
        int opcaoMenu = 0;

        //Criar um loop para e casos de opções
        while (opcaoMenu != 4) {
            //Menu Interativo
            System.out.println("\n--- Menu Ninjas ---");
            System.out.println("1 - Historico de Ninjas Cadastrados");
            System.out.println("2 - Adicionar um novo Ninja");
            System.out.println("3 - Atualizar Habilidades Especiais");
            System.out.println("4 - Encerrar o sistema");
            System.out.println("Digite abaixo sua opção: ");
            opcaoMenu = scanner.nextInt();
            System.out.println("\n");
            scanner.nextLine();

            switch (opcaoMenu) {
                case 1:
                    if(ninjasCadastrados == 0){
                        System.out.println("Não há ninjas cadastrados no sistema.");
                    } else {
                    for (int i = 0; i < ninjasCadastrados; i++) {
                        if(ninjasDB[i] != null){
                        System.out.println("===========================");
                        ninjasDB[i].mostrarInformacoes();
                        }
                    }
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do ninja:");
                    String novoNome = scanner.nextLine();
                    System.out.println("Digite a idade do ninja:");
                    int novaIdade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a missaõ do ninja:");
                    String novaMissao = scanner.nextLine();
                    System.out.println("Digite o nivel dificuldade da missão:");
                    String novaNivelDificuldade = scanner.nextLine();
                    System.out.println("Status da Missão:");
                    String novaStatusMissao = scanner.nextLine();
                    if (novoNome.toLowerCase().contains("uchiha")) {
                        //Ninja com Habilidade
                        Uchiha u = new Uchiha();
                        u.nome = novoNome;
                        u.idade = novaIdade;
                        u.missao = novaMissao;
                        u.nivelDificuldade = novaNivelDificuldade;
                        u.statusMissão = novaStatusMissao;
                        System.out.println("Digite qual o nivel do Sharingan do ninja:");
                        u.habilidadeEspecial = scanner.nextLine();
                        u.mostrarHabilidadeEspecial();
                        ninjasDB[ninjasCadastrados] = u;
                    } else {
                        //Ninja normal
                        Ninja n = new Ninja();
                        n.nome = novoNome;
                        n.idade = novaIdade;
                        n.missao = novaMissao;
                        n.nivelDificuldade = novaNivelDificuldade;
                        n.statusMissão = novaStatusMissao;

                        ninjasDB[ninjasCadastrados] = n;
                    }

                    ninjasCadastrados++;
                    System.out.println("Ninja cadastrado com sucesso!");

                    break;
                case 3:
                    for (int i = 0; i < ninjasCadastrados; i++) {
                        if (ninjasDB[i] != null) {
                            if(ninjasDB[i].nome.toLowerCase().contains("uchiha")){
                                Uchiha u = (Uchiha) ninjasDB[i];
                                System.out.println("Atualizar a Habilidade Especial:");
                                u.habilidadeEspecial = scanner.nextLine();
                                System.out.println("Habilidade Alterada com sucesso!");
                            } else{
                                System.out.println("Não existe ninjas com habilidades especial.");
                            }

                        } else {
                            System.out.println("Não existem ninjas na lista!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
            }


        }
    }}
