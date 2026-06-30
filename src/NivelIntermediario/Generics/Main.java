package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken de Agua");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho lendario");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);

    }
}
