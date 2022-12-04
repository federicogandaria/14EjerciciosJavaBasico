//PROGRAMA QUE REALIZA LA TABLA DE MULTIPLICAR DE CUALQUIER DIGITO

package EjerciciosJava;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
            int tabla=0;
            tabla=Integer.parseInt(JOptionPane.showInputDialog("¿QUE TABLA DESEA REALIZAR? :"));
            for(int i=1;i<=10;i++)
            {
               int resultado=i*tabla;
                System.out.println(tabla+" x "+i+" = "+resultado);
            }   }  }

