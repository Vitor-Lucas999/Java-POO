package Throws_exemplo;

/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 29/08/2022    * Modificado em: 29/08/2022 hora: 11:11:00
 */
class errada2 {
    void rodar() throws ArrayIndexOutOfBoundsException {
        int[]x = new int[4];
        for (int c = 0; c<10; c++)  {
            x[c] = c;
        }
    }
}
public class ProgErrado {
    public static void main(String[] args) {
        errada2 x = new errada2(); //objeto X Criado a partir da classe Errada2
        try {
            x.rodar();
        } catch (Exception e)  {
            System.out.println("Deu um ERRO");
            System.out.println(e);
        }
    }
}
