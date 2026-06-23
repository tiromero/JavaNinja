package NivelIntermediario.Refatorar;

public class Uchiha extends Ninja implements SharinganInterface {

    //CriaR CONSTRUTORES
    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String aldeia, RankNinja rank) {
        super(nome, idade, aldeia, rank);
    }

    /*
    * Metodo:
    * Implementa a interface Sharigan
    * */
    @Override
    public void shariganAtivado() {
        System.out.println(getNome() +" possui: Sharingan ativado!");
    }
}
