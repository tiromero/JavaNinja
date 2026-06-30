package NivelIntermediario.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Array
        //São estaticos , nao alteram de tamanho.
        String[] ninjasArray = new String[3];

        ninjasArray[0] ="Naruto";
        ninjasArray[1] ="Sakura";
        ninjasArray[2] ="Sasuke";

        //Listas
        //Listas não sao estaticas, elas podem aumentar/diminuir de tamanho.
        List <String> ninjasList = new ArrayList<>();

        //Adicionar na lista
        ninjasList.add("Naruto");
        ninjasList.add("Sakura");
        ninjasList.add("Sasuke");
        ninjasList.add("Rock Lee");

        System.out.println("Lista : " + ninjasList);
        //Remover da lista
        ninjasList.remove("Sasuke");
        System.out.println("Lista : " + ninjasList);

        //Trocar elementos
        ninjasList.set(2,"Sasuke");
        System.out.println("Lista :   " + ninjasList);

        //Ver o tamanho da lista
        System.out.println("Ver tamanho de Lista = " + ninjasList.size()+ " elementos.");

    }
}
