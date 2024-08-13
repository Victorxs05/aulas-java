package com.example;

public enum UnidadesFederativas {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    private String nome;
    private String sigla;
    
    private UnidadesFederativas(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    
}
