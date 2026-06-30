package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    //usar de boa pratica o <T>, para deixar a classe generica;
    private List<T> equipamentos = new ArrayList<>(); //inicializar aqui

    //Colocar equipamentos genericos
    public void adicionarEquipamentos(T equipamentoGenerico){
        equipamentos.add(equipamentoGenerico);
    }

    public BolsaGenerica() {
        //aaa
    }

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    //Transformar as listas de equipamentos em string
    @Override
    public String toString(){
        return "Bolsa de Equipamentos: "+ equipamentos.toString();
    }

}
