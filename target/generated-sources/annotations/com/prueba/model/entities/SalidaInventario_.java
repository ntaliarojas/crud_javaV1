package com.prueba.model.entities;

import com.prueba.model.entities.DetalleSalida;
import com.prueba.model.entities.Empleados;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-26T02:24:18")
@StaticMetamodel(SalidaInventario.class)
public class SalidaInventario_ { 

    public static volatile SingularAttribute<SalidaInventario, Date> fecha;
    public static volatile SingularAttribute<SalidaInventario, Empleados> idEmpleadoSal;
    public static volatile SingularAttribute<SalidaInventario, Integer> idSalida;
    public static volatile ListAttribute<SalidaInventario, DetalleSalida> detalleSalidaList;

}