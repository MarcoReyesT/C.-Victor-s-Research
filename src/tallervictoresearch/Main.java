/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallervictoresearch;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        //System.out.println("Ingrese la cantidad de numeros pensados por Victor: ");
        long cantNumeros = in.nextLong();

        //System.out.println("Ingrese el numero pensado por el asistente: ");
        double resultado = in.nextDouble();

        long conjuntos = 0;
        //double[] sumas = new double[Integer.parseInt(""+cantNumeros)];
        ArrayList suma = new ArrayList();
        //System.out.println("Ingrese todos los numeros separados por 'Enter' : ");
    //    sumas[0] = in.nextInt();
    //    if (sumas[0] == resultado) {
      //      conjuntos++;
       // }
        for (int i = 0; i < cantNumeros; i++) {
            
            suma.add(i,in.nextDouble());
            if ( ((double) suma.get(i)) == resultado) {
                conjuntos++;
            }
            for (int j = 0; j < i; j++) {
                double nuevo =  (double) suma.get(j)+ (double) suma.get(i);
                
                if (nuevo==resultado) {
                    conjuntos++;
                }
                suma.set(j,nuevo);
            }
            //sumas[i - 1] += sumas[i];
            //if (sumas[i-1]==resultado) {
            //    conjuntos++;
            //}

        }
        System.out.println(conjuntos);

    }

}
