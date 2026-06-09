package NivelIntermediario.ClassesAbstratas.part2;

public abstract class Ninja {
    String nome;
    int idade;

    /*
    * Essa merda de classe abstrata serve pra 3 coisas, encher seu saco, escalabilidade e manutenção
    * Protege de alguem fazer cagadas nesses molde, usando outra classe comum para realizar o uso dessa.
    * */

    //Criar metodos abstratos
    public abstract void nomeDoninja();
}
