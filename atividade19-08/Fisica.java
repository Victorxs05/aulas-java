/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal2;

/**
 *
 * @author aluno.den
 */
public class Fisica {
    private Sexo sexo;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private double salario;

    public Fisica(Sexo sexo, String cpf, String rg, String dataNascimento, double salario) {
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\n Dados da pessoa Fisica: " +
                "\nSexo:" + sexo + 
                "\nCPF:" + cpf + 
                "\nRg:" + rg + 
                "\nData Nascimento:" + dataNascimento + 
                "\nSalario:" + salario;
    }
    
    
    
}
