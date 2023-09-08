
package com.mycompany.universidadulp.accesoADatos;

import com.mycompany.universidadulp.accesoADatos.exceptions.NonexistentEntityException;
import com.mycompany.universidadulp.entidades.Alumno;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    AlumnoJpaController alumnoJpa=new AlumnoJpaController();
    MateriaJpaController materiaJpa=new MateriaJpaController();
    InscripcionJpaController inscripcionJpa=new InscripcionJpaController();

    public void nuevoAlumno(Alumno alumnito) {
        alumnoJpa.create(alumnito);
    }

    public List<Alumno> traerAlumnos() {
        return alumnoJpa.findAlumnoEntities();
    }

    public void modificarAlumno(Alumno alum) {
        try {
            alumnoJpa.edit(alum);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarAlumno(int borrar) {
        try {
            alumnoJpa.destroy(borrar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
