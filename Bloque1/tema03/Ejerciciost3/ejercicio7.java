package Bloque1.tema03.Ejerciciost3;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

         System.out.print( " Introduce las horas trabajadas");
         int horas = sc.nextInt();

         System.out.print(" Introduce el precio por hora ");
         int phora = sc.nextInt();

    double salario = horas * phora;

    System.out.print(" El salario semanal es: " + salario +  " euros ");
    sc.close();
    }
    
}
