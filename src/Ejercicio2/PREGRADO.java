/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author sena
 */
public class PREGRADO extends ALUMNO {
 private String titulo;
 private String curso;
 
 private void setTitulo(String titulo)
 {
     this.titulo=titulo;
 }
 public String getTitulo()
 {
     return this.titulo;
 }
 
 
 public void setCurso(String curso)
 {
     this.curso=curso;
 }
 
 public String getCurso()
 {
     return this.curso;
 }
}
