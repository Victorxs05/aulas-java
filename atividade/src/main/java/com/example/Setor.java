package com.example;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECRUSOS_HUMANOS("Recursos_humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    String funcoes;

    private Setor(String funcoes) {
        this.funcoes = funcoes;
    }

    public String getFuncoes() {
        return funcoes;
    }
    
}
