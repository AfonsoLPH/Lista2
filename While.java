import java.util.Scanner;
import java.util.Random;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de valores");

        int quantidade = in.nextInt();
        float valor, soma = 0, media;

        int contador = 0;

        while(contador < quantidade)  {
            System.out.println(" passei por aqui");
            contador++;
            valor = in.nextFloat();
            soma = soma + valor;

        }
        media = soma/quantidade;
        System.out.println("sua média é ... " + media);


    }

    
}
