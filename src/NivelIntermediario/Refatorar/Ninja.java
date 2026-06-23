package NivelIntermediario.Refatorar;

public class Ninja {
    private String nome;
    private int idade;
    private String Aldeia;
    private RankNinja rank;

    //Criar construtores

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia, RankNinja rank) {
        this.nome = nome;
        this.idade = idade;
        Aldeia = aldeia;
        this.rank = rank;
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
