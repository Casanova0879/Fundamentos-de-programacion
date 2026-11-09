package Bloque1.tema05.Ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Dime la contraseña: ");
        String contraseña = sc.nextLine();

        if (contraseña.equals("java123")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        sc.close();

    }
    
}
