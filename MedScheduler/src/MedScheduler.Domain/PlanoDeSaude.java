class PlanoDeSaude {
    private String nome;
    private String numeroCarteirinha;
    private String validade;

    public PlanoDeSaude(String nome, String numeroCarteirinha, String validade) {
        this.nome = nome;
        this.numeroCarteirinha = numeroCarteirinha;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCarteirinha() {
        return numeroCarteirinha;
    }

    public void setNumeroCarteirinha(String numeroCarteirinha) {
        this.numeroCarteirinha = numeroCarteirinha;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}