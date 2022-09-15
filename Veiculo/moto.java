/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;
/**
 * @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 22/08/2022   * Modificado em: 
 */
public class moto extends Veiculo {

   int cilindrada;
    moto(String m, int a, int cc) {
        super(m, a);
        this.cilindrada = cc;
    }
    void apresentacao() {  // MÉTODO que mostra toda a info do objeto 
     System.out.println( "MOTO: cc"+this.cilindrada+" "+this.modelo+" "+this.ano_fabricacao+". Estado: "+this.estado_funcionamento+". Combustivel: "+this.gas); 
    }
    void levar_tiro() {  // fuzil cantou 
        this.estado_funcionamento = "Avariada";
        System.out.println(this.modelo+" foi atingido. 'Droga! Verifique os danos.' "); 
    } 
    void mostrar() {
        System.out.println("Moto: "+this.modelo+this.ano_fabricacao+". Com o motor de "+this.cilindrada+"cc.");
    }
} 