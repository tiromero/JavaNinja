package NivelIntermediario.sobrecargaOver;

public class Ninja implements EstrategiaDeBatalha, HabilidadeEspecial {
    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas , Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    RankNinja rank;


    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do constrtutor, chamando os novos atributos
    //Sobrecarga de metodos voce nao precisa redeclarar o constrtutor so os novos atributos atraves de this(instancias);

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Estrategia de batalha de " + nome + " ativado! \nCompletei o Total de " +numeroDeMissoesConcluidas + " missões.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Especial de " + nome + " ativado !");
    }

    //Sobrecarga de metodo - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Inteligencia de combate de " + nome + " ativado !");
    }

    //Sobrecarga de metodo - Inteligencia de combate
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu QI é: " + qi +" e você é um gênio!");
        } else if (qi >= 130){
            System.out.println("Seu Qi é: "+ qi +" e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: "+ qi +" e você precisa estudar mais!");
        }
    }

}
