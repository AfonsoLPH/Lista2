import java.util.Scanner;
    public class Aulaex6L3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int golsA, golsB;

            System.out.println(" insira os gols de cada time");
            golsA = in.nextInt();
            golsB = in.nextInt();

            if(golsA > golsB) {

                System.out.println("Time A venceu");
                
            }
            if( golsA < golsB) {
                System.out.println("Time B venceu");
                
            }
            if( golsA == golsB) {
                System.out.println(" Empate");
               
            }
     
        }
    
}
