
package com.mycompany.universidadulp.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Inscripcion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idInscripcion;
    private int nota;
    @OneToOne
    private Alumno idAlumno;
    @OneToOne
    private Materia idMateria;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, int nota, Alumno idAlumno, Materia idMateria) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }
    
    
}
