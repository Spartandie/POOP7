package poop7;
/**
 *
 * @author Albert GP Pérez, Diego Monroy
 */
public class Profesor extends Trabajador {
    
    private float enseñanza;
    /**
     * Constructor vacio
     */
    public Profesor() {
    }
    /**
     * 
     * @param enseñanza es la enseñanza
     * @param institucion es la institucion
     * @param horasLaborales son la shoras de trabaji
     * @param salario es el salario
     * @param añosTrabajando años trabajandi
     * @param Nombre nombre
     * @param edad edad 
     * @param Apellidos apellidos
     * @param laborSocial labor social
     */
    public Profesor(float enseñanza,String institucion, float horasLaborales, 
            float salario, float añosTrabajando, String Nombre, int edad,
            String Apellidos, String laborSocial) {
        
        super(institucion, horasLaborales, salario, añosTrabajando, Nombre, edad, Apellidos, laborSocial);
        this.enseñanza=enseñanza;
    }
    /**
     * 
     * @return enseñanza es la enseñanza
     */
    public float getEnseñanza() {
        return enseñanza;
    }
    /**
     * funcion de la enseñanza
     * @param enseñanza enseñanza
     */
    public void setEnseñanza(float enseñanza) {
        this.enseñanza = enseñanza;
    }

        void Enseñando(float enseña){
        enseñanza+=enseña;
        System.out.println("El maestro ha "
        + "enseñado "+ enseñanza/100+ "porciento del temario");}
        
    /**
     * Funcion to string de profesor
     * @return 
     */
    @Override
    public String toString() {
        return "Profesor{" + "ense\u00f1anza= " + enseñanza + "vacaciones= "+ vacaciones + " trabajo= "+ trabajo +'}';
    }
    
    
    
}

