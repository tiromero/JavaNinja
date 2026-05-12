package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";

        Problematica teriamos que criar muitas linhas de codigos para gerar ninjas e mostrar eles no console!
        Resolução:
        Ai entra o Array:
        */

        String[] ninja = new String[4];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";

        System.out.println(ninja);

    }
}
