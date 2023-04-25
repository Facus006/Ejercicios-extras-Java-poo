/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author Facu
 */
public class Calculos {
    private int a;
    private int b;
    private int c;
    private double [] resultado= new double [2];
    public double discriminante;
    public Calculos() {
    }

    public Calculos(int a, int b, int c, double resultado) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.resultado [2] = resultado;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }

    public double[] getResultado() {
        return resultado;
    }

    public void setResultado(double[] resultado) {
        this.resultado = resultado;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

   
    public double Discriminante(){
         discriminante= (Math.pow(b, 2) - (4 * a * c));
        
        return discriminante;
    }
    
    public boolean tieneRaices() {
        boolean retorno = false;
        if (discriminante>=0) {
            resultado [0]= ((-b) - (4 * a * c)) / (2 * a);
            resultado [1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            retorno=true;
        } else {
            retorno = false;
        }
        
        
        return retorno;
    }
    
    public boolean tieneRaiz() {
        boolean retorno = false;
        if (discriminante==0) {
            resultado [0] = ((-b) - (4 * a * c)) / (2 * a);
            retorno=true;
        } else {
            retorno = false;
        }
        
        return retorno;
    }
    
    public void obtenerRaices() {
        if (tieneRaices()==true) {
            System.out.println(resultado [0]);
            System.out.println(resultado [1]);
            
        }
        
    }
    
    public void obtenerRaiz(){
        
        if (tieneRaiz()== true) {
            System.out.println(resultado [0]);
            
        }
    }
    
    public void calcular() {
        Discriminante();
        tieneRaices();
        tieneRaiz();
        obtenerRaices();
        obtenerRaiz();
        if (discriminante<=0) {
            System.out.println("No tiene solucion");
        }
        
    }
    
    
}

