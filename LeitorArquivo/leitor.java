/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeitorArquivo;
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com Criado
 * em: 31/08/2022 * Modificado em: 01/09/2022 hora: 10:00h
 */
import java.io.*;
import java.util.*;

class leitor {
    public static void main(String[] args) {
        try { // FileReader classe que faz a leitura de arquivo
            FileReader gravador = new FileReader("Bebidas.txt");
            BufferedReader entrada = new BufferedReader(gravador);
        String linha;
            while ((linha = entrada.readLine()) != null) {
                 System.out.println(linha);
                StringTokenizer tok = new StringTokenizer(linha, ";");
               System.out.println("Bebida: " + tok.nextToken());
               System.out.println("Origem: " + tok.nextToken());
               System.out.println("Grau de alcool: " + tok.nextToken());
               System.out.println("-----------------------");
            }
        } catch (IOException e) {
            System.out.println("Não deu para ler o arquivo");
        }
    }
}
