package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    //anotations é essencial para trabalhar com polimorfismo
    @Override //usado para subscrever um metodo()
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome + "\n e esse é meu ataque Uchiha, uma bola de fogo!");
    }
}
