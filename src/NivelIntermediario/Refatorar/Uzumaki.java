package NivelIntermediario.Refatorar;

public class Uzumaki extends Ninja {

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia, RankNinja rank) {
        super(nome, idade, aldeia, rank);
    }

    public Uzumaki(String nome, int idade, String aldeia, RankNinja rank, Biju biju) {
        super(nome, idade, aldeia, rank);
        this.biju = biju;
    }



}
