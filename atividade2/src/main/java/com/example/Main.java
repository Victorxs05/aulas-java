package com.example;

public class Main {
    public static void main(String[] args) {
        Endereco enderecos = new Endereco("itacaranha", "9876 ", "Bar de Neinha", "4000", "Salvador", UnidadesFederativas.BAHIA);
        Pessoa pessoas = new Pessoa(1899, "Victor", 18, "1234", "victorSoares", Sexo.MASCULINO, enderecos);

        System.out.println("Dados da pessoa: ");
        System.out.println("ID: " + pessoas.getId());
        System.out.println("Nome: " + pessoas.getNome());
        System.out.println("Idade: " + pessoas.getIdade());
        System.out.println("Telefone: " + pessoas.getTelefone());
        System.out.println("E-mail: " + pessoas.getEmail());
        System.out.println("Sexo: " + pessoas.getSexo().getTexto());

        System.out.println("Endereco " + enderecos.getUf().getNome());
        System.out.println("Lograduro: " + enderecos.getLogradouro());
        System.out.println("Número: " + enderecos.getNumero());
        System.out.println("Complemento: " + enderecos.getComplemento());
        System.out.println("CEP: " + enderecos.getCep());
        System.out.println("Cidade: " + enderecos.getCidade());
        
    }
}