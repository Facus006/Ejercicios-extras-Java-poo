/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1cancion;

import canciones.autor;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio1Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        autor Cancion1 = new autor();
        System.out.println("Ingrese el titulo de la cancion: ");
        Cancion1.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor");
        Cancion1.setAutor(leer.next());
        System.out.println(Cancion1);
    }
    
}
