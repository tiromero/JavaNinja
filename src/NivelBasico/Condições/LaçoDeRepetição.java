package NivelBasico.Condições;

public class LaçoDeRepetição {
    public static void main(String[] args) {
        /*
        * Laço de repetição: Vão repetir infinitamente ou até você atingir o parametro designado
        * WHILE = FOR
        * */

        //WHILE
        //while(condição){enquanto a condição for verdadeira, tudo aqui ira acontecer.}

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;
/*
        while (numeroDeClones <= numeroMaxDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras. Clone: " + numeroDeClones);
        }*/

        //FOR
        //for (condição){enquanto a condição for verdadeira, tudo aqui ira acontecer.}
        for (int i = 0; i <= numeroMaxDeClones; i++) {
            System.out.println("O naruto esta clonando. nº : "+ i);
        }
    }
}
