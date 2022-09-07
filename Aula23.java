import java.util.Scanner;
    public class Aula23 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
            int minima, maxima, atual, media;
            System.out.println("Informe a quantidade atual, minima e maxima");

            atual = in.nextInt();
            minima = in.nextInt();
            maxima = in.nextInt();

            media = (minima + maxima)/2;

            if(atual>=media) {
                System.out.println("Não efetuar compra");
                
            } else {
                System.out.println("Devem ser compradas novas unidade do produto em questao");
            }

            
        }

}
