package poop7;
/**
 *
 * @author Albert GP Pérez , Diego Monroy
 *
 */
public class Director extends Trabajador {
    private float presupuesto;
    private boolean contrato;
    private int cambios;
    /**
     * Constructor vacio
     */
    public Director() {
    }
    /**
     * 
     * @param presupuesto presupuesto disponible
     * @param institucion institucion
     * @param horasLaborales horas de trabajo
     * @param salario salario
     * @param añosTrabajando años de trabajo
     * @param Nombre nombre
     * @param edad edad
     * @param Apellidos apellidos
     * @param laborSocial labor social
     */
    public Director(float presupuesto, String institucion, float horasLaborales,
                    float salario, float añosTrabajando, String Nombre,
                    int edad, String Apellidos, String laborSocial) {
        
        super(institucion, horasLaborales, salario, añosTrabajando, Nombre, edad, Apellidos, laborSocial);
        this.presupuesto = presupuesto;
        this.contrato=true;
        this.cambios=0;
    }
    /**
     * 
     * @return preupuesto es el presupuesto
     */
    public float getPresupuesto() {
        return presupuesto;
    }
    /**
     * 
     * @param presupuesto es el presupuesto
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @param contrato es el estado del contrato
     */
    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }
    /**
     * 
     * @return cambios son los cambios
     */
    public int getCambios() {
        return cambios;
    }
    /**
     * 
     * @param cambios son los cambios
     */
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
       /**
        * 
        * funcion para sustituir
        */
    
    void sustitución(boolean otro){
        contrato=false;
        System.out.println("Este director ya no cuenta con contrato para "
                + "seguir en su labor, renovarlo o contratar uno nuevo");
    }
    /**
     * ¨funcion para cambiar
     * 
     */
    void cambiar(int cambio){
        cambios+=cambio;
        System.out.println("El director ha realizado un total de "
                            + cambios+ "al plantel");
    }
    /**
     * 
     * @return contrato es el estado del contrato
     */
    public boolean isContrato() {
        return contrato;
    }
    /**
     * 
     * funcion to string del director
     */
    @Override
    public String toString() {
        return "Director{" + "presupuesto=" + presupuesto + ", contrato=" + contrato + ", cambios=" + cambios + "vacaciones= "+ vacaciones + " trabajo= "+ trabajo + '}';
    }
}
