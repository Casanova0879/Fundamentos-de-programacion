package Bloque1.tema03.Ejerciciost3;
import java.util. Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double pi = 3.1416;

        System.out.print( " radio ");
        double radio = sc.nextDouble();
        double area = pi*radio*radio;

        System.out.print(" Area: " + area);
        sc.close();


    }
    
}
