package Bloque2.tema07;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Elige un idioma: es, in fr");
        String idioma = sc.nextLine();

        switch (idioma) {
            case "es":
                System.out.println("Hola");
                break;
            case "en":
                System.out.println("Hello");
                break;
            case "fr":
                System.out.println("Bonjour");
            default:
                System.out.println("Opción no valida");
                break;
        }
        sc.close();
    }
    
}
