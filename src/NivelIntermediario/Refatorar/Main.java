package NivelIntermediario.Refatorar;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Naruto Uzumaki ---------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki",16,"Vila da Folha",RankNinja.GENIN, Biju.KURAMA);
        System.out.println(naruto.getNome()+" possui a Biju: "+naruto.biju);
        

        System.out.println("--------- Sasuke Uchiha ---------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha",18,"Vila da Faolha",RankNinja.GENIN);
        sasuke.shariganAtivado();

        System.out.println("--------- Itachi Uchiha  ---------");

        Uchiha itachi = new Uchiha("Itachi Uchiha",30,"Vila da Folha",RankNinja.JOUNIN);
        itachi.shariganAtivado();

        System.out.println("--------- Madara Uchiha ---------");

        Uchiha madara = new Uchiha("Madara Uchiha",45,"Vila da Folha",RankNinja.KAGE);
        madara.shariganAtivado();
    }
}
