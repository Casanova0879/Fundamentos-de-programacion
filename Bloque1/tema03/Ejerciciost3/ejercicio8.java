package Bloque1.tema03.Ejerciciost3;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print(" Introduce la cantidad de euros ");
         double euros = sc.nextDouble();

         final double cambio = 166.386;

         double pesetas = euros * cambio;
         System.out.println(euros + " euros son " + pesetas + (" pesetas "));
         sc.close();

    }
 
}
