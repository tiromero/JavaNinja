package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //criar um metodo geral, todos tem:
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome + "\n e esse é meu ataque especial.");
    }

    //Sobrescevenbdo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é minha estrategia de batalha ninja");
    }


}