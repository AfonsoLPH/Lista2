import java.util.Scanner;
    public class Divisao {
        public static void main(String[] args) {
            System.out.println("Ta pode continuar");
            Scanner in = new Scanner(System.in);
            
            int numerador,divisor,divisao;
           
            System.out.println("digite os dois valores");
            numerador = in.nextInt(); divisor = in.nextInt();
            
            divisao = numerador / divisor;

            System.out.println("o resultado é ..." + divisao);

            
        
        


        }
    }
    

