package NivelBasico.Arrays;

public class Arrays {
    public static void main(String[] args) {
        //Arrays são tipo Referencia!
        // String inicializa como NULL
        String[] ninja = new String[5];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja);

        // Redeclarar Arrays
        //Redeclarar cria OUTRO ESPAÇO na memoria, nao sendo a mesmas referencias

        ninja = new String[6];

        ninja[0] = "Hokage 1";
        ninja[1] = "Hokage 2";
        ninja[2] = "Hokage 3";
        ninja[3] = "Hokage 4";
        ninja[4] = "Hokage 5";
        ninja[5] = "Naruto Uzumaki";

        // For para fazer um LOOP no array

        for (int i = 0; i < 6; i++) {
            System.out.println(ninja[i]);
        }

        // Int inicializa como 0
        int[] idade = new int[2];

        System.out.println("idade[1] = " + idade[1]);

        //Boolean inicializa com o False
        boolean[] verdadefalso = new boolean[3];
        System.out.println("verdadefalso[2] = " + verdadefalso[2]);

        //Double inicializa com o 0.0
        double[] flutuante = new double[2];
        System.out.println("flutuante[0] = " + flutuante[0]);

        //Char inicializa com o
        char[] umseta = new char[2];

        System.out.println("umseta[1] = " + umseta[1]);

    }

}
