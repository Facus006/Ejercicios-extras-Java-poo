/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFS;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Nif {
    private int dni;
    private String [] letras = new String [23];
    private int nif;
    
    public Nif() {
    }

    public int getNif() {
        return nif;
    }
    public void setNif(int nif) {
        this.nif = nif;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public void vectorLleno(){
        letras[0] = "T";
        letras[1] = "R";
        letras[2] = "W";
        letras[3] = "A";
        letras[4] = "G";
        letras[5] = "M";
        letras[6] = "Y";
        letras[7] = "F";
        letras[8] = "P";
        letras[9] = "`D";
        letras[10] = "X";
        letras[11] = "B";
        letras[12] = "N";
        letras[13] = "J";
        letras[14] = "Z";
        letras[15] = "S";
        letras[16] = "Q";
        letras[17] = "V";
        letras[18] = "H";
        letras[19] = "L";
        letras[20] = "C";
        letras[21] = "K";
        letras[22] = "E";

        
    }
    
  public void crearNif(){
      Scanner leer= new Scanner (System.in).useDelimiter("\n");
      System.out.println("Ingrese su dni");
      dni= leer.nextInt();
      nif= dni%23;
      
      
  }
    
  public void mostrarNif(){
      
      vectorLleno();
      crearNif();
      if (nif>0 && nif <22) {
          System.out.println(dni+"-"+letras[nif]);
      } else {
          System.out.println("ERROR INTRODUZCA UN DNI REAL");
      }
       
  }
    
    
}
