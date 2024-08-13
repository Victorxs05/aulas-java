package com.example;

public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios(1899, "Victor", 1500, Setor.VENDAS, Sexo.MASCULINO, 18);

        System.out.println("\n Dados do Funcionario: ");
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.println("Idade: " + funcionario.getIdade());
    }
}