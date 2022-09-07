import java.util.Scanner;
public class Exercício07 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println(" Bem vindo a calculadora do RHfajuto \n Por favor insira o valor de seu salario por hora");
        
        float salariophora, salario, IRPF, horas;
         

        salariophora = in.nextFloat();

        System.out.println("insira as horas trabalhadas no mẽs");

        horas = in.nextFloat();

        IRPF = in.nextFloat();

        IRPF = (IRPF/100) - 1;

        salario = (salariophora * horas) * IRPF;

        System.out.println("seu salario é :" + salario +"reais, com desconto de " + IRPF + "%");




    }
    
}
