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
public class Servicio {
   Scanner leer = new Scanner (System.in);

    public Servicio() {
    }
   
   
    public void menu(){
        Vehiculo Auto1 = new Vehiculo(); 
        int opc;
        System.out.println("Seleccione una opcion");
        do {
            System.out.println("1-INGRESAR LOS DATOS DE SU VEHICULO");
            System.out.println("2-MODIFICAR LA TITULARIDAD DEL VEHICULO");
            System.out.println("3-INDICAR UN TRAYECTO RECORRIDO");
            System.out.println("4-CONSULTAR SI ES NECESARIO EL SERVICE");
            System.out.println("5-SALIR");
            System.out.println("9- VER ESTADO");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                        Auto1.Cargar();
                    break;
                case 2:
                    Auto1.CambiodeTitularidad();
                    break;
                case 3:
                    Auto1.Trayecto();
                    break;
                case 4:
                     Auto1.Service();
                    break;
                case 5:
                    System.out.println("HASTA LUEGO");
                        opc=6;
                    break;
                case 9:
                    Auto1.Escribir();
                    break;
                default: 
                    System.out.println("INGRESE UNA OPCION VALIDA");
            }
        } while (opc != 6);
    }
    
    
}
