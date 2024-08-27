/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal2;

/**
 *
 * @author aluno.den
 */
public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.2;

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }
    public double getPREMIO() {
        return PREMIO;
        
  
        
    }
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("- Admitir funcionario -");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("- Demitir funcionario - ");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public String toString() {
        return "\nDiretor:" +
                "\nNome: " + super.nome +
                "\nNome: " + super.nome +
                "\nNome: " + super.nome +
                "\nNome: " + super.nome +
                "\nNome: " + super.nome +
                "\nNome: " + super.nome +
                
                
                
                "PREMIO=" + PREMIO + '}';
    }
    
    
}
