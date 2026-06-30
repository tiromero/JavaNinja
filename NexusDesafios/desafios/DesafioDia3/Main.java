package desafios.DesafioDia3;

public class Main {
    public static void main(String[] args) {
        System.out.println("======== Ninja 1 ========");

        Ninja n1 = new Ninja("Shino",18,"Vila da Folha",RankNinja.GENIN);
        System.out.println("Nome: " + n1.getNome());
        System.out.println("Idade: " + n1.getIdade());
        System.out.println("Aldeia: " + n1.getAldeia());
        System.out.println("Rank: " + n1.getRank());
        n1.habilidadeEspcecial();

        System.out.println("\n======== Ninja 2 ========");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki",16,"Fila da Folha",RankNinja.CHUNIN);
        System.out.println("Nome: " + naruto.getNome());
        System.out.println("Idade: " + naruto.getIdade());
        System.out.println("Aldeia: " + naruto.getAldeia());
        System.out.println("Rank: " + naruto.getRank());
        naruto.habilidadeEspcecial();

        System.out.println("\n======== Ninja 3 ========");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha",18,"Vila da Folha",RankNinja.JONIN);
        System.out.println("Nome: " + sasuke.getNome());
        System.out.println("Idade: " + sasuke.getIdade());
        System.out.println("Aldeia: " + sasuke.getAldeia());
        System.out.println("Rank: " + sasuke.getRank());
        sasuke.habilidadeEspcecial();

        System.out.println("\n======== Ninja 4 ========");

        Hyuga hinata = new Hyuga("Hinata Hyuga",17,"Vila da Folha",RankNinja.KAGE);
        System.out.println("Nome: " + hinata.getNome());
        System.out.println("Idade: " + hinata.getIdade());
        System.out.println("Aldeia: " + hinata.getAldeia());
        System.out.println("Rank: " + hinata.getRank());
        hinata.habilidadeEspcecial();

        System.out.println("\n ===========================");
        System.out.println("Teste Poliformismo");

        for (Ninja ninja : new Ninja[]{n1,naruto,sasuke,hinata}){
            ninja.habilidadeEspcecial(); //Onde o poliformismo.
            System.out.println("\n-------------------------");
        }

        /*
        * Quando o programa roda, o Java é mais esperto. Ele olha para o objeto real para o qual a variável ninja está apontando.
        ▪
        Na 2ª volta, ninja aponta para o objeto naruto, que é um Uzumaki. O Java diz: "Ah, este é um Uzumaki! Ele tem sua própria versão (@Override) de habilidadeEspcecial()? Sim! Então vou executar a versão do Uzumaki." -> "Biju ativada!"
        ▪
        Na 3ª volta, ninja aponta para o objeto sasuke, que é um Uchiha. O Java diz: "Este é um Uchiha! Vou executar a versão do Uchiha." -> "Sharingan Ativado!"
        * */


    }
}
