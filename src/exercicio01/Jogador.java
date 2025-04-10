package exercicio01;

public class Jogador {

    //Variavel
    String nomeJogador;
    int pontuacao[] = new int[3];

    public int contarPontuacao(){
        int total=0;
        for (int i:pontuacao){
            total+=i;
        }
        return total;
    }

}
