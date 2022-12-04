//Programa para elevar un numero a n potencia usando while.

package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i=2,tot=0,num,ele;
        System.out.print("numero a elevar: ");
        num=teclado.nextInt();
        System.out.print("elevar a la: ");
        ele=teclado.nextInt();
        tot=   (int) Math.pow(num,ele);
        System.out.println("total= "+tot);


    }}


