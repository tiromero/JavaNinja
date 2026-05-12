package NivelBasico.Condições;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: São maneiras de reduzir o codigo;
        *
        * variavel = (Condição) ? valorSeVerdadeiro : ValorSeFalso;
        * */

        short numeroDeMissoes = 9;

        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 Missoes." : "Esse ninja esta com menos de 10 Missões";
        System.out.println(nivel);
        System.out.println("Missões = " + numeroDeMissoes);


    }
}
