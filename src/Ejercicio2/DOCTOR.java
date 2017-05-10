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
public class DOCTOR {
    private int numero_maximo_tesis;
    private DOCTORANDO doctorando1;
    
   public void setNumero_Maximo_Tesis(int numero_maximo_tesisP){
       this. numero_maximo_tesis = numero_maximo_tesisP;
   }
   public int getNumero_maximo_tesis (){
       return numero_maximo_tesis;
   }
   
   public void setDoctorando1(DOCTORANDO doctorando1)
     {
         this.doctorando1=doctorando1;
     }
     public DOCTORANDO getDoctorando1()
     {
         return this.doctorando1;
     }
}
