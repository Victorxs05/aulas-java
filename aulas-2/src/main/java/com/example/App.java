package com.example;
import java.util.Scanner; 

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner teclado = new Scanner(System.in);

        String resultado;
        int primeiraNota, segundaNota;
        double media;
        
        System.out.println("Digite a primeira nota: ");
        primeiraNota = teclado.nextInt();

        System.out.println("Digite a segunda nota: ");
        segundaNota = teclado.nextInt();

        media = (primeiraNota + segundaNota) / 2;
        
        if (media >= 7) {
            resultado = "Aprovado!";
        }  
        else if (media >= 5) {
            resultado = "Verificação Suplementar";
        } else {
            resultado = "Reprovado!";
        }

        System.out.println("Primeira Nota: " + primeiraNota);
        System.out.println("Segunda Nota: " + segundaNota);
        System.out.println("Média: " + media);
        System.out.println("Primeira Situação: " + resultado);

        }
    }

