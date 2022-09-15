/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 18/08/2022   * Modificado em:  12/09/2022
 */
public class tanque extends Veiculo {

    int calibre_canhao;  // atributo EXCLUSIVO de tanque

    tanque(String m, int a, int cal) { 
        super(m, a);
        this.calibre_canhao = cal;
    }
 // @override  // modificador 'Final'
    void levar_tiro() {   // fuzil cantou
        this.estado_funcionamento = "Pouco avariado";
        System.out.println(this.modelo+" foi atingido. 'Haha! Otário! Nem doeu!' "); 
    }
    void apresentacao() {  // método (função) para mostrar os dados
        System.out.println("TANQUE: calibre "+calibre_canhao+", modelo "+this.modelo+", ano: "+this.ano_fabricacao+", Estado: "+this.estado_funcionamento+", combustivel:"+this.gas); 
    }
    void mostrar() {
        System.out.println("Tanque: "+this.modelo+this.ano_fabricacao+". Canhão de "+this.calibre_canhao+"mm.");
    }
     
} 