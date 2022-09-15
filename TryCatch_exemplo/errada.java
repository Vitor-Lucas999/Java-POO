/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TryCatch_exemplo;

/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com Criado
 * em: 24/08/2022 * Modificado em: 29/08/2022
 */
public class errada {

    public static void main(String[] args) {
        int[] x = new int[4];
        for (int c = 0; c < 10; c++) {
            try {

                x[c] = c;
                System.out.println(" valor inserido: " + c);
            } catch (Exception e) {  // ArrayIndexOutOfBoundsException e 
                System.out.println(" ** Problema ocorrido, avise um administrador ** ");
                System.out.println(e);
            } finally {
                System.out.println("Terminou um ciclo." + c + ".");
                try {
                    System.out.println(" valor inserido: " + x[c]);
                    System.out.println(" ");
                } catch (Exception e2) {
                    System.out.println(" ");
                    System.out.println("O vetor não pode ser impresso. (executa apenas [4] vezes)");
                    System.out.println(" ");
                }
            }
        }

    }

}
