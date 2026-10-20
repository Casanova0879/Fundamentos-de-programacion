package Bloque1.tema04.cp.ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu letra: ");
        char letra = sc.next().charAt(0);

        int codigo = (int) letra;
        char letraSiguiente = (char) (codigo +1);

        System.out.println("Codigo: " + codigo);
        System.out.println("Siguiente letra " + letraSiguiente);

        sc.close();
    }
    
}
