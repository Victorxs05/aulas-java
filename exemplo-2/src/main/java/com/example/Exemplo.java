package com.example;

/**
 * Hello world!
 *
 */
public class Exemplo {
    public static void main( String[] args ) {
        
        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.lenght());

        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo usando metodos String - Maiusculas
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());

        // Exibindo nome completo usando métodos Strings - Minúsculas
        System.out.println("Concatenação Minúsculas: " + nomeCompleto.toLowerCase());
    }
}
