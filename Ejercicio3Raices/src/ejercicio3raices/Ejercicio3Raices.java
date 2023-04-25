/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3raices;

import calculos.Calculos;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio3Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        Calculos r1 = new Calculos();
        System.out.println("Ingrese el valor de A");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese el valor de B");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese el valor de C");
        r1.setC(leer.nextInt());
        r1.calcular();
        
        // TODO code application logic here
    }
    
}
