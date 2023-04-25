/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Facu
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private boolean bici;
    public Fecha() {
      this.dia = 1;
       this.mes = 1;
       this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean isBici() {
        return bici;
    }

    public void setBici(boolean bici) {
        this.bici = bici;
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean anioBici(){
        
        if (anio % 4 == 0) {
            System.out.println("EL AÑO "+anio+" ES AÑO BICIESTO");
            bici=true;
        }else{
            System.out.println("El Año "+anio+" No es Biciesto");
            bici=false;
        }
        return bici;
        
    }
     
    public boolean verificaranio(){
         boolean retorno = false;
         int cont=0;
        if (anio<1900 || anio>2022) {
            System.out.println("El año ingresado es invalido");
            anio=1900;
            cont++;
        }
        if (dia<1 || dia>31) {
            System.out.println("El dia ingresado no es valido");
            dia=1;
            cont++;
        }
        if (mes<1 || mes>12) {
            System.out.println("El mes ingresado no es valido");
            mes=1;
            cont++;
        }
        if (cont<=1) {
            retorno=false;
        }
        if (cont==0) {
            retorno=true;
        }
      
        return retorno;
    }
    
    public void diasmes(){
        if (anioBici()==false) {
             if (mes==1) {
            System.out.println("El mes de Enero tiene 31 dias");
        }
        if (mes==2) {
            System.out.println("El mes de Febrero tiene 28 dias");
        }
        if (mes==3) {
            System.out.println("El mes de Marzo tiene 31 dias");
        }
        if (mes==4) {
            System.out.println("El mes de Abril tiene 30 dias");
        }
        if (mes==5) {
            System.out.println("El mes de Mayo tiene 31 dias");
        }
        if (mes==6) {
            System.out.println("El mes de Junio tiene 30 dias");
        }
        if (mes==7) {
            System.out.println("El mes de Julio tiene 31 dias");
        }
        if (mes==8) {
            System.out.println("El mes de Agosto tiene 31 dias");
        }
        if (mes==9) {
            System.out.println("El mes de Septiembre tiene 30 dias");
        }
        if (mes==10) {
            System.out.println("El mes de Octubre tiene 31 dias");
        }
        if (mes==11) {
            System.out.println("El mes de Noviembre tiene 30 dias");
        }
        if (mes==12) {
            System.out.println("El mes de Diciembre tiene 31 dias");
        }
  
        }else{
            
         if (mes==1) {
            System.out.println("El mes de Enero tiene 31 dias");
        }
        if (mes==2) {
            System.out.println("El mes de Febrero tiene 29 dias");
        }
        if (mes==3) {
            System.out.println("El mes de Marzo tiene 31 dias");
        }
        if (mes==4) {
            System.out.println("El mes de Abril tiene 30 dias");
        }
        if (mes==5) {
            System.out.println("El mes de Mayo tiene 31 dias");
        }
        if (mes==6) {
            System.out.println("El mes de Junio tiene 30 dias");
        }
        if (mes==7) {
            System.out.println("El mes de Julio tiene 31 dias");
        }
        if (mes==8) {
            System.out.println("El mes de Agosto tiene 31 dias");
        }
        if (mes==9) {
            System.out.println("El mes de Septiembre tiene 30 dias");
        }
        if (mes==10) {
            System.out.println("El mes de Octubre tiene 31 dias");
        }
        if (mes==11) {
            System.out.println("El mes de Noviembre tiene 30 dias");
        }
        if (mes==12) {
            System.out.println("El mes de Diciembre tiene 31 dias");
        }
        
        }
        
    }
    
    public void diaAnterior(){
        System.out.println("Hoy es "+dia+"/"+mes+"/"+anio);
        int diaA=dia;
        int mesA=mes;
        int anioA=anio;
        
        if (dia==1 && mes==5 ||dia==1 && mes==7 || dia==1 && mes==10 || dia==1 &&
                mes==12) {
            mesA-=1;
            diaA=30;
        } else if (dia==1 && mes==3) {
            diaA=28;
            mesA=2;
        }else if (dia==1 && mes==1) {
            diaA=31;
            mesA=12;
            anioA-=1;
        }else if (dia==1 && mes==2 || dia==1 && mes==4 || dia==1 && mes==6 
                || dia==1 && mes==8 || dia==1 && mes==9 || dia==1 && mes==4
                || dia==1 && mes==11 ) {
            diaA=31;
            mesA-=1;
        } else {
            diaA-=1;
        }  
            
        
       System.out.println("Ayer fue "+diaA+"/"+mesA+"/"+anioA);
        
        
    }
    
    public void diasig(){
        int diaS=dia;
        int mesS=mes;
        int anioS=anio;
        if (dia==31 && mes==1 || dia==28 && mes==2 || dia==31 && mes==3 
                || dia==30 && mes==4 || dia==31 && mes==5 || dia==30 && mes==6
                || dia==31 && mes==7 || dia==31 && mes==8 || dia==30 && mes==9
                || dia==31 && mes==10 || dia==30 && mes==11) {
            diaS=1;
            mesS+=1;
        }else if (dia==31 && mes==12) {
            diaS=1;
            mesS=1;
            anioS+=1;
        }else {
            diaS+=1;
        }
        
        System.out.println("El dia siguiente es "+diaS+"/"+mesS+"/"+anioS);
        
    }
 
    public void menu(){
        if (verificaranio()==true) {
            diasmes();
            diaAnterior();
            diasig();
            
        }
    }
    
}
