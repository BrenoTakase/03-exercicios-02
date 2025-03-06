package exercico04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //variaveis
        Funcionario funcionario;
        String nome;
        String cargo;
        double salario, porcentagem;

        //Entrada de dados
        System.out.print("Nome do funcionário: ");
        nome = entrada.next();
        System.out.print("Cargo do funcionário: ");
        cargo = entrada.next();
        System.out.print("Salário do funcionário: ");
        salario = entrada.nextInt();

        funcionario = new Funcionario(nome, cargo, salario);

        //aumentar o salario de acordo com uma porcentagem
        System.out.print("Digite a porcentagem de aumento (0 - 100): ");
        porcentagem = entrada.nextDouble();
        funcionario.AumentoSalario(porcentagem);
        System.out.println("Novo salário R$ " + funcionario.salario);

        //aumentar o salario de acordo com o cargo e uma porcentagem
        System.out.println("");
        System.out.print("Digite a porcentagem de aumento (0 - 100): ");
        porcentagem = entrada.nextDouble();
        System.out.print("Digite o cargo para receber o aumento: ");
        cargo = entrada.next();
        funcionario.AumentoSalario(cargo, porcentagem);
        System.out.println("Novo salário R$ " + funcionario.salario);

    }


}
