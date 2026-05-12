package NivelBasico.Desafios;

public class Desafio1 {
    public static void main(String[] args) {
    System.out.println("--- Vila da Folha : Quests ---");
        //Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade1 = 14;
        String missao1 = "Missão 1 - resgatar Gato";
        String statusMissao1 = "Em andamento";
        char nivelDaMissao1 = 'A';
        //Verificar nivel da missão e idade:
        if(idade1 <15) {
            if(nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D') {
                statusMissao1 = "Concluída";
            } else {
                statusMissao1 = "Não concluída, Ninjas com " +idade1+ " anos só podem concluir missões C ou D.";
            }
        } else {
            statusMissao1 = "Concluída";
        }

        //Ninja 2
        String nomeNinja2 = "Sakura Haruno";
        int idade2 = 17;
        String missao2 = "Missão 2 - investigar ninja";
        String statusMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';
        //Verificar nivel da missão e idade:
        if(idade2 <15) {
            if(nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusMissao2 = "Concluída";
            } else {
                statusMissao2 = "Não concluída, Ninjas com " +idade2+ " anos só podem concluir missões C ou D.";
            }
        } else {
            statusMissao2 = "Concluída";
        }

        //Ninja 3
        String nomeNinja3 = "Sasuke Uchiha";
        int idade3 = 10;
        String missao3 = "Missão 3 - analisar aldeia";
        String statusMissao3 = "Concluida";
        char nivelDaMissao3 = 'B';
        //Verificar nivel da missão e idade:
        if(idade3 <15) {
            if(nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusMissao3 = "Concluída";
            } else {
                statusMissao3 = "Não concluída, Ninjas com " +idade3+ " anos só podem concluir missões C ou D.";
            }
        } else {
            statusMissao3 = "Concluída";
        }

        //Ninja 1
        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idade1);
        System.out.println("Missão atual: " + missao1);
        System.out.println("Nivel da missao: " + nivelDaMissao1);
        System.out.println("Status da Missão = " + statusMissao1);
        System.out.println("--------------------");

        //Ninja 2
        System.out.println("Nome: " + nomeNinja2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao atual: " + missao2);
        System.out.println("Nivel da missao: " + nivelDaMissao2);
        System.out.println("Status da Missao = " + statusMissao2);
        System.out.println("--------------------");

        //Ninja 3
        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missao atual: " + missao3);
        System.out.println("Nivel da missao: " + nivelDaMissao3);
        System.out.println("Status da Missao = " + statusMissao3);
        System.out.println("--------------------");
    }
}
