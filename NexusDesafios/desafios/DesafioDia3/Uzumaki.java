package desafios.DesafioDia3;

public class Uzumaki extends Ninja {

    @Override
    public void habilidadeEspcecial() {
        System.out.println("Sou "+getNome()+", um ninja da linhagem Uzumaki,\nBiju ativada!");
    }

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia, RankNinja rank) {
        super(nome, idade, aldeia, rank);
    }
}
