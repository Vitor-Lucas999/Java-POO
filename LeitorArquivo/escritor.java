/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeitorArquivo;
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com Criado
 * em: 31/08/2022 * Modificado em: 01/09/2022 hora: 10:10:00
 */
import java.io.*;
class escritor {
    public static void main(String[] args) {
        try {
            FileWriter gravador = new FileWriter("arquivo.txt");
            BufferedWriter saida = new BufferedWriter(gravador);
/*Gravação*/saida.write("Olá mundo \n");
            saida.write(" F O G U E T E !! !! !!  "); 
            saida.flush(); // o comando FLUSH mostra na última das três linhas. 
        } catch (IOException e) {
            System.out.println("Não deu para escrever o arquivo");
        }
    }
}
