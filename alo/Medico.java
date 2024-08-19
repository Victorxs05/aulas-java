/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\n Dados do Medico: " +
                "\nNome: " + super.nome +
                "\nCPF: " + super.cpf +
                "\nRG: " + super.rg +
                "\nSalario: " + super.salario +
                "\nCRM:" + crm;
    }
    
    
    
}
