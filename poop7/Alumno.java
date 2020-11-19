package poop7;
/**
 *
 * @author Albert GP Pérez, Diego Monroy
 */
public class Alumno extends Persona{
    private int numCuenta;
    private float promedio;
    private String gradoEscolar;
    private float horasEstudio;
    private String institucion;
    private float aprendizaje;
    
    /**
     * Constructor vacio
     */
    public Alumno(){
        
    }
    /**
     * Cosntructor 
     * 
     * @param numCuenta nuemero de cuenta
     * @param promedio proemedio 
     * @param gradoEscolar nivel academico
     * @param horasEstudio horas de estudio 
     * @param institucion escuela
     * @param aprendizaje puntaje de aprendizaje
     * @param Nombre nombre del alumno
     * @param edad edad 
     * @param Apellidos apellidos
     
     */
    public Alumno(int numCuenta, float promedio, String gradoEscolar, 
                 float horasEstudio, String institucion, float aprendizaje,
                 String Nombre,int edad, String Apellidos, String laborSocial){
        
        super(Nombre, edad, Apellidos, laborSocial);
        this.numCuenta = numCuenta;
        this.promedio = promedio;
        this.gradoEscolar = gradoEscolar;
        this.horasEstudio = horasEstudio;
        this.institucion = institucion;
    }
    
    /**
     * 
     * @return numCuenta es el numero de cuenta 
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    /**
     * 
     * @return promedio es el promedio 
     */
    public float getPromedio() {
        return promedio;
    }
    /**
     * 
     * @return gradoEscolar es el nivel academico actual
     */
    public String getGradoEscolar() {
        return gradoEscolar;
    }
    /**
     * 
     * @return horasEstudio cantidad de horas estudiadas
     */
    public float getHorasEstudio() {
        return horasEstudio;
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
     * @return  aprendizaje es el puntaje de aprendizaje
     */
    public float getAprendizaje() {
        return aprendizaje;
    }
    /**
     * 
     * @param numCuenta es el numero de cuenta
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * 
     * @param promedio es el promedio
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    /**
     * 
     * @param gradoEscolar es el nive academico
     */
    public void setGradoEscolar(String gradoEscolar) {
        this.gradoEscolar = gradoEscolar;
    }
    /**
     * 
     * @param horasEstudio horas estudidas
     */
    public void setHorasEstudio(float horasEstudio) {
        this.horasEstudio = horasEstudio;
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
     * @param aprendizaje es el puntaje de aprendizaje
     */
    public void setAprendizaje(float aprendizaje) {
        this.aprendizaje = aprendizaje;
    }
    /**
     * Funcion para aprender
     * @param aprendido puntaje de aprendizaje
     */
    public void aprender(float aprendido){
        aprendizaje+=aprendido;
        System.out.println("Estoy aprendiendo mucho,"
        + " mi aprendizaje ahora es de "+ aprendizaje + "puntos");
    }
    /**
     * 
     * funcion tostring de alumno
     */
    @Override
    public String toString() {
        return "Alumno{" + "numCuenta=" + numCuenta + ", promedio=" + promedio + ", gradoEscolar=" + gradoEscolar + ", horasEstudio=" + horasEstudio + ", institucion=" + institucion + ", aprendizaje=" + aprendizaje + '}';
    }

}

