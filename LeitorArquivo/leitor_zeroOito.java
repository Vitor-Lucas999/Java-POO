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
import java.util.*;

 class leitor_zeroOito {
    public static void main(String[] args) {
        try { // FileREADER classe que faz a LEITURA de arquivo
            FileReader gravador = new FileReader("pessoa.txt");
            BufferedReader entrada = new BufferedReader(gravador);
        String linha;
            while ((linha = entrada.readLine()) != null) {
                 System.out.println(linha);
                 StringTokenizer tok = new StringTokenizer(linha, "%");
                 System.out.println("Pessoa: " + tok.nextToken() + " já viveu" + tok.nextToken() + " anos, e é" + tok.nextToken()+" e sua ação é"+tok.nextToken());
                 System.out.println("______________________________");
/*
                 System.out.println("Pessoa: " + tok.nextToken());
                 System.out.println("Idade: " + tok.nextToken());
                 System.out.println("Genero sexo: " + tok.nextToken());
                 System.out.println("Profissão: " + tok.nextToken());
                  System.out.println("-----------------------"); */
                }
        } catch (IOException e) {
             System.out.println("Não deu para ler o arquivo");
            }
    }
}
