//PROGRAMA QUE CALCULE EL MAYOR Y MENOR DE N NUMEROS

package EjerciciosJava;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        int cant,num,mayor=0,menor=0,i;
        cant=Integer.parseInt(JOptionPane.showInputDialog("ingrese repeticiones:"));
        for(i=1;i<=cant;i++)
        {
            num=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero:"));
            if(i==1){
                mayor=num;
                menor=num;
            }
            if(num<menor)
                menor=num;
            if(num>mayor)
                mayor=num;
        }
        System.out.println("mayor= "+mayor);
        System.out.println("menor= "+menor);
    }

}


