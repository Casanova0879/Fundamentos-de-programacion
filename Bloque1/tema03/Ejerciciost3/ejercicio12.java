package Bloque1.tema03.Ejerciciost3;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.print(" Pon aqui el precio del producto ");
        double precio1 = sc.nextDouble();

        final double descuento = 0.2;

        double finalprecio = precio1 * ( 1- descuento);
        System.out.print(" El precio final es " + finalprecio);
        sc.close();
        


    }
    
}
