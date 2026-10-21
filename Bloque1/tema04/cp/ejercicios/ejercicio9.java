package Bloque1.tema04.cp.ejercicios;

public class ejercicio9 {
    public static void main(String[] args) {
         boolean[][] valores = {
            {true, true},
            {true, false},
            {false, true},
            {false, false}
        

        for (boolean[] fila : valores) {
            boolean a = fila[0];
            boolean b = fila[1];

            System.out.println("a = " + a + ", b = " + b);
            System.out.println("a && b = " + (a && b));
            System.out.println("a || b = " + (a || b));
            System.out.println("!a = " + (!a));
            System.out.println();
    }
    
}
