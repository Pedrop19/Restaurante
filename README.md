
# Proyecto Programacion: Restaurante



### Problema

Se requiere crear un programa para gestionar los diferentes platos que existen en un restaurante.
De estos platos se guarda un identificador, nombre, descripción, el nivel de dificultad(BAJA, MEDIO, ALTA), el precio para el cliente, la categoría (ENTRANTE, PRIMERO, SEGUNDO, POSTRE), una lista con los ingredientes utilizados y el encargado de realizar este plato.
Los empleados se clasifican en (CHEF, PINCHE, RRHH), además se debe conocer el DNI, el nombre y el apellido.
Además también se quiere saber los ingredientes que llevan estos platos, de los cuales se desea guardar un identificador,el tipo( VERDURA, CARNE, PESCADO, LEGUMBRES, CEREAL, OTROS) y el precio.
Aparte también necesitamos conocer los proveedores de cada ingrediente, de estos se guardará el DNI, el nombre y el apellido.

Dependiendo del nivel de dificultad del plato:

- Si el plato tiene dificultad alta, el precio para el cliente se incrementará en un 10% de su precio base, además solo podrá ser preparado por un Chef.
- Si el plato tiene dificultad media, el precio para el cliente se incrementará en un 5% de su precio base, además solo podrá ser preparado por un Chef.
- Si el plato tiene dificultad baja, podrá ser preparado por un Pinche.

Además se desea conocer los beneficios de venta de cada plato, para ello se sumarán el precio unitario de cada ingrediente y se contrastará con el precio de venta.

Las funciones de Añadir y Borrar empleado solo pueden usarlas aquellos empleados que sean RRHH.

A continuación se facilitan dos empleados:

#### Empleado Pedro = new Empleado("76", "Pedro", "Lazaro", Rango.CHEF);
#### Empleado Jose = new Empleado("76", "Pedro", "Lazaro", Rango.RRHH);

### MÉTODOS A IMPLEMENTAR

- AÑADIR EMPLEADO  (Este método añade un empleado)
- BORRAR EMPLEADO  (Este método borra un empleado (solo lo puede hacer RRHH))
- RECEPCIONAR PEDIDO DE PROVEEDOR (Este método recepciona los ingredientes, los va añadiendo a la lista del almacén y borrando de la lista del proveedor)
- CREAR PLATO (Este método crea un plato nuevo y lo agrega a la lista de disponibles)
- BORRAR PLATOS (Este método borra un plato y lo elimina de la lista de disponibles)
- AGREGAR PROVEEDOR (Este método agrega un nuevo proveedor, el precio será fijo)
- MOSTRAR BENEFICIOS  (Este método muestran los posibles beneficios de un plato.
- VENTA DE PLATO  (Este método vende un plato y lo borra de la lista de disponibles)
## Autores

- [@pedrop19](https://www.github.com/pedrop19)
- [@manuelfn009](https://www.github.com/manuelfn009)
- [@jsolanah](https://www.github.com/jsolanah)
- [@raulpm2003-bit](https://www.https://github.com/raulpm2003-bit)
- [@EloyPul](https://www.github.com/EloyPul)
- [@MMK309](https://www.github.com/MMK309)
