/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 20/08/2022    * Modificado em: 24/08/2022
 */
public class ciadora { // classe que contem tudo que vai executar a principal
    public static void main(String[] args) {
// Criação de objetos com HERANÇA
     tanque T1 = new tanque ("Tunder Lazer", 2010, 50);
     tanque T2 = new tanque ("Bufalo ", 2005, 60);
     tanque T3 = new tanque("M1A2 SEP A.", 1980, 120); // criei
     carro C1 = new carro ("Fusca", 1996, " itamar");
     carro C2 = new carro ("Opala", 1980, " SS");
     carro C3 = new carro ("Vectra", 2010, " B");  // criei 
     moto M1 = new moto("Himalayan", 2022, 410);
     moto M2 = new moto("Kansas", 2009, 200)


        //Classe de impressão com metodo para impressão
         class impress {
             public void imp() {
              System.out.println("   ");
              T1.apresentacao();
              T2.apresentacao();
              T3.apresentacao();
              C1.apresentacao();
              C2.apresentacao();
              C3.apresentacao();
              M1.apresentacao();
              M2.apresentacao();
             } 
            }
         impress i = new impress(); // criação do objeto para impressão
           i.imp(); //fazendo a IMPRESSÃO de objetos
/* void levar_tiro() */       
            System.out.println(" Tiro! ");  C1.levar_tiro(); T1.levar_tiro();
         i.imp(); 
     }

}
