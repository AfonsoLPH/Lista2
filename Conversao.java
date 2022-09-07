import java.util.Scanner;
    public class Conversao {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            float celsius, fahrenheit;
            System.out.println("informe o valor de Fahrenheit");

            fahrenheit = in.nextFloat();
            celsius = (fahrenheit -32/9) *5;

            System.out.printls("O resultado em Celsius é: %.1f\n", celsius);
        }

}
