package Bloque2.tema07;

import java.util.Scanner;

public class actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color = sc.next();

        switch (color) {
            case "rojo":
                System.out.println("Para ");
                break;
            case "amarillo":
                System.out.println("Precaución");
                break;
            case "Verde":
                System.out.println("Pasa");
                break;

            default:
                System.out.println(" Color no válido");
                break;
        }

        
    }
    
}
