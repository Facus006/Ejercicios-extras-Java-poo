/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ahorcado {

    private char letra;                 //letra que ingresa el usuario
    private int tamañopalabra;             //longitud de palabra
    private String palabraUsuario;          // palabra a adivinar
    private char palabra[];               // array con la palabra ingresada por el usuario
    private char palabra2[];               // array vacia
    private int cont;                         // contador para los intentos

    public Ahorcado() {
    }

    public String getPalabraUsuario() {
        return palabraUsuario;
    }

    public void setPalabraUsuario(String palabraUsuario) {
        this.palabraUsuario = palabraUsuario;
    }

    public int getTamañopalabra() {
        return tamañopalabra;
    }

    public void setTamañopalabra(int tamañopalabra) {
        this.tamañopalabra = tamañopalabra;
    }

    public char[] getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(char[] palabra2) {
        this.palabra2 = palabra2;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void ocultar() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void llenarvector() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra a adivinar");
        palabraUsuario = leer.next();
        palabraUsuario = palabraUsuario.toLowerCase();

        ocultar();
        tamañopalabra = palabraUsuario.length();

        palabra = new char[tamañopalabra];
        palabra2 = new char[tamañopalabra];
        for (int i = 0; i < tamañopalabra; i++) {
            palabra2[i] = '_';
        }

        palabra = palabraUsuario.toCharArray();

    }

    public void Juego() {
        Scanner leer = new Scanner(System.in);
        cont = 0;
        llenarvector();
        System.out.println("Ingrese una letra");
        System.out.println(Arrays.toString(palabra2));

        do {
            int cont2 = 99;
            letra = leer.next().charAt(0);
            letra= Character.toLowerCase(letra);
            
            for (int i = 0; i < tamañopalabra; i++) {
                if (Character.toLowerCase(letra) == palabra[i]) {
                    cont2 = 50;
                    palabra2[i] = letra;
                }
            }

            if (cont2 == 50) {
                System.out.println("CORRECTO la letra " + letra + " se encuentra");
                System.out.println("Le quedan " + (10 - cont) + " intentos");
            } else {
                cont++;
                System.out.println("INCORRECTO la letra " + letra + " no se encuentra");
                System.out.println("Le quedan " + (10 - cont) + " intentos");
            }

            System.out.println(Arrays.toString(palabra2));

            if (cont == 10) {
                System.out.println("TE QUEDASTE SIN INTENTOS");
                cont = 11;
            }
            if (Arrays.equals(palabra2, palabra)) {
                System.out.println("FELICIDADES ADIVINASTE LA PALABRA");

                cont = 11;
            }

        } while (cont != 11);

    }

}
