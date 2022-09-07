import java.util.Scanner;
    public class Aulaex5L3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Informe os lados para saber se é um triangulo");

            int A, B, C;

            A = in.nextInt();
            B = in.nextInt();
            C = in.nextInt();

            if( ( C< A+B) && (A < B+C) && (B <C+A)) {
                System.out.println("Pois entao é um triangulo!!");
            } else {
                System.out.println("É quualquer coisa menos um triangulo!!");
            }


            
        }
    
}
