package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        //entrada de dados
        System.out.println("Informe as cordenadas do ponto 1");
        p1.x = entrada.nextInt();
        p1.y = entrada.nextInt();
        System.out.println();
        System.out.println("Informe as cordenadas do ponto 2");
        p2.x = entrada.nextInt();
        p2.y = entrada.nextInt();

        //impressão da distância entre os dois pontos
        System.out.println();
        System.out.println("Distância de p1 para p2: " + df.format(p1.calcularDistancia(p2)));
        System.out.println("Distância de p2 para p1: " + df.format(p2.calcularDistancia(p1)));

        //Impressão da distância de cada ponto até a origem
        System.out.println();
        System.out.println("Distância do p1 até a origem: " + df.format(p1.CalcularDistanciaOrigem()));
        System.out.println("Distância do p2 até a origem: " + df.format(p1.CalcularDistanciaOrigem()));

        //Impressão do ponto mais próximo da origem
        System.out.println();
        Ponto aux = p1.maisProximoDaOrigem(p1, p2);
        System.out.println(aux.formatarPonto());

    }
}
