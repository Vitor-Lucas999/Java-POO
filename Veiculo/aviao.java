/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;
/**
 * @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 22/08/2022   * Modificado em: 12/09/2022
 */
public class aviao extends Veiculo {
    int cavalos;
    String arma; // new atribute
    aviao(String m, int a, int hp, String arm) {
        super(m, a);
        this.cavalos = hp; // Horse Powers
        this.arma = arm;
    }
    void atirar() {  // novo método que atira missil
        System.out.println("\n !! AVIÃO ATIROU !!  "+this.arma+"\n");
    }
    void levar_tiro() {
        this.estado_funcionamento = "Danificado, furado.";
        System.out.println(this.modelo+" foi atingido. 'Balaço! Está furado. O avião foi furado!' "); 
    } 
    void apresentacao() {  // MÉTODO que mostra toda a info do objeto 
     System.out.println( "AVIÂO: "+this.modelo+" "+this.ano_fabricacao+". Atiro "+this.arma+" e tenho "+this.cavalos+" de potência. Estado: "+this.estado_funcionamento+". Combustivel: "+this.gas); 
    }
    void mostrar() {
        System.out.println("Avião: "+this.modelo+this.ano_fabricacao+". Motor de "+this.cavalos+"hp. E atiro "+this.arma);
    }
} 
