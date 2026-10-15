package Bloque1.tema03.Ejerciciost3;
import java.util.Scanner;;

public class ejercicio16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Dime tu edad: ");
        int edad = sc.nextInt();

        int salida = edad + 5;
        System.out.print( " En 5 años tendras " + salida);
        
    }
    
}
