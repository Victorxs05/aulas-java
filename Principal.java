/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        // Instanciando  um objeto

        cliente clientes = new cliente("Marta", 18);
        Funcionarios funcionario = new Funcionarios("Victor", "chefe", 10000);
                
        
        //clientes.nome = "Marta";
        //clientes.idade = 18;
        
        //clientes.setNome("Marta");
        //clientes.setIdade(18);
        
        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Idade: " + clientes.getIdade());
        
        System.out.println("\nDados do funcionario:  ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Salario: " + funcionario.getSalario());
        
    }
}
