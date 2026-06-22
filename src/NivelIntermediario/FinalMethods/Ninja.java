package NivelIntermediario.FinalMethods;

public class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    RankNinja rank;
    int NumerodeMissoesConcluidas;
    final double altura = 1.76; //Final faz com que a variavel nao muda

    public Ninja() {
    }

    //TODO NINJA VAI FAZER OBRIGATORIAMENTE
    //METODO PARA NAO SOBRESCEVER DE NENHUMA FORMA , É USAR final
    final public void tacarKunai(){
        System.out.println("EU SOU UM METODO DA CLASSE MAE");
    }




    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, RankNinja rank, int numerodeMissoesConcluidas) {
        this(nome, aldeia, idade);
        this.rank = rank;
        NumerodeMissoesConcluidas = numerodeMissoesConcluidas;
    }

    @Override
    public void EstrategiaDeBatalhaa() {
        System.out.println("Estrategia de batalha modo "+ aldeia);
    }
}
