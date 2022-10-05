package logica;
import java.util.ArrayList;

public class metodo_alumnos {
  
    private ArrayList<alumnos> listadoAlumnos;
    
    public metodo_alumnos(){
        listadoAlumnos = new ArrayList<alumnos>();
    }
    
    public void agregar(alumnos c){
       this.listadoAlumnos.add(c); 
    }
    
    public void eliminar(alumnos c){
       this.listadoAlumnos.add(c); 
    }
    
    public int buscarAlumno(alumnos c){
        for (int i = 0; i<listadoAlumnos.size;i++) {
            if(listadoAlumnos.get(i).getNombre.equals(c)))
            
        }
    }
    
  

    
    
    
    
}
