package com.prueba.model.entities;

import com.prueba.model.entities.Empleados;
import com.prueba.model.entities.ProductosProduccion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-26T02:24:18")
@StaticMetamodel(Produccion.class)
public class Produccion_ { 

    public static volatile SingularAttribute<Produccion, Date> fecha;
    public static volatile SingularAttribute<Produccion, ProductosProduccion> idProducto;
    public static volatile SingularAttribute<Produccion, Integer> idProduccion;
    public static volatile SingularAttribute<Produccion, Empleados> idEmpleadoPro;

}