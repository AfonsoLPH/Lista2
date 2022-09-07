import java.util.Scanner;
    public class Exercicio01 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Digite o valor em metros para conversao.");

            float ValorA, ValorB;

            
            ValorA = in.nextFloat();

            ValorB = ValorA * 100;


            System.out.println("o valor em cm é..." + ValorB);

        }
    }
    