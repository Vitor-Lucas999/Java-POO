/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tela;

/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 14/09/2022    * Modificado em: 14/09/2022
 */
import javax.swing.*;
import java.awt.*; // o '*' importa TUDO

class classetela {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Primeira tela");
        tela.setBounds(444, 222, 666, 444); /*método SetBounds trabalha com a 
localização e tamanho da tela, sendo a seguinte ordem: 
distância do canto esquerdo da tela, distância do topo da tela, largula e altura.*/
        tela.getContentPane().setBackground(Color.BLUE); /*método que verifica 
qual é o campo de Content do JFrame, ou seja, a região onde não está o menu nem as bordas, 
e muda sua cor a partir do método set Background. */
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ou DIPOSE_ON_CLOSE ("apenas levará o JFrame a fechar sem derrubar o programa todo.")
        tela.setLayout(null);
        tela.setVisible(true); //Este passo vem no FINAL DE TODA a sua montagem.
// segunda tela
        JFrame tela2 = new JFrame("Segunda tela") ;
        tela2.setBounds(333, 299, 333, 222);
        tela2.getContentPane().setBackground(Color.red);
        tela2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela2.setLayout(null);
        tela2.setVisible(true);
    }
}
