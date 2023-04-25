/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Puntos {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int x;
    private int y;
    public double resultado;

    public Puntos() {
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void crearPuntos(){
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese las coordenadas de los primeros puntos");
        x1= leer.nextInt();
        y1= leer.nextInt();
        System.out.println("Ingrese las coordenadas de los segundos puntos");
        x2= leer.nextInt();
        y2= leer.nextInt();
        
        x= x2-x1;
        y= y2-y1;
        
    }
    
    public double Calcular() {
        
        resultado = Math.sqrt(x*x + y*y);
        
        return resultado;
        
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + ", x=" + x + ", y=" + y + ", resultado=" + resultado + '}';
    }
    
    
}
