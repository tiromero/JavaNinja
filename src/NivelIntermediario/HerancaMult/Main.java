package NivelIntermediario.HerancaMult;

public class Main {
    public static void main(String[] args) {
        //obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        System.out.println("\n");

        //objet hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 45;
        kakashi.BoasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();

        System.out.println("\n");
    }
}
