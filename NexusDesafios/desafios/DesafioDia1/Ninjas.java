package desafios.DesafioDia1;

import desafios.DesafioDia1.RankNinja;

import java.util.Scanner;

public class Ninjas {
    private String nome;
    private int idade;
    private String aldeia;
    private RankNinja rank;

    public Ninjas(String nome, int idade, String aldeia, RankNinja rank) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
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
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public RankNinja getRank() {
        return rank;
    }

    public void setRank(RankNinja rank) {
        this.rank = rank;
    }


}