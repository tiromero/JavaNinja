package desafios.DesafioDia2;

public class Main {
    public static void main(String[] args) {

        Ninja ninja1 = new Ninja("Naruto Uzumaki", 16, RankNinja.GENIN);
        System.out.println("Nome: " + ninja1.getNome());
        System.out.println("Idade: " + ninja1.getIdade());
        System.out.println("Rank: " + ninja1.getRank());

        Missao missaoD = new Missao("Recuperar o gato da Sra. Feudal", NivelMissao.D);
        Missao missaoC = new Missao("Escolta de construtores de pontes", NivelMissao.C);
        Missao missaoA = new Missao("Derrotar um membro da Akatsuki", NivelMissao.A);

        ninja1.realizarMissao(missaoD);
        ninja1.realizarMissao(missaoC);

        ninja1.treinar();
        System.out.println("Novo Rank: " + ninja1.getRank());

        ninja1.realizarMissao(missaoC);
        ninja1.realizarMissao(missaoA);

        ninja1.treinar();
        ninja1.treinar();
        System.out.println("Novo Rank: " + ninja1.getRank());
        ninja1.realizarMissao(missaoA);
    }
}