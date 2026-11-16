package Bloque2.tema06;

import java.util.Scanner;

public class ejercicio4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        
        System.out.println("¿Eres socio? s/n ");
        char socio = sc.next().charAt(0);

        System.out.println("¿Tines efectivo?  s/n ");
        char efectivo = sc.next().charAt(0);
        
        int descuento ;

        if (socio == 's') {
        if (efectivo == 's') 
            descuento = 7;

           else{
            descuento = 5;
           }
           } else{
    if (efectivo =='s') 
        descuento = 2;

    else{
        descuento =0;
    
}
 
           }
            System.out.println(" El descuento es " + descuento + "%");
        sc.close();
        }
       
        
    }
    
    

