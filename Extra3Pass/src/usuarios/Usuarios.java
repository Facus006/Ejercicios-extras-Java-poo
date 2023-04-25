/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;


import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Usuarios {
    private String pass;
    private String nombre;
    private int dni;

    public Usuarios() {
        
    }

    public Usuarios(String pass, String nombre, int dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void Crearpass(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nueva contraseña");
        String pass2 = leer.nextLine();

        while (pass2.length() > 10) {
            System.out.println("Incorrecto la contraseña tiene que ser 10 caracteres"
                    + "o menos");
            System.out.println("Ingrese una contraseña nueva");
            pass2 = leer.nextLine();

        }
        if (pass2.length() < 10) {
            System.out.println("Contraseña aceptada");
            pass = pass2;
        }
        
    }
   
    public void Analizarpass(){
        String z = "z";
        String a = "a";
        int contZ = 0;
        int contA = 0;
        char[] buscarZ = pass.toLowerCase().toCharArray(); 
        for (int i = 0; i < pass.length(); i++) {
            String letra = String.valueOf(buscarZ[i]);
            if (z.equalsIgnoreCase(letra)) {
                contZ++;
            }
        }
        
        char [] buscarA = pass.toLowerCase().toCharArray();
        for (int i = 0; i < pass.length(); i++) {
            String letra = String.valueOf(buscarA[i]);
            if (a.equalsIgnoreCase(letra)) {
                contA++;
            }
        }
        
        if (contZ==1 && contA==0 || contZ>=1 && contA==0) {
            System.out.println("Su contraseña es Nivel Medio");
        }
        if (contZ>=1 && contA>=2 ) {
            System.out.println("Su contraseña es Nivel Alto");
        }
        if (contZ==0 && contA==0) {
            System.out.println("Su contraseña es Nivel Bajo");
        }
         
   
    
    }  
    
    public void Cambiarnombre() {
        Scanner leer= new Scanner (System.in);
        System.out.println("Esta seguro que desea cambiar el nombre?");
        String opc= leer.nextLine();
        if (opc.toLowerCase().equals("no")) {
            System.out.println("Genial, se lo reedigira al menu principal");
        }
        while(opc.toLowerCase().equals("si")){
            System.out.println("Ingrese el nuevo Nombre");
            nombre= leer.nextLine();
            System.out.println("Su nuevo nombre es "+nombre);
            System.out.println("Desea modificarlo?");
            opc=leer.nextLine();
            if (opc.toLowerCase().equals("no")) {
                System.out.println("GENIAL LO REGRESAREMOS AL MENU PRINCIPAL");
            }
        }
    }
    
    public void CambiarDni(){
        Scanner leer= new Scanner (System.in);
        System.out.println("Esta seguro que desea cambiar el DNI?");
        String opc2 = leer.nextLine();
        if (opc2.toLowerCase().equals("no")) {
            System.out.println("Genial, se lo reedigira al menu principal");
        }
        while(opc2.toLowerCase().equals("si")){
            System.out.println("Ingrese el nuevo DNI");
            dni= leer.nextInt();
            opc2=leer.nextLine();
            
        }
        
    }
    
    public boolean ingresar(){
       boolean retorno = false;
       Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese su contraseña");
        String pass22=leer.nextLine();
        int cont2=0;
        while (!pass22.equals(pass) && cont2<3){
            System.out.println("Incorrecto la contraseña no es valida");
            System.out.println("Le quedan "+(3-cont2)+" intentos");
            System.out.println("Ingrese su contraseña");
            pass22=leer.nextLine();
            if (!pass22.equals(pass)) {
               cont2++;  
            }
            
        }
        if (cont2==3) {
            System.out.println("LO SIENTO TE QUEDASTE SIN INTENTOS");
        }
        if (pass22.equals(pass) && cont2<3) {
            System.out.println("CONTRASEÑA CORRECTA");
            retorno=true;
        }
        
        return retorno;
    } 
    
    public void Menu(){
        System.out.println("Bienvenido "+nombre);
        
        Scanner leer = new Scanner (System.in);
        String opcMenu;
        if (ingresar()==true) {
            do {
            System.out.println(" ");
            System.out.println("ELIJA UNA OPCION");
            System.out.println("A-INGRESAR CONTRASEÑA");
            System.out.println("B-VER EL NIVEL DE SEGURIDAD DE MI CONTRASEÑA");
            System.out.println("C-MODIFICAR MI CONTRASEÑA");
            System.out.println("D-MODIFICAR MI NOMBRE");
            System.out.println("E-MODIFICAR MI DNI");
            System.out.println("F-SALIR");
            opcMenu= leer.nextLine();
            switch(opcMenu.toLowerCase()){
                    case "a":
                           ingresar();
                        break;
                    case "b":
                          Analizarpass();
                        break;
                    case "c":
                            if (ingresar()==true) {
                            Crearpass();
                        }
                        break;
                    case "d":
                              if (ingresar()==true) {
                            Cambiarnombre();
                        }
                        break;
                    case "e":
                           if (ingresar()==true) {
                            CambiarDni();
                        }
                        break;

                }
            
            
             } while (!opcMenu.toLowerCase().equals("f"));
            
        }
        
    }




}
