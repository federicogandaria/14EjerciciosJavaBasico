//Escribe un programa en JAVA que obtenga la suma e imprima los términos de la siguiente serie:
//
//        2, 5, 7, 10, 12, 15, 17, . . ., 1 800

package EjerciciosJava;

public class Ejercicio2 {
    public static void main(String[] args) {



        boolean condicion = true;
        for(int i=0;i<1800;i=i)
        {
            //Empezamos en true, con valor i=0 porque inicie el contador condicion en true asi que sumamos +2 y
            //cambiamos a false para sumar +3
            if(condicion)
            {
                i=i+2;
                condicion= false;
            }
            else
            {
                i=i+3;
                condicion = true;
            }
            System.out.println(i);
        }
    }

    }

