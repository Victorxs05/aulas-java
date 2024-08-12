/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulahoje;

/**
 *
 * @author aluno.den
 */
public class Aulahoje {

    public static void main(String[] args) {
        Dados cliente = new Dados("Victor", 18, 76543, "Salvador", 1234);
        
        Dados veiculo = new Dados("PQP", "Prata", 50, 100, 240, 15);
        
        System.out.println("\n Dados do cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        
        System.out.println("\n Dados do veiculo: ");
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Passageiros: " + veiculo.getNumeroPassageiros());
        System.out.println("Capacidade do tanque: " + veiculo.getCapacidadeTanque());
        System.out.println("Velocidade Maxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("Consumo Médio: " + veiculo.getConsumoMedio());
        
         
    }
}
