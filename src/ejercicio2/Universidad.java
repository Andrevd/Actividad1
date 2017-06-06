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

    public class Universidad {
    private Departamento DEPARTAMENTO1= new Departamento();
        private int id;
    private String nombre;
    private  Persona PERSONA1;
    private Trabajador trabajador1;
    public void setPERSONA1(Persona PERSONA1p)
    {
    this.PERSONA1=PERSONA1p;
    }
            
    public Persona PERSONA1 () 
    { 
    return PERSONA1;
    }
    
    public void setid(int idp)
    {
    this.id=idp;
    }
    
    public int getid () 
    { 
    return id;  
    }
    
    public void setnombre(String nombrep)
    {
    this.nombre=nombrep;
    }
    
    public String getnombre () 
    { 
    return nombre;  
    }
    
     public void setTrabajador1(Trabajador trabajador1P) {
        this.trabajador1 = trabajador1P;
    }

    public Trabajador getTrabajador1() {
        return trabajador1;
    }
}


