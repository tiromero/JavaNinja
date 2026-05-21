package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        Hokages Hashirama = new Hokages();
        
        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println("Nome = " + Tobirama.nome);

        Hokages Hiruzen = new Hokages(40);
        System.out.println("Idade = " + Hiruzen.idade);

        Hokages Minato = new Hokages("Minato",40,true);
        System.out.println("Nome = " + Minato.nome);
        System.out.println("Idade = " + Minato.idade);
        System.out.println("Vivo ? = " + Minato.vivoOuNao);
    }
}
