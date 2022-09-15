/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com 
 * Criado em: 18/08/2022   * Modificado em: 12/09/2022
 */
public class carro extends Veiculo { //extends= Herda tudo da superclasse 'Veiculo'

    String categoria;  // atributo EXCLUSIVO de carro

    carro(String m, int a, String cat) { //Construtor do carro
        super(m, a); //roda o método construtor da superclasse 'Veiculo'
        this.categoria = cat; // adiciona +1 atributo: se é de LUXO, POPULAR
    }
    void apresentacao() {  // MÉTODO que mostra toda a info do objeto 
     System.out.println( "CARRO: "+this.modelo+this.categoria+" "+this.ano_fabricacao+". Estado: "+this.estado_funcionamento+". Combustivel: "+this.gas); 
    }
    void mostrar() {
        System.out.println("Carro: "+this.modelo+this.ano_fabricacao+". Categoria "+this.categoria);
    }
}
