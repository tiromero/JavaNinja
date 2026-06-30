package desafios.DesafioDia2;

public enum NivelMissao {
    A("Reputação: 1000"),
    B("Reputação: 100"),
    C("Reputação: 50"),
    D("Reputação: 10");

    String recompensa;

    NivelMissao() {
    }

    NivelMissao(String recompensa) {
        this.recompensa = recompensa;
    }
}
