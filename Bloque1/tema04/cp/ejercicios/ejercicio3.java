package Bloque1.tema04.cp.ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);

        System.out.print(" Introduce el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.print(" Introduce segundo numero: ");
        int numero2 = sc.nextInt();

        double media = numero1 + numero2;
        System.out.println(" La media de sus numeros es: "
    +media/2);
        sc.close();
    }
    
}
