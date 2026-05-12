package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for escrito aqui dentro de "Public Static Void" vai ser compilado pelo Java;
        
        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // Colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em caixa alta: " + nomeUpperCase);
        System.out.println(nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println(aldeia);
        System.out.println(aldeiaLowerCase);


    }
}
