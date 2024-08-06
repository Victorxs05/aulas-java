/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro;

/**
 *
 * @author aluno.den
 */
public class Biblioteca {

    public static void main(String[] args) {
        Livro livros = new Livro("Matematica", "Pitagoras", 500, 250);
        
        Livro livros2 = new Livro("Pai rico, pai pobre", "Robert Kiyosaki", 336, 30.16);
        
        
        System.out.println("\n Dados do livro: ");
        System.out.println("Titulo: " + livros.getTitulo());
        System.out.println("Autor: " + livros.getAutor());
        System.out.println("Paginas do livro: " + livros.getPaginas());
        System.out.println("Preço: " + livros.getPreco());
        
        System.out.println("\n Dados do livro 2: ");
        System.out.println("Titulo: " + livros2.getTitulo());
        System.out.println("Autor: " + livros2.getAutor());
        System.out.println("Paginas do livro: " + livros2.getPaginas());
        System.out.println("Preço: " + livros2.getPreco());
    }
}
