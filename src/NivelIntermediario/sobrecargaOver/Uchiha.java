package NivelIntermediario.sobrecargaOver;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    //Sobrecarga de metodo - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Inteligencia de combate de " + nome + " ativado !");
    }

    //Sobrecarga de metodo - Inteligencia de combate
    @Override
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
