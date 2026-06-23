package desafios.DesafioDia1;

import desafios.DesafioDia1.RankNinja;

import java.util.Scanner;

public class Ninjas {
    private String nome;
    private int idade;
    private String Aldeia;
    private RankNinja rank;

    public Ninjas(String nome, int idade, String aldeia, RankNinja rank) {
        this.nome = nome;
        this.idade = idade;
        Aldeia = aldeia;
        this.rank = rank;
    }

    public Ninjas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return Aldeia;
    }

    public void setAldeia(String aldeia) {
        Aldeia = aldeia;
    }

    public RankNinja getRank() {
        return rank;
    }

    public void setRank(RankNinja rank) {
        this.rank = rank;
    }


}
