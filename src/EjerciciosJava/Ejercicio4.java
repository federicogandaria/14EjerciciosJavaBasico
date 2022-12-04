//Realiza el programa en JAVA tal que dado como dato el sueldo de un trabajador,
//        le aplique un aumento del 15% si su sueldo es inferior a $1000 y 12% en caso contrario.
//        Imprima el nuevo sueldo del trabajador.
//        Dato: SUE (variable de tipo real que representa el sueldo del trabajador)

package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        float sue,nsue = 0;
        System.out.print("ingrese sueldo: ");
        sue=teclado.nextFloat();
        if(sue!=1000)
        {
            if(sue<1000)
                nsue= (float) (sue * 1.15);
            if(sue>1000)
                nsue= (float) (sue * 1.12);
            System.out.println("el sueldo final es: "+nsue);
        }
        if(sue==1000)
            System.out.println("el sueldo final es: "+sue);
    }


}

