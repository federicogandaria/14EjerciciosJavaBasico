//Programa que pida el sueldo d N trabajadores e imprima el que tiene mayor sueldo

package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int n,manum=0,numemp,i;
        float sue,masue=0;
        System.out.print("numero de empleados: ");
        n=teclado.nextInt();
        for(i=1;i<=n;++i)
        {
            System.out.print("numero de empleado: ");
            numemp=teclado.nextInt();
            System.out.print("sueldo del empleado: ");
            sue=teclado.nextInt();
            if(sue>masue)
            {
                masue=sue;
                manum=numemp;
            }
        }
        System.out.println("\n el empleado con mayor sueldo fue: \n numero: "+manum+"\nsueldo: "+masue);
    }
}



