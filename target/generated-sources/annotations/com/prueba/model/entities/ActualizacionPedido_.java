package com.prueba.model.entities;

import com.prueba.model.entities.PedidoProduccion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-26T02:24:18")
@StaticMetamodel(ActualizacionPedido.class)
public class ActualizacionPedido_ { 

    public static volatile SingularAttribute<ActualizacionPedido, Date> fecha;
    public static volatile SingularAttribute<ActualizacionPedido, Integer> idClienteAntes;
    public static volatile SingularAttribute<ActualizacionPedido, String> numFacturaAntes;
    public static volatile SingularAttribute<ActualizacionPedido, PedidoProduccion> idPedidoAct;
    public static volatile SingularAttribute<ActualizacionPedido, Integer> idActualizacion;
    public static volatile SingularAttribute<ActualizacionPedido, Integer> valorAntes;
    public static volatile SingularAttribute<ActualizacionPedido, Integer> idConductorAntes;
    public static volatile SingularAttribute<ActualizacionPedido, Integer> idEmpleadoAntes;

}