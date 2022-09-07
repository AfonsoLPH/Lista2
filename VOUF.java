import java.util.Scanner;
public class VOUF {
    public static void main(String[] args ) {

        Scanner in = new Scanner(System.in);

        // <6 anos   paga 200
        // <18 anos paga 100
        //< 40 anos paga 150
        // <60 anos paga 200
        // >= 60 anos    400

        int idade, valor;

        System.out.println(" insira sua idade");
        idade = in.nextInt();

        if(idade < 6) {
            valor = 200;
        } else if (idade < 18){
            valor = 100;
        } else if(idade < 40) {
            valor =150;
        } else if(idade < 60) {
            valor = 200;
         } else {
            valor =400;
            }
            System.out.println("Voce pagará no plano ..." + valor);
        }
    }

