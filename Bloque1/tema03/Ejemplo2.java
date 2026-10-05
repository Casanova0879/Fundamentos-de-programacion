package Bloque1.tema03;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println( "Nombre:" );
        String nombre = sc.nextLine();
        
        System.out.println( "Edad:" );
        int edad = sc.nextInt(); //nextInt se usa para los numeros enteros y el Scanner para imprimirlo.
        sc.nextLine();

System.out.println(" Dime tu inicial ");
char inicial = sc.nextLine().charAt(0);

        System.out.println("Hola " + nombre + " tiene " + edad + " años");
        System.out.println(" Tu inicial es: " + inicial);
    }
}
  