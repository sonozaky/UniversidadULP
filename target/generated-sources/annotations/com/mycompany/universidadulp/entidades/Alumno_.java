package com.mycompany.universidadulp.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-08T18:48:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, Integer> idAlumno;
    public static volatile SingularAttribute<Alumno, Date> fechaNacimiento;
    public static volatile SingularAttribute<Alumno, String> apellido;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile SingularAttribute<Alumno, String> dni;
    public static volatile SingularAttribute<Alumno, Boolean> activo;

}