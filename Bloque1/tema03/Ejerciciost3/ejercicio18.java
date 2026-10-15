package Bloque1.tema03.Ejerciciost3;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Ingresa los minutos ");
        int numero = sc.nextInt();
        sc.nextLine();

       final int minuto = 60;

        int cambio = numero * minuto;
        System.out.println( numero + " minuto/s son: " + cambio + " segundos ");

        sc.close();
    }
    
}
