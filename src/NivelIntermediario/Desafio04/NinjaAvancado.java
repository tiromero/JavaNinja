package NivelIntermediario.Desafio04;

public class NinjaAvancado extends NinjaBasico {
    TipoHabilidade especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, TipoHabilidade especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + this.especialidade);
    }
    @Override
    public void executarHabilidade() {
        System.out.println( this.nome + " esta\nexecutando a \nhabilidade especial: "+this.especialidade + "\ncom seu " + this.habilidade + "!\n");
    }

}
