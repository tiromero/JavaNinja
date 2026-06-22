package NivelIntermediario.Enums;

public class main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar Cachorro",RankDeMissoes.D);

        missao1.exibirDetalhes();

        System.out.println("\n");

        Missoes missao2 = new Missoes("Derrotar Zabuza",RankDeMissoes.A);
        missao2.exibirDetalhes();
    }

}
