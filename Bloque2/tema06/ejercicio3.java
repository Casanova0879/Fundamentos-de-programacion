package Bloque2.tema06;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Introduce tu sueldo anual: ");
        double sueldo = sc.nextDouble();

    double retención = 0;
    if (sueldo <=12000){
        retención= 0;
    }

    else if (sueldo <25000) {
        retención= 10;
        
    }

    else if (sueldo <40000) {
        retención= 20;
        
    }
    else
        retención= 30;
    System.out.println(" Tu retención es del: "+ retención +" %");
        
        }
        
    }
        
    


    

