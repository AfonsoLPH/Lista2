import java.util.Scanner;
public class Aulaex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int Horainicio, minutoinicio, horafinal, minutofinal, Tempototal, Minutototal;


        System.out.println("Que horas começou a partida?");

        Horainicio = in.nextInt(); minutoinicio = in.nextInt();
        

        System.out.println("Que horas terminou a partida?");

        horafinal = in.nextInt(); minutofinal = in.nextInt();


        Tempototal = Horainicio - horafinal;
        Minutototal = minutoinicio - minutofinal;

        System.out.println(" O tempo decorrido total foi de " + Tempototal + Minutototal);
    }
}