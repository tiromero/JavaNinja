package NivelIntermediario.sobrecargaOver;

public class main {
    public static void main(String[] args) {

        //obje 1
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","Aldeia da Folha",16,5,RankNinja.GENIN);
        naruto.estrategiaDeBatalha();
        naruto.habilidadeEspecial();
        naruto.inteligenciaDeCombate(130);

        System.out.println("\n");

        //obje 2
        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha", 18,10,RankNinja.GENIN);
        sasuke.estrategiaDeBatalha();
        sasuke.habilidadeEspecial();
        sasuke.inteligenciaDeCombate(160);

        System.out.println("\n");

        //Obje 3
        Uchiha madara = new Uchiha("Madara Uchiha","Aldeia da Folha", 18, 99,RankNinja.KAGE);
        madara.estrategiaDeBatalha();
        madara.habilidadeEspecial();
        //metodo comum
        madara.inteligenciaDeCombate();
        //metodosobrecarregado
        madara.inteligenciaDeCombate(300);

    }
}
