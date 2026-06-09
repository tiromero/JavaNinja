package NivelIntermediario.ClassesAbstratas.part2;

public class Main {
    public static void main(String[] args) {
        /*Classes abstratas e interfaces nao podem criar objetos
         APENAS classes comuns criam objetos
         Toda vez que se cria uma Interface , ela é obrigatoriamente abstrato
         A diferença de ambas é que toda vez que voce cria uma interface, todos os atributos criados nele, nao podem ser cetadas
         voce só pode ja criar na interface , ja que la é tudo automaticamente FINAL
         */

        //obj ninja n da pra ser criado pelo abstrato


        //objeto uzumaki
        Uzumaki Naruto = new Uzumaki();
        Naruto.tacarUmaShuriguen();

        //objeto uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.nomeDoninja();
    }
}
