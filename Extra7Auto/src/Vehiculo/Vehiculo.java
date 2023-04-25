/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Vehiculo {
    
    public String Dueño;
    public String Vencimiento;
    public String Color;
    public String Marca;
    public String Modelo;
    public int Kilometraje=7500;

    public Vehiculo() {
    }

    public Vehiculo(String Dueño, String Vencimiento, String Color, String Marca, String Modelo, int Kilometraje) {
        this.Dueño = Dueño;
        this.Vencimiento = Vencimiento;
        this.Color = Color;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Kilometraje = Kilometraje;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(String Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
    
    public void Cargar(){
       
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese Nombre completo del titular del vehiculo");
        Dueño= leer.nextLine();
        System.out.println("Ingrese la fecha de vencimiento de su carnet");
        Vencimiento=leer.nextLine();
        System.out.println("Ingrese el color de la unidad");
        Color = leer.nextLine();
        System.out.println("Ingrese la Marca y Modelo");
        Marca= leer.nextLine();
        Modelo= leer.nextLine();
        System.out.println("Ingrese el Kilometraje que tiene actualmente el Vehiculo");
        Kilometraje = leer.nextInt();
        
        
        
    }
  
    public void CambiodeTitularidad(){
         Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Para hacer el cambio de titularidad debe ingresar "
                + "el nombre completo de la nueva persona");
        Dueño= leer.nextLine();
        
    }

    
    public void Trayecto(){
     Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los Km recorridos");
        Kilometraje+=leer.nextInt();
        
    }
    
    public void Service() {
        
        if ( Kilometraje==10000 || Kilometraje==20000 || Kilometraje==30000 
                || Kilometraje==40000 || Kilometraje==50000 || Kilometraje==60000 ) {
            System.out.println(" ");
            System.out.println("ES MOMENTO DE HACER EL SERVICE");
            System.out.println(" ");
        }
          
         
        if (Kilometraje>=70000 ) {
            
           System.out.println("Lo siento pero la garantia solo cubre hasta"
                   + "los 60.000Km o 5 años de antiguedad.");
            System.out.println("Tenga en cuenta que los services se hacen "
                    + "cada 10.000Km.");
        }
        
    }
    
   public void Escribir(){
       System.out.println("      ");
       System.out.println("EL titular es: "+Dueño);
       System.out.println("El carnet vence el "+Vencimiento);
       System.out.println("El color del auto es: "+Color);
       System.out.println("La marca del auto es: "+Marca);
       System.out.println("El modelo es: "+Modelo);
       System.out.println("El Kilometraje Acual es: "+Kilometraje);
       System.out.println("          ");
   }
    
    
}
