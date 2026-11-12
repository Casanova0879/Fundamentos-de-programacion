package Bloque2.tema06;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce tu sueldo anual: ");
        double sueldo = sc.nextDouble();

    double retención = 0;
    if (sueldo <=12000){
        System.out.println("Ganas " +sueldo + " tu porcentaje de retención es del 0%");
    }
        else if (sueldo >12000 && sueldo <=25000){
            System.out.println("Ganas " + sueldo + "  tu portentaje de retención es del 10% ");
            
            
        }
        else if (sueldo > 250000 && sueldo <40000){4
            System.out.println("Ganas " + sueldo + " tu portentaje de reteción es del 20% ");
        }
        
        else{
        System.out.println(" Ganas " +sueldo + " tu porcentaje de retención es del 30% ");
        }
    }
        
    


    }

