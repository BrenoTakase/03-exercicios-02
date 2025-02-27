package exercicio01;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogador jogador = new Jogador();

        //entrada de dados
        System.out.println("--- Bem vindo ao FutScore ---");
        System.out.print("Escolha o nome do seu Jogador:");
        jogador.nomeJogador = entrada.nextLine();

        for (int i=0; i<jogador.pontuacao.length; i++){
            System.out.print("Score "+ (i+1)+ ": ");
            jogador.pontuacao[i] = entrada.nextInt();
        }

        //Saida de Dados
        System.out.println();
        System.out.println("Nome: " + jogador.nomeJogador);
        System.out.println("Score Total: "+ jogador.contarPontuacao());




    }

}
