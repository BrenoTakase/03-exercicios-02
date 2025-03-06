package exercico04;

public class Funcionario {

    //Variaveis

    String nome;
    String cargo;
    double salario;

    //codificar construtor para inicializar os atributos com valores recebidos por parâmetro
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }


    //Metodo para aplicar aumento no salário
    public void AumentoSalario(double porcentagem){
        salario = salario + (salario * (porcentagem /100));
    }

    //Metodo para aplicar aumento no salário se o cargo for igual
    //o This atua como um objeto da classe funcionario, sempre se remetendo no que está dentro dele
    public double AumentoSalario(String cargo, double porcentagem){
        if (this.cargo.equalsIgnoreCase(cargo)){
            salario = salario + (salario * (porcentagem /100));
        }
        return salario;
    }

    //Metodo de promoção
    public void promover(String cargo){
        this.cargo = cargo;
    }


}
