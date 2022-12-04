//Dado como datos las calificaciones de 20 alumnos de la materia de fundamentos de programación,
// realiza un programa en JAVA que obtenga lo siguiente:
//        -Promedio general
//        -Imprima las calificaciones en orden inverso

package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int [] prome;
        prome= new int[20];

        int j=0,i;
        float total=0;
        for(i=0;i<20;++i)
        {
            System.out.print("ingrese calificacion del alumno "+i+": ");
            prome[i]=teclado.nextInt();
            total=total+prome[i];
        }
        System.out.println("total es: "+total);
        total= total/20;
        System.out.println("promedio general es: "+total);
        for(i=19;i>=0;--i)
            System.out.println("alumno "+i+" su promedio es: "+prome[i]);   }   }


