package Bloque1.tema04.cp.ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        String texto1 = sc.nextLine();

        System.out.print("Introduce el segundo número: ");
        String texto2 = sc.nextLine();

        int numero1 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(texto2);

        int suma = numero1 + numero2;

        System.out.println("Suma convertida: " + suma);
        System.out.println("Suma como texto: " + texto1 + texto2);

        sc.close();
    }
    
}
