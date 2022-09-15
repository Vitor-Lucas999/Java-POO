/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 18/08/2022    * Modificado em: 12/09/2022
 */
public class Veiculo {

    String modelo;
    int ano_fabricacao;
    String estado_funcionamento;
    int gas; // nova variavel COMBUSTIVEL

    Veiculo(String m, int a) {  // MÉTODO *construtor* , recebe DOIS valores
        this.modelo = m;
        this.ano_fabricacao = a;
        this.estado_funcionamento = "Perfeito";
        this.gas = 100; // novo atributo COMBUSTIVEL 100%
    }
    void acelerar() { // novo método, acelerou, bebeu -1% de GAS (combustivel)
     this.gas --; 
     System.out.println(this.modelo+" acelerou!");
    }
    void levar_tiro() {   //MÉTODO para qunado o veiculo  levar tiro , não recebe ou passa valor (fuzil cantou, rs)
        this.estado_funcionamento = "Estragado"; 
        System.out.println(this.modelo+" levou um tiro.");
    }
    void mostrar() {
        System.out.println("Veículo: "+this.modelo+this.ano_fabricacao+". Está "+this.estado_funcionamento+" e combustivel %"+this.gas);
    }
}
