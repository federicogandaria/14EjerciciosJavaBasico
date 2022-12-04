//Realiza el programa en JAVA tal que dado como datos la matrícula y 5 calificaciones de un alumno; imprima la matrícula,
//        el promedio y la palabra “aprobado” si el alumno tiene un promedio mayor o igual que 6,
//        y la palabra “no aprobado” en caso contrario.
//
//        Datos: MAT, CAL1, CAL2, CAL3, CAL4, CAL5
//
//        Donde: MAT es una variable entera que representa la matrícula del alumno.
//
//        CAL1, CAL2, CAL3, CAL4 y CAL5 son variables de tipo real que representan las 5 calificaciones del alumno


package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int mat =0;
        int pro=0;
        int cal;

        System.out.print("ingrese matricula: ");
        mat=teclado.nextInt();
        for(int i=1;i<=5;++i)
        {
            System.out.print("ingrese calificación "+i+": ");
            cal=teclado.nextInt();
            pro+=cal;
        }
        pro=pro/5;

        if(pro>=6)
            System.out.println("\nmatricula= "+mat+"\npromedio= "+pro+"\n Aprobado");
        else
            System.out.println("\n Número de matricula = "+mat+"\n Número de promedio= "+pro+"\n No aprobado");
    }

}

