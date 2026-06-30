package desafios.DesafioDia3;

public class Ninja {
    private String nome;
    private int idade;
    private String aldeia;
    private RankNinja rank;

    //metodos de ninjas
    public void habilidadeEspcecial(){
        System.out.println("Sou um Ninja, domino kunais!");
    };

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia, RankNinja rank) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
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
