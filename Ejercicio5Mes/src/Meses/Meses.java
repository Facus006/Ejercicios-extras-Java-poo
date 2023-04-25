/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Meses;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Meses {
    private String [] meses = new String [13];
    private String  mes;
    private int mesRamdom=(int)(Math.random()*10+1);

    public Meses() {
    }

    public int getMesRamdom() {
        return mesRamdom;
    }

    public void setMesRamdom(int mesRamdom) {
        this.mesRamdom = mesRamdom;
    }

    
    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public void llenarMes(){
        meses[0]="null";
        meses[1]="enero";
        meses[2]="febrero";
        meses[3]="marzo";
        meses[4]="abril";
        meses[5]="mayo";
        meses[6]="junio";
        meses[7]="julio";
        meses[8]="agosto";
        meses[9]="septiembre";
        meses[10]="octubre";
        meses[11]="noviembre";
        meses[12]="diciembre";
    }
   
    public void juego(){
        llenarMes();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(mesRamdom);
        System.out.println("Adivine el mes que eligio la computadora");

        do {

            mes = leer.next();
            if (!meses[mesRamdom].equals(mes.toLowerCase())) {
                System.out.println("INCORRECTO");
                System.out.println("Probemos otra vez");
            }

        } while (!meses[mesRamdom].equals(mes.toLowerCase()));

        if (meses[mesRamdom].equals(mes.toLowerCase())) {
            System.out.println("CORRECTO");

        }


    }
}
