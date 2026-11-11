package Bloque2.tema06;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Dime tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <12) {
            System.out.print(" Eres un niño ");
            
        }
        else if (edad >=12 && edad <=17 ) {
            System.out.print(" Eres un adolescente");

        }
        else if (edad >= 18 && edad <=64 ) {
            System.out.println(" Eres un adulto ");

        }
        else
            System.out.println(" Eres un anciano ");
    sc.close();}
    
}
