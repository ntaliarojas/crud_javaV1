package com.prueba.model.entities;

import com.prueba.model.entities.ActualizacionPedido;
import com.prueba.model.entities.ClienteProveedor;
import com.prueba.model.entities.Empleados;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-26T02:24:18")
@StaticMetamodel(PedidoProduccion.class)
public class PedidoProduccion_ { 

    public static volatile SingularAttribute<PedidoProduccion, Date> fecha;
    public static volatile SingularAttribute<PedidoProduccion, ClienteProveedor> idClientePed;
    public static volatile SingularAttribute<PedidoProduccion, Empleados> idEmpleadoPed;
    public static volatile SingularAttribute<PedidoProduccion, Empleados> idConductor;
    public static volatile SingularAttribute<PedidoProduccion, Integer> valor;
    public static volatile SingularAttribute<PedidoProduccion, String> numeroFactura;
    public static volatile ListAttribute<PedidoProduccion, ActualizacionPedido> actualizacionPedidoList;
    public static volatile SingularAttribute<PedidoProduccion, Integer> idPedido;

}