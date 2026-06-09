package NivelIntermediario.RefMemoria;

public class Uzumaki extends Ninja {

    public void ModoSabioAtivado(){
        System.out.println("Meu nome é " +nome+". \nE eu Ativei o modo modo sabio da " +aldeia+"!!\n");
    }

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int missoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, missoesConcluidas, rank);
    }

}
