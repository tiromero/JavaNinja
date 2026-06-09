package NivelIntermediario.HerancaMult;

public class Uchiha extends Ninja implements SharinganInterface {

    //esse metodo vem direto da interface
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": eu ativei o Sharingan !!");
    }
}
