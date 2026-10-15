package Bloque1.tema03.Ejerciciost3;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double IVA = 0.21;

        System.out.println(" Introduce la base imponible ");
        double baseImponible = sc.nextDouble();

        double cantidadIVA = baseImponible * IVA;
        double totalfactura = baseImponible + cantidadIVA;

        System.out.print(" Resultado " + totalfactura);
        sc.close();

    }
    
}
