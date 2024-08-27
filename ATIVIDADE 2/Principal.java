/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        System.out.println("Soma: " + soma.calcular(2.0, 3.0));
        System.out.println("Subtração: " + subtracao.calcular(2.0, 3.0));
        System.out.println("Multiplicação: " + multiplicacao.calcular(2.0, 3.0));
        System.out.println("Divisão: " + divisao.calcular(2.0, 3.0));
   
    }
}
