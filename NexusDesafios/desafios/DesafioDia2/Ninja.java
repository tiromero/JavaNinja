package desafios.DesafioDia2;

public class Ninja {
    private String nome;
    private int idade;
    private RankNinja rank;

    public Ninja(String nome, int idade, RankNinja rank) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
    }

    public void realizarMissao(Missao missao) {
        if (podeRealizarMissao(missao.getDificuldade())) {
            System.out.println("Ninja " + nome + " realizando a missão " + missao.getNome() + " de nível " + missao.getDificuldade());
            System.out.println("Recompensa: " + missao.getDificuldade().recompensa);
        } else {
            System.out.println("Ninja " + nome + " não pode realizar a missão " + missao.getNome() + " pois seu rank é muito baixo.");
        }
    }

    private boolean podeRealizarMissao(NivelMissao nivelMissao) {
        switch (rank) {
            case GENIN:
                return nivelMissao == NivelMissao.D;
            case CHUNIN:
                return nivelMissao == NivelMissao.C;
            case JONIN:
                return nivelMissao == NivelMissao.B;
            case KAGE:
                return nivelMissao == NivelMissao.A;
            default:
                return false;
        }
    }

    public void treinar() {
        System.out.println("Ninja " + nome + " treinou duro!");
        switch (rank) {
            case GENIN:
                setRank(RankNinja.CHUNIN);
                System.out.println("Promovido a Chunin!");
                break;
            case CHUNIN:
                setRank(RankNinja.JONIN);
                System.out.println("Promovido a Jonin!");
                break;
            case JONIN:
                setRank(RankNinja.KAGE);
                System.out.println("Promovido a Kage!");
                break;
            case KAGE:
                System.out.println("Já está no rank máximo!");
                break;
        }
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

    public RankNinja getRank() {
        return rank;
    }

    public void setRank(RankNinja rank) {
        this.rank = rank;
    }
}