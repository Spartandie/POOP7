package poop7;
/**
 *
 * @author Albert GP Pérez, Diego Monroy
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alumno1= new Alumno();
        System.out.println(alumno1);
        
        Alumno alumno2= new Alumno(317022834, 9.84f, "universidad", 
                 8.6f, "UNAM", 34.89f,"Peter",19, "Parker",
                 "Estudiante y ayudante");
       alumno2.aprender(23.597f);
       System.out.println(alumno2.getAprendizaje());
       System.out.println(alumno2.getHorasEstudio());
       System.out.println(alumno2.getNumCuenta());
       System.out.println(alumno2.getGradoEscolar());
       System.out.println(alumno2.getNombre());
       System.out.println(alumno2.getPromedio());
       System.out.println(alumno2.getInstitucion());
       System.out.println(alumno2);
               
       System.out.println("**************************************************************");
       
       Profesor profesor1=new Profesor();
       System.out.println(profesor1);
       
       Profesor profesor2=new Profesor(24.39f,"UVM", 6.50f,15800f, 5.30f,"Tony", 
               39, "Stark", "Profesor y Padre");
       System.out.println(profesor2);
       System.out.println(profesor2.getApellidos());
       profesor2.setInstitucion("UNAM");
       System.out.println(profesor2.getInstitucion());
       System.out.println(profesor2.getHorasLaborales());
       System.out.println(profesor2.getLaborSocial());
       System.out.println(profesor2.getEnseñanza());
       System.out.println(profesor2.getVacaciones());
       profesor2.navidad(true);
       profesor2.Enseñando(31f);
       profesor2.trabajar(47.9f);
       System.out.println(profesor2);
       
       System.out.println("**************************************************************");
       
       Director director1=new Director();
       System.out.println(director1);
       
       Director director2=new Director(100590f, "UNAM", 5.30f,
                    45000f, 3.5f, "Steve",45, "Rogers", "Director y Padre");
       System.out.println(director2);
       System.out.println(director2.getApellidos());
       System.out.println(director2.getInstitucion());
       System.out.println(director2.getHorasLaborales());
       System.out.println(director2.getLaborSocial());
       System.out.println(director2.getCambios());
       System.out.println(director2.getPresupuesto());
       director2.cambiar(30);
       director2.navidad(true);
       director2.trabajar(60f);
       director2.sustitución(true);
       System.out.println(director2);
       director2.setContrato(true);
       director2.setAñosTrabajando(0f);
       director2.setTrabajo(0);
       director2.setPresupuesto(23000);
       director2.setVacaciones(false);
       director2.setCambios(6);
       System.out.println(director2);
       
       
       
       
       
       
               
               
       
        
       
    }
    
}
