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
public class Gerente extends Empleado {
    private int presupuesto;
    /**
     * Constructor vacio
     */
    public Gerente()
    {
        
    }
    /**
     * Constructor con parametros
     * @param presupuesto es el presupuesto
     * @param nombre es el nombre
     * @param numEmpleado es el numero de empleado
     * @param sueldo es el sueldo
     */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @return presupuesto es el presupuesto 
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * 
     * @param presupuesto es el presupuesto
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @param anio es el año
     * @param tasa es la tasa
     */
     public void setPresupuesto(int anio, float tasa) {
        this.presupuesto+= presupuesto/(anio*tasa);
    }
     /**
      * funcion to string de gerente
      * @return 
      */
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }

    
    
    
}
