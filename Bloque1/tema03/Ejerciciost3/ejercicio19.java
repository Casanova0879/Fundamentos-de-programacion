package Bloque1.tema03.Ejerciciost3;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print( " Ingresa la primera nota ");
        double nota1 = sc.nextDouble();

        System.out.print( " Inrgesa la segunda nota ");
        double nota2 = sc.nextDouble();

        System.out.print( " Inrgesa la tercera nota ");
        double nota3 = sc.nextDouble();

        double media = nota1 + nota2 + nota3;

        System.out.print("Tu nota media es:" + media/3);
        sc.close();



    }
    
}
