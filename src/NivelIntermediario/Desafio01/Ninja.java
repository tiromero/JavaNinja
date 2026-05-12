package NivelIntermediario.Desafio01;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissão;

    public void mostrarInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Missão: "+missao);
        System.out.println("Nivel dificuldade: "+nivelDificuldade);
        System.out.println("Status da Missão: "+ statusMissão);
    }
}
