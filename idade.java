import java.util.Scanner;
public class idade {
    public static void main(String[] args) {
        
//incluir o Scanner como uma variavel de nome in        
//função: escanear a entrada padrão do sistema. (System.in)
   
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("Qual a sua idade?");
    // le o valor do proximo inteiro da entrada
    // e atribui na variavel idade

        idade = in.nextInt();
        int idadeDaqui10anos = idade + 10;
        System.out.println("Você terá..." + idadeDaqui10anos);

        System.out.println("Qual a idade da sua mãe");
        int idadeMae = in.nextInt();

        int idadeMaeQDNasci = idadeMae - idade;
        System.out.println("a idade de sua mãe é..." + idadeMaeQDNasci);
    }
}   