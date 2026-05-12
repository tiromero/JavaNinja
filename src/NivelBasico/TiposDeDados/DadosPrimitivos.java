package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        int idade = 19; //valor maximo 2 147 kk
        double altura = 1.65;
        char inicial = 'N';
        boolean VivoOuMorto = true;
        Long saldoBancario = 99999L; //valor maximo superior ao INT

        System.out.println(saldoBancario); //mostrar no console para o usuario
        System.out.println(altura); //sout abreviação de println
        System.out.println(inicial);
        System.out.println("Seu saldo é bancario = " + saldoBancario); //soutv pegar o ultimo valor e printar
        System.out.println("Minha idade é = " + idade);
    }
}
