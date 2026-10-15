package Bloque1.tema03.Ejerciciost3;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print( " Edad ");
        int Edad = sc.nextInt();
        sc.nextLine();

        System.out.println(" Nombre ");
        String nombre = sc.nextLine();
        System.out.println(nombre + " tiene " + Edad + " años ");
        sc.close();


    }
    
}
