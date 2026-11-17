package Bloque2.tema07;

import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" a)Café b)Te c)Zumo");
        char opcion = sc.next().charAt(0);

        double precio = 0;
        System.out.println("Dime la cantidad");
        int cantidad = sc.nextInt();

        switch (opcion) {
            case 'a':
                precio = 1.2;
                System.out.println("Has elegido café");
                break;
            case 'b':
                precio = 1;
                System.out.println("Haz elegido Te");
                break;
            case 'c':
                precio = 2;
                System.out.println("Has elegido zumo");
                break;
        
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        System.out.println("El precio es " + (precio*cantidad));
        sc.close();
    }
    
}
