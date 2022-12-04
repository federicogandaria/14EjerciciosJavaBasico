//Programa que eleve un numero a n potencia usando for.

package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i=1,tot=0,num,ele;
        System.out.print("numero a elevar: ");
        num=teclado.nextInt();
        System.out.print("elevar a la: ");
        ele=teclado.nextInt();
        tot=num;
        for(i=2;i<=ele;i++)
        {
            tot*=num;

        }
        System.out.println("total= "+tot);

    }
}


