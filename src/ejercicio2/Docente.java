/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author SENA
 */
public class Docente extends Trabajador {
    private int numproyect;
    private String categoria;
    
    public void setNumproyect(int numproyectP) {
        this.numproyect = numproyectP;
    }

    public int getNumproyect() {
        return numproyect;
    }

    public void setCategoria(String categoriaP) {
        this.categoria = categoriaP;
    }

    public String getCategoria() {
        return categoria;
    }
    private Alumno alum1;

    public void setAlum1(Alumno alum1P) {
        this.alum1 = alum1P;
    }

    public Alumno getAlum1() {
        return alum1;
    }
}
