/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tela; import javax.swing.*; import java.awt.*;

/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com Criado
 * em: 14/09/2022 * Modificado em: 14/09/2022
 */
public class label_button {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Primeira tela");
        JLabel texto = new JLabel("Frase indicativa");
        tela.setBounds(100, 100, 600, 400);
        tela.getContentPane().setBackground(Color.GREEN);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        texto.setBounds(100, 100, 200, 30);
        tela.setLayout(null);
        tela.add(texto);
        tela.setVisible(true);
    }
}
