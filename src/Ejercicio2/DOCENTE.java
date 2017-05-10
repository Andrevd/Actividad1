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
public class DOCENTE extends TRABAJADOR {
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
    private ALUMNO alum1;

    public void setAlum1(ALUMNO alum1P) {
        this.alum1 = alum1P;
    }

    public ALUMNO getAlum1() {
        return alum1;
    }
}
