package Bloque1.tema03.Ejerciciost3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       System.out.println(" Introduce tu numero ");
       int numero1 = sc.nextInt();
       
       System.out.println(" Introduce el segundo numero ");
       int numero2 = sc.nextInt();
       int suma = numero2 + numero1;
 
       System.out.println("La suma es: " + suma);
       sc.close();
    }
}
