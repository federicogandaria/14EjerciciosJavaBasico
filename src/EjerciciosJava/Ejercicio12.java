package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        {   Scanner teclado=new Scanner(System.in);
            int p1,p2,p3,p4,p5,ap1 = 0,ap2 = 0,ap3 = 0,ap4 = 0,ap5 = 0,clave,cant,recau = 0,pre = 0;
            System.out.print("precio 1: ");
            p1=teclado.nextInt();
            System.out.print("precio 2: ");
            p2=teclado.nextInt();
            System.out.print("precio 3: ");
            p3=teclado.nextInt();
            System.out.print("precio 4: ");
            p4=teclado.nextInt();
            System.out.print("precio 5: ");
            p5=teclado.nextInt();
            System.out.print("clave: ");
            clave=teclado.nextInt();
            System.out.print("cant: ");
            cant=teclado.nextInt();
            if(clave!=-1&cant!=-1){
                switch(clave){
                    case 1:pre=p1*cant;
                        ap1+=cant;                break;
                    case 2:pre=p2*cant;
                        ap2+=cant;                break;
                    case 3:pre=p3*cant;
                        ap3+=cant;                break;
                    case 4:pre=p4*cant;
                        ap4+=cant;                break;
                    case 5:pre=p5*cant;
                        ap5+=cant;                break;             }
                System.out.print("\nclave del boleto: "+clave+"\nprecio: "+pre+"\ncantidad: "+cant);
                recau=recau+pre;
                System.out.print("\n\nclave: ");
                clave=teclado.nextInt();
                System.out.print("cant: ");
                cant=teclado.nextInt();          }
            System.out.println("\nvoletos vendidos tipo 1: "+ap1+"\nvoletos vendidos tipo 2: "+ap2+
                    "\nvoletos vendidos tipo 3: "+ap3+"\nvoletos vendidos tipo 4: "+ap4+
                    "\nvoletos vendidos tipo 5: "+ap5+"\ntotal recaudado: "+recau);  } }
    }

