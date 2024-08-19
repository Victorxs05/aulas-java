/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal2;

/**
 *
 * @author aluno.den
 */
public class Principal2 {

    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica(Sexo.FEMININO, "12314", "132143", "09/09/1999", 5000);
        
        Juridica pessoaJuridica = new Juridica("1321", "9877", "09-07-2000", "10-03-2020", 6000);
        
        Endereco endereco = new Endereco("Rua A.", "123", "N/A", "12314", "Salvador", UnidadeFederativa.BAHIA);
        
        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
        System.out.println(endereco.toString());
    }   
       
}
