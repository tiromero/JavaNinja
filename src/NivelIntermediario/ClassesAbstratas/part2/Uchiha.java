package NivelIntermediario.ClassesAbstratas.part2;

public class Uchiha extends Ninja {
    @Override //sobrescrever o metodo da classe ninja
    public void nomeDoninja() {
        System.out.println("Meu nome é: "+ nome);
    }
}
