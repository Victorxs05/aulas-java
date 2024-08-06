/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pet;

/**
 *
 * @author aluno.den
 */
public class Pet {

    public static void main(String[] args) {
        DadosPet pet1 = new DadosPet("Ronald", 39, "Vira-lata", "Médio", "Ração de tangirina");
        
        System.out.println("\n Dados do Pet: ");
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());
        
    }
}
