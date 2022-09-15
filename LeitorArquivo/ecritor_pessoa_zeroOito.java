/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeitorArquivo;
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com Criado
 * em: 13/09/2022 * Modificado em: 13/09/2022 hora: 18:00:00h
 */
import java.io.*;
// import java.util.Scanner;

class ecritor_pessoa_zeroOito {
   public static void main(String[] args) {
    // Scanner ler = new Scanner(System.in);
    // System.out.println("Digite uma pessoa: [Nome, Idade, Sexo e Profissão]");
    // Pessoa P1 = ler.equals(obj);               // tentei mas é melhor deixar p lá, rs
       try {
           FileWriter gravador = new FileWriter("pessoa.txt"); //Criar novo arquivo, com URL se quiser
           BufferedWriter saida = new BufferedWriter(gravador); //Permite gravar textos inteiros no arquivo aberto pelo FileWriter.
           
           saida.write("Maria Pé de Feijão% 16% mulher com bigode% trepadeira \n");
           saida.write("João Pé de Feijão% 17% omen de voz delicada% sobe em pau");

           saida.flush(); // o comando FLUSH mostra na última das três linhas.
       } catch (Exception e) {
            System.out.println("Não deu para escrever o arquivo");
       }
   }
}
