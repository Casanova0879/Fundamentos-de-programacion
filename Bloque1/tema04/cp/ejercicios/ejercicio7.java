package Bloque1.tema04.cp.ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        
    }

    Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Has aprobado el teórico? (true/false): ");
        boolean aprobadoTeorico = sc.nextBoolean();

        boolean puedeSacarseCarnet = edad >= 18 && aprobadoTeorico;

        System.out.println("¿Puede sacarse el carnet? " + puedeSacarseCarnet);

        sc.close()

}
