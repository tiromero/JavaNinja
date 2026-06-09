package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        //objeto ninja n pode ser criado pela abstração

        //objet naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        System.out.println("\n");

        //objeto uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.habilidadeEspecial();

        System.out.println("\n");

        //obj uchiha 2
        //apos usar o super() na subclasse da pra usar os construtores da superclasse Ninja
        Uchiha itachi = new Uchiha("itachi","Aldeia da Folha",22);
        itachi.estrategiaDeBatalhaNinja();
        itachi.habilidadeEspecial();

        System.out.println("\n");


    }
}
