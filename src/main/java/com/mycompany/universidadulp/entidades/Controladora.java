
package com.mycompany.universidadulp.entidades;

import com.mycompany.universidadulp.accesoADatos.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis=new ControladoraPersistencia();

    public void nuevoAlumno(String dni, String apellido, String nombre, Date fechaNacimiento, boolean activo) {
         Alumno alumnito=new Alumno();
         alumnito.setDni(dni);
         alumnito.setApellido(apellido);
         alumnito.setNombre(nombre);
         alumnito.setFechaNacimiento(fechaNacimiento);
         alumnito.setActivo(activo);
         
         controlPersis.nuevoAlumno(alumnito);
    }
    
        public List<Alumno> traerAlumnos() {
        return controlPersis.traerAlumnos();
    }

    public void modificarAlumno(int id, String dni, String apellido, String nombre, Date fechaNacimiento, boolean activo) {
         Alumno alum=new Alumno();
         alum.setIdAlumno(id);
         alum.setDni(dni);
         alum.setApellido(apellido);
         alum.setNombre(nombre);
         alum.setFechaNacimiento(fechaNacimiento);
         alum.setActivo(activo);
         
         controlPersis.modificarAlumno(alum);
    }

    public void borrarAlumno(int borrar) {
        controlPersis.borrarAlumno(borrar);
    }
}
