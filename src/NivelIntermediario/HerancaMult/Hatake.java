package NivelIntermediario.HerancaMult;

import java.io.Serializable;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {
    //metodo obrigatorio pelo contrato com o sharingan interface
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": eu ativei o Sharingan !!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Me tornei um ANBU Elite !!");
    }

    public void BoasVindas(){
        System.out.println(nome + ": eu sou Hatake !!");
    }

}
