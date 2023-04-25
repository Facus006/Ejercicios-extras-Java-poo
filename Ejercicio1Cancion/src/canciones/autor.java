/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canciones;

/**
 *
 * @author Facu
 */
public class autor {
    private String titulo;
    private String autor;

    public autor() {
        this.titulo=" ";
        this.autor = " ";
        
    }

    public autor(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "autor{" + "Titulo=" + titulo + ", Autor=" + autor + '}';
    }

    
    
    
}
