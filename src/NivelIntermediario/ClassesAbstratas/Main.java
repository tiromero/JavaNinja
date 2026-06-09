package NivelIntermediario.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Senju hashirama = new Senju();
        hashirama.nome = "Hashirama";
        hashirama.idade = 50;
        hashirama.sabedoria();


        /*Classes abstratas nao podem ser instanciadas
        * vamos chamar essa classe de super
        * ela obriga a todos do codigo a nao usaram a Hokages
        * deixando ela preservada e segura
        *
        * podemos tambem deixar um metodo abstratos
        * mas metodo abstratos NAO PODEM ter corpo
        *
        * Classes que pegam heranças de classes abstratas como a Hokages,
        * são OBRIGADAS a colocar o metodo abstrato que tem na classe
        *
        * Classes abstratas e interfaces nao podem criar objetos
        * só classes comuns criam objetos
        * */

    }
}
