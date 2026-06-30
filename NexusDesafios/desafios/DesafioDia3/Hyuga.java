package desafios.DesafioDia3;

public class Hyuga extends Ninja{

    @Override
    public void habilidadeEspcecial() {
        System.out.println("Sou"+getNome()+", um ninja da linhagem Hyuga,\nByakugan Ativado!");
    }

    public Hyuga() {
    }

    public Hyuga(String nome, int idade, String aldeia, RankNinja rank) {
        super(nome, idade, aldeia, rank);
    }
}
