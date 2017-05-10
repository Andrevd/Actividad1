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
public class DEPARTAMENTO {
    private ALUMNO alumno1;
    private DOCTOR doctor1;
    private String nombre;
    private String direccion;
    private TRABAJADOR trabajador1;

 public void setAlumno1(ALUMNO alumno1P){ 
        this.alumno1= alumno1P;
        
    } public  ALUMNO getAlumno1(){
        return alumno1; 
        
    }
 public void setDoctor1(DOCTOR doctor1P){ 
        this.doctor1= doctor1P;
        
    } public  DOCTOR getDoctor1(){
        return doctor1; 
        
    }

    
    public void setNombre(String nombreP){
        this.nombre = nombreP;     
    }
   public String getNombre(){ 
        return nombre; 
    
   }
    public void setDireccion(String direccionP){
        this.direccion = direccionP;
    }
    public String getDireccion(){
        return direccion;
    }
     public void setTrabajador1(TRABAJADOR trabajador1P) {
        this.trabajador1 = trabajador1P;
    }

    public TRABAJADOR getTrabajador1() {
        return trabajador1;
    }
}