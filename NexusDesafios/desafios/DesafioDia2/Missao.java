package desafios.DesafioDia2;

public class Missao {

    private String nome;
    private NivelMissao dificuldade;

    public Missao(String nome, NivelMissao dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelMissao getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(NivelMissao dificuldade) {
        this.dificuldade = dificuldade;
    }
}