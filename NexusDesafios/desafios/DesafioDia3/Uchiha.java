package desafios.DesafioDia3;

public class Uchiha extends Ninja {
    @Override
    public void habilidadeEspcecial() {
        System.out.println("Sou"+getNome()+", um ninja da linhagem Uchiha,\nSharingan Ativado!");
    }

    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String aldeia, RankNinja rank) {
        super(nome, idade, aldeia, rank);
    }
}
