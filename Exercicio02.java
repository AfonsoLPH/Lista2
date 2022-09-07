import java.util.Scanner;
    public class Exercicio02 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Insira o valor de base e altura");

            float base, altura, perimetro, area;
            

            base = in.nextFloat();
            altura = in.nextFloat();

            area = base * altura;
            perimetro = base + altura;

            System.out.println(" o valor de sua area em m² é " + area+" e seu perimetro é ..." + perimetro);
                       System.out.printf("%.2f %.2f\n",area,perimetro);
            
            

        }

    }