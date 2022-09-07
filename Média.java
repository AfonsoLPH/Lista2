import java.util.Scanner;

public class Média {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
  // TIPO float --- Numero real (8 casas decimais de precisão)
        float av1, av2, av3, trab;
        float media;

        System.out.println("informe suas notas..");
        av1 = in.nextFloat();
        av2 = in.nextFloat();
        av3 = in.nextFloat();

        media = (av1 + av2 + av3)/3;

        System.out.println("sua média é.."+ media);

        
    }
}