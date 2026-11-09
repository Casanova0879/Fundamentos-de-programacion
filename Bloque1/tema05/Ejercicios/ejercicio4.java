package Bloque1.tema05.Ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Compra con decimales ");
        double numero = sc.nextDouble();
        final double descuento = 0.10;

        if (numero > 100) {
            double total = numero - (numero * descuento);
            System.out.println("Total a pagar: " + total);
        } else {
            System.out.println("Total a pagar: " + numero);
        }
        sc.close();
    }
}

            
        

