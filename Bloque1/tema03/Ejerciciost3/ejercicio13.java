package Bloque1.tema03.Ejerciciost3;
import java.util. Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

System.out.println( " Cantidad de euros");
double euros =  sc.nextDouble();


final double cambio = 1.15;


double dolares = euros * cambio;
System.out.println(euros + " Son " + dolares + "dolares");
sc.close();

    }
    
}
