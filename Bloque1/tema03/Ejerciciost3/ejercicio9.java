package Bloque1.tema03.Ejerciciost3;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print(" Introduce la cantidad de euros ");
        double pesetas = sc.nextDouble();

        final double cambio = 166.386;

        double euros = pesetas / cambio;
        System.out.println(" Son " + euros + " Euros ");
        sc.close();
    }
    
}
