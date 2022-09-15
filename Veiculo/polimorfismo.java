package Veiculo;
// 04 - Polimorfismo: Na classe que executa, instancie vários objetos veículo usando vetor e se apropriando das subclasses (no mínimo 5)
/**
 * // @vitor.gouvea.exe -> Vitor Lucas Gouvea -> vlucasgouvea@gmail.com
 * Criado em: 12/09/2022    * Modificado em: 13/09/2022  * às 16:00h
 */
public class polimorfismo {
    public static void main(String[] args) {
        Veiculo[]c = new Veiculo[7];
        c[0] = new aviao("f-35 ", 2002, 666, " Missil Storm Shadow"); // cv(hp, cavalos) e arma(missil ou metralhadora) é um novo atributo subclasse
        c[1] = new moto("BMW GS ", 2020,800 );
        c[2] = new carro("Prisma ", 2010, "Sedan");
        c[3] = new tanque(" T-14 Armata, russo ", 1969, 125 );
        c[4] = new carro("F-3000 ", 2020, "4x4");
        c[5] = new moto("Crf ",1999, 130);
        c[6] = new aviao("A-29 Super Tucano. ", 2020, 1300, "BAFG (Bomba de Baixo Arrasto para Fins Gerais)");

        c[0].mostrar(); c[1].mostrar(); c[2].mostrar(); c[3].mostrar(); c[4].mostrar(); c[5].mostrar(); c[6].mostrar();
    }
}
