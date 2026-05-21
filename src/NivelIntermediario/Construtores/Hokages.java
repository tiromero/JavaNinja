package NivelIntermediario.Construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    //Construtor vazio já criado pelo Java, sem argumentos
    public Hokages(){

    }

    //Criar um construtor com argumentos
    public Hokages(String nome){
        this.nome = nome;

    }

    public Hokages(int idade){
        this.idade = idade;
    }

    //Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    //Alt+Insert jeitinho rapido
    //Você consegue criar automaticamente varios argumentos, pesquise por construtor.
    public Hokages(boolean vivoOuNao) {
        this.vivoOuNao = vivoOuNao;
    }

    /*
    * Normalmanete num codigo normal a gente faz um construtor vazio e um construtor com todos os argumenttos , para que todos os atributos sejam preenchidos
    *
    * */
}
