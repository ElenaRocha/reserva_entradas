/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author ele_r
 */
public class vobra {
    private int idobra;
    private String titulo;
    private String autor;
    private String sinopsis;
    private int duracion_min;
    private int idteatro;

    public vobra(int idobra, String titulo, String autor, String sinopsis, int duracion_min, int idteatro) {
        this.idobra = idobra;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.duracion_min = duracion_min;
        this.idteatro = idteatro;
    }

    public vobra() {
    }

    public int getIdobra() {
        return idobra;
    }

    public void setIdobra(int idobra) {
        this.idobra = idobra;
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

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracion_min() {
        return duracion_min;
    }

    public void setDuracion_min(int duracion_min) {
        this.duracion_min = duracion_min;
    }

    public int getIdteatro() {
        return idteatro;
    }

    public void setIdteatro(int idteatro) {
        this.idteatro = idteatro;
    }
    
    
}
