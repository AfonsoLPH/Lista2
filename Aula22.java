import java.util.Scanner;
public class Aula22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bem vindo ao BB");

        String numeroconta;
        Float saldo , debito , credito, saldoatual;

        System.out.println(" Para entrar em sua conta, insira o numero da mesma.");

        numeroconta = in.next();

        System.out.println("Informe o valor de Saldo");
        saldo = in.nextFloat();

        System.out.println(" insira os valores de Debito e Credito para saber seu saldo total.");
        debito = in.nextFloat(); credito = in.nextFloat();

        saldoatual = saldo - debito + credito;

        System.out.println("Cliente conta numero:" + numeroconta);

        if(saldoatual >= 0) {
            System.out.println("saldo positivo");
        } else{
            System.out.println("saldo negativo");
        }
                   
        }
        
    }

