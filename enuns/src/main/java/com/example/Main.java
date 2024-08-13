package com.example;

public class Main {
    public static void main(String[] args) {
        Clientes cliente = new Clientes("Marta", Sexo.FEMININO);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Sexo: " + cliente.getSexo());
    }
}