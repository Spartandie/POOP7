package poop7;
/**
 *
 * @author Albert GP Pérez, Diego Monroy
 */
public class Persona {
    private String Nombre;
    private String Apellidos;
    private int edad;
    private String laborSocial;
    
    /**
     * Constructor vacio
     */
    public Persona(){
    }
    /**
     * 
     * @param Nombre nombre
     * @param edad edad
     * @param Apellidos apellidos
     * @param laborSocial  labor social
     */
    public Persona(String Nombre, int edad, String Apellidos,String laborSocial) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Apellidos = Apellidos;
        this.laborSocial=laborSocial;
    }
    /**
     * 
     * @return Nombre es el nombre
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * 
     * @return edad es la edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @return Apellidos son los apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }
    /**
     * 
     * @return laborSocial es la labor social
     */
    public String getLaborSocial() {
        return laborSocial;
    }
    /**
     * 
     * @param Nombre es el nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * 
     * @param edad es la edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @param Apellidos son los apellidos
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    /**
     * 
     * @param laborSocial es la labor social
     */
    public void setLaborSocial(String laborSocial) {
        this.laborSocial = laborSocial;
    }
    /**
     * Funcion tostring de persona
     * 
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", edad=" + edad + ", laborSocial=" + laborSocial + '}';
    }

    
    
}
