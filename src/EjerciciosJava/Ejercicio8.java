//Calcule el aumento de sueldo para un grupo de empleados de una empresa
//        teniendo en cuenta el siguiente criterio:
//        Si el sueldo es inferior a $1,000.00: Aumento 15%
//        Si el sueldo es mayor o igual a $1,000.00 : Aumento 12%
//        El programa debe hacer lo siguiente:
//        - Guardar los nuevos sueldos en el arreglo
//        - Calcular la nómina
//        -Imprimir los sueldos desde el arreglo

package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        float [] nsue;
        nsue= new float[20];
        int i,n;
        float sue=0,total=0;
        System.out.print("Numero de empleados: ");
        n=teclado.nextInt();
        for(i=1;i<=n;++i)
        {         System.out.print("Ingrese sueldo del trabajador nº "+i+": ");
            sue=teclado.nextFloat();
            if(sue<1000)
                nsue[i]=  (float) (sue * 1.15);
            if(sue>=1000)
                nsue[i]= (float) (sue * 1.12);
            total=total+nsue[i];     }
        System.out.println("\nLa nomina es: "+total+"\n");
        for(i=1;i<=n;++i)
            System.out.println("El sueldo final del trabajador nº "+i+" es: "+nsue[i]);
    } }


