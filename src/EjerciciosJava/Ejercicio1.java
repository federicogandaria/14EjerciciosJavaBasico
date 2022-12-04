//Escribe un programa en JAVA tal que dado como datos 270 números enteros (introducidos por teclado),
//        obtenga la suma de los números impares y el promedio de los números pares.
//        Datos: NUM1, NUM2, . . ., NUM270
//        Donde: NUMi es una variable de tipo entero que representa el número entero i que se ingresa (1 ≤ i ≤ 270).

package EjerciciosJava;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int contPar = 0;
        int contImpar =0;
        int sumaPar = 0;
        int sumaImpar = 0;
        int promedio = 0;

        for (int i = 0; i < 10; i++){
            int numI = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

            if (numI % 2 == 0){
               sumaPar = sumaPar+numI;
                promedio = (sumaPar + numI)/2;
                contPar++;
            }else {
                sumaImpar = sumaImpar+numI;
                contImpar++;
            }
        }
        System.out.println("La cantidad de números pares es: "+ contPar);
        System.out.println("La cantidad de números impares es: "+ contImpar);
        System.out.println("La suma de números pares es de "+sumaPar);
        System.out.println("La suma de números impares es de "+sumaImpar);
        System.out.println("El promedio de números pares es de: "+promedio);

} }
