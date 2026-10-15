package Bloque1.tema03.Ejerciciost3;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);

    System.out.print(" Dime la base de tu rectangulo");
    int base = sc.nextInt();

    System.out.println(" Dime la altura de tu rectangulo ");
    int altura = sc.nextInt();

    int area = base*altura;

    System.out.println(" El area es: " + area/2);
    sc.close();
    }
    
}
