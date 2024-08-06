/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo3;

//import java.awt.BorderLayout;

/**
 *
 * @author aluno.den
 */
public class Exemplo3 {

    public static void main(String[] args) {
        String nomeUsuario = "Marta";
        int senha = 123;
        
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);
        
        System.out.println("O nome do usuario esta correto? " + resultadoNome);
        System.out.println("A senha esta correta? " + resultadoSenha);
    }
}
