/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Motoboy funcionarioMotoboy = new Motoboy("123414", "Victor", "98786", "1245", 5000);
        
        Engenheiro funcionarioEngenheiro = new Engenheiro("BA", "Victor S.", "124141", "1321341", 6000);
        
        Medico funcionarioMedico = new Medico("123", "Doutor Victor", "123414", "1241", 15000);
        
        System.out.println(funcionarioMotoboy.toString());
        System.out.println(funcionarioEngenheiro.toString());
        System.out.println(funcionarioMedico.toString());
    }
}
