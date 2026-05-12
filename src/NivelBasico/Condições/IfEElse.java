package NivelBasico.Condições;

public class IfEElse {
    public static void main(String[] args) {

        /*
        *If e Else - NivelBasico.Desafios.NivelBasico.Desafios.NivelBasico.Desafios.Condições
        * Objetivo: Passar o ninja dede nivel de acordo com o numero de missoes
        *
        * */

        //Ninja 1
        String nome = "Naruto";
        String ranking;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        // se (condição) {Faça isso}
        //&& é "e"
        if(numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chuunin");
        } else if(numeroDeMissoes >= 20 && idade > 15){
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Genin");
        }

        /* A estrutura então é:
         *if (condição) {resultado}
         * else if (condição2){resultado2}
         *else {resultado caso nada seja verdadeira nos IFs acima}
         * */
    }
}
