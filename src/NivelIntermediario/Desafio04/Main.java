package NivelIntermediario.Desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico n1 = new NinjaBasico("Naruto",17,"Rasengan");

        n1.mostrarInformacoes();
        n1.executarHabilidade();

        NinjaAvancado n2 = new NinjaAvancado("Sasuke",18,"Sharingan",TipoHabilidade.NINJUTSU);
        n2.mostrarInformacoes();
        n2.executarHabilidade();
    }
}
