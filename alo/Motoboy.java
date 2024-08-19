/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\n Dados do Motoboy: " +
                "\nNome: " + super.nome +
                "\nCPF: " + super.cpf +
                "\nRG: " + super.rg +
                "\nSalario: " + super.salario + 
                "\nCNH:" + cnh;
    }
    
}
