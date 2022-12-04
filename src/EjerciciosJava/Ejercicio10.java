
//Progama que indique el total a pagar en una farmacia si el total apagar es:
//
//        0 a 500 0% de descuento
//
//        501 a 1000 5%
//
//        1001 a 7000 11%
//
//        7001 a 15000 18%
//
//        150001 en adelante 25%

package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        float monto,total = 0;
        System.out.print("ingrese monto: ");
        monto=teclado.nextFloat();
        if(monto<501)
            total=monto;
        if(monto>499 & monto<1000)
            total= (float) (monto * 0.95);
        if(monto>999 & monto<7001)
            total=(float) (monto * 0.89);
        if(monto>7000 & monto<15001)
            total=(float)(monto * 0.82);
        if(monto>15000)
            total= (float) (monto * 0.75);
        System.out.println("el total a pagar es: "+total);
    }

}


