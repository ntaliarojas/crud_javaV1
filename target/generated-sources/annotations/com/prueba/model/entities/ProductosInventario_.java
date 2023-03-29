package com.prueba.model.entities;

import com.prueba.model.entities.DetalleSalida;
import com.prueba.model.entities.EntradaInventario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-26T02:24:18")
@StaticMetamodel(ProductosInventario.class)
public class ProductosInventario_ { 

    public static volatile ListAttribute<ProductosInventario, EntradaInventario> entradaInventarioList;
    public static volatile ListAttribute<ProductosInventario, DetalleSalida> detalleSalidaList;
    public static volatile SingularAttribute<ProductosInventario, Integer> idProducto;
    public static volatile SingularAttribute<ProductosInventario, Integer> stock;
    public static volatile SingularAttribute<ProductosInventario, String> nombre;

}