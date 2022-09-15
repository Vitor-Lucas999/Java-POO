/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tela; import javax.swing.*; import java.awt.*;

/** / @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com Criado
 * em: 14/09/2022 * Modificado em: 15/09/2022
 */
  class textField {
    public static void main(String[] args) {
        JFrame tela = new JFrame("Primeira tela");
        tela.setBounds(99, 99, 666, 666);
        tela.getContentPane().setBackground(Color.PINK);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        JLabel texto = new JLabel("10 - Interface Básica");
        texto.setBounds(99, 99, 222, 33);
        tela.add(texto); 

        JButton botao2 =new JButton("search");
        botao2.setBounds(300,297, 99, 36);
        botao2.setBackground(Color.orange);
        botao2.setForeground(Color.yellow);
        botao2.setToolTipText("Botão Search");
        tela.add(botao2); 
        JTextField pesquisa = new JTextField();
        pesquisa.setBounds(100, 300, 200, 30);
        pesquisa.setBackground(Color.yellow);
        pesquisa.setForeground(Color.black);
        tela.add(pesquisa);
        JLabel tituloPesquisa = new JLabel("Pesquise: ");
        tituloPesquisa.setBounds(44, 299, 222, 33);
// FONTE -> alterar
        tela.add(tituloPesquisa);

        JTextField caixaTextField = new JTextField();
        caixaTextField.setBounds(100, 266, 169, 30);
        caixaTextField.setBackground(Color.red);
        caixaTextField.setForeground(Color.white);
        tela.add(caixaTextField);
        JLabel tituloTextField = new JLabel("Label : ");
        tituloTextField.setBounds(44, 264, 222, 33);
// FONTE -> alterar
        tela.add(tituloTextField);

        JButton botao = new JButton("Macete o Butauuumm");
        botao.setBounds(269, 264, 222, 33);
        botao.setBackground(Color.RED);
        botao.setForeground(Color.BLUE);
        botao.setToolTipText("MACEEETEE");
        tela.add(botao);

        JFrame tela2 = new JFrame("Segunda tela");
// em PRODUÇÃO

        tela.setVisible(true);
    }
}

