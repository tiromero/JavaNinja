package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {
    public Uchiha() {
        super(); //usar o super fará a subclasse Uchicha pegar o construtor da super classe Ninja
        //o thiss nao se usa aqui pq o this se referencia a superclasse
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade); //o this de subclasse é super(instancias)
    }

    //metodos abstratos obrigatoriamente nao precisa colocar @override pois ja tem q ser incluida nas classes que usam Ninja
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Uchiha estrategia de batalha ninja");
    }

    //anotations é essencial para trabalhar com polimorfismo
    @Override //usado para subscrever um metodo()
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome + "\n e esse é meu ataque Uchiha, uma bola de fogo!");
    }
}
