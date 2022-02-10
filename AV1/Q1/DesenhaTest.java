// Aluno: Rafael Fernandes das Neves
// Matrícula: 50015993

package AV1;

import java.util.Scanner;

public class DesenhaTester {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Ponto2D ponto = new Ponto2D();
        Quadrado ponto1 = new Quadrado();
        Quadrado ponto2 = new Quadrado();

        System.out.print("Digite a 1° coordenada do quadrado: ");
        ponto.setX(x);
        System.out.print("Digite a 2° coordenada do quadrado: ");
        ponto.setY(y);

        ponto1.setPonto1(ponto);

        System.out.print("Digite a 3° coordenada do quadrado: ");
        ponto.setX(ler.nextInt());
        System.out.print("Digite a 4° coordenada do quadrado: ");
        ponto.setY(ler.nextInt());

        ponto2.setPonto2(ponto);

        ponto1.desenhar();
    }


}