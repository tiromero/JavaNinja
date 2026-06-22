package NivelIntermediario.Enums;

public enum RankDeMissoes {
    //PADRONIZAR DIAS DA SEMANA, MEIOS DE PAGAMENTOS, ELEMENTOS QUE NAO MUDAM
    A("Altissima", 5),
    B("Alto", 4),
    C("Médio",3),
    D("Baixo", 2),
    E("Baixissimo", 1),
    ;

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
