package Bloque1.tema05.Ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad>=18){
            System.out.print("Puedes entrar ");

        }else{
        System.out.print(" No puedes entrar");
        sc.close();
    }
}
    
}
