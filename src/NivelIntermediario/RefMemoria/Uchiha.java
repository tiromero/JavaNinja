package NivelIntermediario.RefMemoria;

public class Uchiha extends Ninja  {

    public void SharinganAtivado(){
        System.out.println("Meu nome é " +nome+". \nE eu Ativei o Sharingan da " +aldeia+"!!\n");
    }

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }


}
