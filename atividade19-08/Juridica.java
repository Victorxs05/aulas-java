/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal2;

/**
 *
 * @author aluno.den
 */
public class Juridica {
    private String cnpj;
    private String inscricaoEstadual;
    private String dataInicio;
    private String dataTermino;
    private double valorContrato;

    public Juridica(String cnpj, String inscricaoEstadual, String dataInicio, String dataTermino, double valorContrato) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return "\nDados da pessoa Juridica:" + 
                "\nCNPJ:" + cnpj + 
                "\nInscricao Estadual: " + inscricaoEstadual + 
                "\nData Inicio:" + dataInicio + 
                "\nData Termino:" + dataTermino + 
                "\nValor Contrato:" + valorContrato; 
    }
    
    
    
}
