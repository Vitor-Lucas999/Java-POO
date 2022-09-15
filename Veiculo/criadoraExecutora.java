/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 20/08/2022    * Modificado em: 12/09/2022  * às 18:00h
 */
public class criadoraExecutora { // classe que contem tudo que vai executar a principal
    public static void main(String[] args) {
// Criação de objetos com HERANÇA
     tanque T1 = new tanque ("Tunder Lazer", 2010, 50);
     tanque T2 = new tanque ("Bufalo ", 2005, 60);
     tanque T3 = new tanque("M1A2 SEP A.", 1980, 120); // criei
     carro C1 = new carro ("Fusca", 1996, " itamar");
     carro C2 = new carro ("Opala", 1980, " SS");
     carro C3 = new carro ("Vectra", 2010, " B");  // criei 
     moto M1 = new moto("Himalayan", 2022, 410);
     moto M2 = new moto("Kansas", 2009, 200);
     aviao A1 = new aviao("F-35", 2006, 999, "Storm Shadow" );


        //Classe de impressão com metodo para apresentacao
         class impress { // classe COMPILADORA de metodos
             public void imp() { // método que executa um outro método .apresentação() 
              System.out.println("\n  Tanques  ");
              T1.apresentacao();
              T2.apresentacao();
              T3.apresentacao();
              System.out.println("  Carros  ");
              C1.apresentacao();
              C2.apresentacao();
              C3.apresentacao();
              System.out.println("  Motos  ");
              M1.apresentacao();
              M2.apresentacao();
              System.out.println("  Avião ");
              A1.apresentacao();
             } 
            }
         impress i = new impress(); // criação do objeto para impressão 
         System.out.println(" Veículos: ");
           i.imp(); //fazendo a IMPRESSÃO de objetos (compilada)
           
         System.out.println(" \nCuidado, perigo a frente! ACELERE!!!!");   A1.atirar();
         T2.acelerar(); T3.acelerar(); C2.acelerar(); C3.acelerar(); M2.acelerar(); // desviou do tiro. Acelerou, gastou 1% combustivel 
/* void levar_tiro() */      
            System.out.println("\n Tiro! Bota pra canta pá! pum!\n");  C1.levar_tiro(); T1.levar_tiro(); M1.levar_tiro(); A1.levar_tiro();
         i.imp(); 
     }
}
