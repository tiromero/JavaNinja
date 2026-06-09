package NivelIntermediario.RefMemoria;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    int missoesConcluidas;
    RankNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int missoesConcluidas, RankNinja rank) {
        this (nome, aldeia, idade);
        this.missoesConcluidas = missoesConcluidas;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome+" eu sou da "+ aldeia+" e tenho "+idade+" anos.";
    }
}
