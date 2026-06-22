package NivelIntermediario.FinalMethods;

public class main {
    public static void main(String[] args) {

    Uzumaki uzumaki = new Uzumaki("Naruto Uzumaki","Aldeia da Folha",16,RankNinja.C,5);
    uzumaki.tacarKunai();
    System.out.println("Altura = " + uzumaki.altura);

    Anbu ninjaAnbu = new Anbu();
    ninjaAnbu.nome = "Ninja aleatorio";
    System.out.println("Nome = " + ninjaAnbu.nome);
    ninjaAnbu.anbu();

    }


    }
