/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.principal2;

/**
 *
 * @author aluno.den
 */
public enum Bonificacao {
    GERENTE(0.35),
    DIRETOR(0.45);
    
    private double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
