import java.util.Scanner;
public class Exercício06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("informe o ano, mes e dia de seu nascimento.");

        int ano, mes, dia, totaldias;

        ano = in.nextInt();
        mes = in.nextInt();
        dia = in.nextInt();
        
        ano = ano * 365;
        mes = mes * 30;
        totaldias = ano + mes + dia;

        System.out.println(" o total de dias vivido até hoje é de :" + totaldias + "dias");

    }
}
