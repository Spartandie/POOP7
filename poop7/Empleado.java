/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *
 * @author spart
 */
public class Empleado {
    
   private String nombre;
   private int numEmpleado;
   private int sueldo;
   /**
    * Constructor vacio
    */
   public Empleado()
   {
       
   }
   /**
    * Constructor con parametros
    * @param nombre nombre
    * @param numEmpleado numero de empleado
    * @param sueldo sueldo
    */
   public Empleado(String nombre, int numEmpleado, int sueldo){
       this.nombre=nombre;
       this.numEmpleado=numEmpleado;
       this.sueldo=sueldo;
       
   }
   /**
    * 
    * @return  nombre es el nombre
    */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return numEmpleado es el numero de empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * 
     * @return sueldo es el sueldo
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * 
     * @param nombre es el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @param numEmpleado es el numero de empleado
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @param sueldo es el sueldo
     */
    public void setSueldo(int sueldo) {
        if (sueldo>=0)
        {
            this.sueldo = sueldo;
        }
    }
    /**
     * Funcion to string de empleado
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
   /**
    * Esta funcion aumenta el sueldo
    * @param porcentaje es el porcentaje de aumento
    * @return sueldo es el sueldo
    */
    public int aumentarSueldo(int porcentaje){
        sueldo+= (int) (sueldo*porcentaje/100);
        return sueldo;
    }
}
