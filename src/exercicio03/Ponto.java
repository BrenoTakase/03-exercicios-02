package exercicio03;

public class Ponto {

    //Atributos
    int x;
    int y;

    //Metodo para calcular e retornar a distância
    public double calcularDistancia(Ponto p){
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2)+Math.pow(y - p.y, 2));
        return distancia;
    }

    public double CalcularDistanciaOrigem(){
        double distanciaOrigem;
        distanciaOrigem = Math.sqrt(Math.pow(x - 0, 2)+Math.pow(y - 0, 2));
        return distanciaOrigem;
    }

    //Também pode fazer isso chamando o primeiro método novamente, assim não se repete o código
    //se o metodo fosse maior, não precisaria copiar tudo

    // public double CalcularDistanciaOrigem(){
    //     double distancia;
    //     Ponto origem = new Ponto();
    //     origem.x = 0;
    //     origem.y = 0;
    //     distancia = calcularDistancia(origem);
    //     return distanciaOrigem;
    //  }

    //método para retonar os dados do ponto
    public String formatarPonto(){
        return "(" + x + "," + y + ")";
    }

    //método para retornar o ponto mais próximo da origem
    public Ponto maisProximoDaOrigem(Ponto p1, Ponto p2){
        double dp1 = p1.CalcularDistanciaOrigem();
        double dp2 = p2.CalcularDistanciaOrigem();

        if (dp1 < dp2){
            return p1;
        }
        return p2;
    }
}
