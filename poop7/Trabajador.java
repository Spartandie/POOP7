package poop7;

/**
 *
 * @author Albert GP Pérez
 */
public class Trabajador extends Persona {
    
    private String institucion;
    private float horasLaborales;
    private float salario;
    public int trabajo;
    private float añosTrabajando;
    public boolean vacaciones;
    /**
     * Cosntructor vacio
     */
    public Trabajador() {
    }
    /**
     * 
     * @param institucion es la institucion
     * @param horasLaborales horas de trabajo
     * @param salario es el salario
     * @param añosTrabajando años de trabajo
     * @param Nombre nombre
     * @param edad edad
     * @param Apellidos apellidos
     * @param laborSocial labor social
     */
    public Trabajador(String institucion, float horasLaborales, float salario,
                     float añosTrabajando,String Nombre,
                     int edad, String Apellidos, String laborSocial) {
        
        super(Nombre, edad, Apellidos, laborSocial);
        this.institucion = institucion;
        this.horasLaborales = horasLaborales;
        this.salario = salario;
        this.trabajo = 0;
        this.añosTrabajando = añosTrabajando;
        this.vacaciones = false;
    }
    /**
     * 
     * @return institucion es la institucion
     */
    public String getInstitucion() {
        return institucion;
    }
    /**
     * 
     * @param institucion es la institucion
     */
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    /**
     * 
     * @return horasLaborales son las horas de trabajo
     */
    public float getHorasLaborales() {
        return horasLaborales;
    }
    /**
     * 
     * @param horasLaborales son las horas de trabajo
     */
    public void setHorasLaborales(float horasLaborales) {
        this.horasLaborales = horasLaborales;
    }
    /**
     * 
     * @return salario es el salario
     */
    public float getSalario() {
        return salario;
    }
    /**
     * 
     * @param salario es el salario
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    /**
     * 
     * @return es el trabajo
     */
    public int getTrabajo() {
        return trabajo;
    }
    /**
     * 
     * @param trabajo es el trabajo
     */
    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }
    /**
     * 
     * @return añosTrabajando años de trabajo
     */
    public float getAñosTrabajando() {
        return añosTrabajando;
    }
    /**
     * 
     * @param añosTrabajando años de trabajo
     */
    public void setAñosTrabajando(float añosTrabajando) {
        this.añosTrabajando = añosTrabajando;
    }
    /**
     * 
     * @return vacaciones son las vacaciones
     */
    public boolean getVacaciones() {
        return vacaciones;
    }
    /**
     * Funcion de vacaciones
     * @param vacaciones son las vacaciones
     */
    public void setVacaciones(boolean vacaciones) {
        this.vacaciones = vacaciones;
    }
    /**
     * fucnion de trabajo
     * @param horas horas trabajando
     */
        void trabajar(float horas){
        trabajo+=horas;
        System.out.println("Estoy trabajando mucho,"
        + " mi trabajo se traduce a "+ trabajo + "horas");
    }
        /**
         * navidad
         * @param navy ya es navidad?
         */
        void navidad(boolean navy){
        vacaciones=true;
        System.out.println("Es navidad y estoy de vacaciones"); 
    }
       /**
        * Funcion to string de trabajador
        * 
        */
    @Override
    public String toString() {
        return "Trabajador{" + "institucion=" + institucion + ", horasLaborales=" + horasLaborales + ", salario=" + salario + ", trabajo=" + trabajo + ", a\u00f1osTrabajando=" + añosTrabajando + ", vacaciones=" + vacaciones + '}';
    }

}




