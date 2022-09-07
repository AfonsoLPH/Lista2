import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;
        String bebida;

     // SE, " valor logico verdadeiro" executa x
        // if (condição ou valor) {

       //}
              

           System.out.println(" oque voce quer comprar? (Refri ou cerveja?");
            bebida = in.next();

            if(bebida.equals("cerveja")) {

            System.out.println("informe sua idade");
                idade = in.nextInt();

                if ( idade >= 18) {
                    System.out.println("cerveja servida!");
                } else{ 
                    System.out.println("lamento");
                }
                
            }

            if (bebida.equals("refri")) {
                System.out.println("coca ou guarana?");

            }

            if(!bebida.equals("refri") && !bebida.equals("cerveja")) {
            System.out.println(" Escolha uma das opçoes");

          }
        }

    }














































    }
}

