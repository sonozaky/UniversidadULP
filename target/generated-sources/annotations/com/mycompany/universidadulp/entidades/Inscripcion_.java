package com.mycompany.universidadulp.entidades;

import com.mycompany.universidadulp.entidades.Alumno;
import com.mycompany.universidadulp.entidades.Materia;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-08T18:48:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Inscripcion.class)
public class Inscripcion_ { 

    public static volatile SingularAttribute<Inscripcion, Alumno> idAlumno;
    public static volatile SingularAttribute<Inscripcion, Materia> idMateria;
    public static volatile SingularAttribute<Inscripcion, Integer> idInscripcion;
    public static volatile SingularAttribute<Inscripcion, Integer> nota;

}