package com.prueba.model.entities;

import com.prueba.model.entities.ProductosInventario;
import com.prueba.model.entities.SalidaInventario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-16T15:48:55")
@StaticMetamodel(DetalleSalida.class)
public class DetalleSalida_ { 

    public static volatile SingularAttribute<DetalleSalida, Integer> idDetalle;
    public static volatile SingularAttribute<DetalleSalida, SalidaInventario> idSalida;
    public static volatile SingularAttribute<DetalleSalida, Integer> cantidad;
    public static volatile SingularAttribute<DetalleSalida, ProductosInventario> idProducto;

}