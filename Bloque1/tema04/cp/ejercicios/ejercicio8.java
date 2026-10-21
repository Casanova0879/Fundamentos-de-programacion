package Bloque1.tema04.cp.ejercicios;

public class ejercicio8 {
    public static void main(String[] args) {
        
        int edad = 70;

        boolean tieneDescuento = edad < 12 || edad > 65;

        System.out.println("¿Tiene descuento? " + tieneDescuento);
        System.out.println("!tieneDescuento: " + !tieneDescuento);
    }
    
}
