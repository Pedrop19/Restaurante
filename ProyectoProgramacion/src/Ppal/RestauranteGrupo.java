package Ppal;

import java.util.LinkedList;
import java.util.Scanner;

public class RestauranteGrupo {
	
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        LinkedList<Plato> platos = new LinkedList<Plato>();
        LinkedList<Empleado> empleados = new LinkedList<Empleado>();
        LinkedList<Ingrediente> ingredientes = new LinkedList<Ingrediente>();
        LinkedList<Proveedor> proveedores = new LinkedList<Proveedor>();

        Empleado Pedro = new Empleado("76", "Pedro", "Lazaro", Rango.CHEF);
        Empleado Jose = new Empleado("77", "Pedro", "Lazaro", Rango.RRHH);
        empleados.add(Pedro);
        empleados.add(Jose);
       
        
        int opc = 0;
        do{
            System.out.println("1. AÑADIR EMPLEADO"); //MANUELF
            System.out.println("2. DESPEDIR EMPLEADO"); //MANUELF
            System.out.println("3. RECEPCIONAR PEDIDO DE PROVEEDOR"); //JORGE Y RAUL
            System.out.println("4. CREAR PLATO"); //MANUEL
            System.out.println("5. AGREGAR PROVEEDOR"); //JORGE Y RAUL
            System.out.println("6. MOSTRAR BENEFICIO"); //PEDRO
            System.out.println("7. VENTA DE PLATO"); //PEDRO
            System.out.println("9. SALIR");
            opc = num.nextInt();

            switch(opc){
                case 1:
                Empleado.anadirEmpleado(empleados);
                break;
                case 2:
                Empleado.despedirEmpleado(empleados);
                break;
                case 3:
                pedidoProveedor(proveedores, ingredientes);
                break;
                case 4:
                crearPlato(empleados, platos, ingredientes);
                break;
                case 5:
                agregarProveedor(proveedores);
                break;
                case 6:
                mostrarBeneficios(platos, ingredientes);
                break;
                case 7:
                ventaPlato(platos);
            }
        }while(opc !=9);
    }

    //System.out.println("3. RECEPCIONAR PEDIDO DE PROVEEDOR");
    public static void pedidoProveedor(LinkedList<Proveedor> proveedores, LinkedList<Ingrediente> ingredientes) {
    	
		Scanner tex = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
    	System.out.println("-- RECEPCIONAR PEDIDO --");
    	System.out.println("Introduce el dni del proveedor: ");
    	String dni = tex.next();
    	
    	for(int i = 0; i < proveedores.size(); i++) {
    		if(proveedores.get(i).getDni().equals(dni)) {
    			System.out.println(proveedores.get(i).getNombre());
    			for(int j= 0; j < proveedores.get(i).getIngredientes().size(); j++) {
    				ingredientes.add(proveedores.get(i).getIngredientes().get(j));
    			}
    		}
    	}
    	System.out.println("PEDIDO RECEPCIONADO CORRECTAMENTE");
    }
    
    // System.out.println("4. CREAR PLATO");
	public static void crearPlato(LinkedList<Empleado> empleados, LinkedList<Plato> platos, LinkedList<Ingrediente> ingredientes) {
        
		Scanner tex = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        System.out.println("-- CREAR PLATO --");
		System.out.println("Indica la dificultad del plato");
        System.out.println("1. BAJA");
        System.out.println("2. MEDIA");
        System.out.println("3. ALTA");
        int idPlato = 0;
        int opccase1 = num.nextInt();
        Nivel nivel = null;
        switch (opccase1) {
            case 1:
                nivel = Nivel.BAJA;
                break;
            case 2:
                nivel = Nivel.MEDIO;
                break;
            case 3:
                nivel = Nivel.ALTA;
                break;
            default:
                System.out.println("OPCIÓN ERRONEA");
                break;
        }
        if (!empleados.isEmpty()) {
            System.out.println("Escoja un trabajador: ");
            for (int i = 0; i < empleados.size(); i++) {
                if (opccase1 == 1) {
                    if (empleados.get(i).getRangos() == Rango.CHEF) {
                        System.out.println(i + " - " + empleados.get(i).getNombre());
                    }

                }
                if (opccase1 == 2) {
                    if (empleados.get(i).getRangos() == Rango.CHEF) {
                        System.out.println(i + " - " + empleados.get(i).getNombre());
                    }

                }

                if (opccase1 == 3) {
                    if (empleados.get(i).getRangos() == Rango.CHEF || empleados.get(i).getRangos() == Rango.PINCHE) {
                        System.out.println(i  + " - " +  empleados.get(i).getNombre());
                    }

                }

            }
            String trab = tex.nextLine();
            for (int i = 0; i < empleados.size(); i++) {
                if (empleados.get(i).getDni().equals(trab)) {
                    Empleado e = empleados.get(i);
                }
            }

            System.out.println("Indique el nombre del plato");
            String nombrePlato = tex.nextLine();
            System.out.println("Indique la descripción");
            String descripcion = tex.nextLine();
            System.out.println("Ingrese el precio");
            int precio = num.nextInt();
            System.out.println("Indique la categoría del plato");
            System.out.println("1. ENTRANTE");
            System.out.println("2. PRIMERO");
            System.out.println("3. SEGUNDO");
            System.out.println("4. POSTRE");
            int opccase2 = num.nextInt();
            Categoria menu = null;
            switch (opccase2) {
                case 1:
                    menu = Categoria.ENTRANTE;
                    break;
                case 2:
                    menu = Categoria.PRIMERO;
                    break;
                case 3:
                    menu = Categoria.SEGUNDO;
                    break;
                case 4:
                    menu = Categoria.POSTRE;
                    break;
                default:
                    System.out.println("OPCIÓN ERRONEA");
                    break;
            }
            System.out.println("Elija los ingredientes que necesites");
            System.out.println("Creando el plato");
            platos.add(new Plato(idPlato, nombrePlato, descripcion, nivel, precio, menu, seleccionarIngredientes(ingredientes), empleados));
            idPlato++;
            for (int i = 0; i < platos.size(); i++) {
                if (platos.get(i).getNivelDificultad()==Nivel.ALTA) 
                    platos.get(i).setPrecio(precio*1.1);
                if (platos.get(i).getNivelDificultad()==Nivel.MEDIO) 
                	platos.get(i).setPrecio(precio*1.05);
                if (platos.get(i).getNivelDificultad()==Nivel.BAJA) 
                    platos.get(i).setPrecio(precio*1.01);       
            }
            System.out.println("Plato creado");
        } else
            System.out.println("No hay ningún trabajador");
	}
	
	public static LinkedList<Ingrediente> seleccionarIngredientes(LinkedList<Ingrediente> ingredientes) {
		
        Scanner numeros = new Scanner(System.in);
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println("¿Añadir  " + ingredientes.get(i).getTipodealimente()+ " al plato?");
            System.out.println("0 - Si / 1 - No");
            if (numeros.nextInt() == 0) {
                ingredientes.add(ingredientes.get(i));
                ingredientes.remove(ingredientes.get(i));
            }
        }
        return ingredientes;
	}

    //System.out.println("5. AGREGAR PROVEEDOR");
	public static void agregarProveedor(LinkedList<Proveedor> proveedores) {
		
		Scanner texto = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("CREANDO NUEVO PROVEEDOR");
        System.out.print("Introduce el DNI: ");
        String dni = texto.nextLine();
        System.out.println("Introduce el nombre");
        String nombre = texto.nextLine();
        System.out.println("Que cantidad de ingredientes va a tener el proveedor? ");
        int cantidad = numeros.nextInt();
        System.out.println("Introduce ingrediente al Provedor:");
        System.out.println("De que tipo es el alimento"
                    + "+ \"1 - VERDURA, 2 - CARNE, 3 - PESCADO, 4 - LEGUMBRES, 5 - CEREAL, 6 - OTROS)");
        int r;
        LinkedList<Ingrediente> ingredientes= new LinkedList<Ingrediente>();
        for (int i = 0; i < cantidad; i++){
            r = numeros.nextInt();

            switch (r) {
                    case 1:
                        ingredientes.add(new Ingrediente (i,TIPO.VERDURA,20.5));
                    break;
                    case 2:
                        ingredientes.add(new Ingrediente (i,TIPO.CARNE,28.5));
                    break;
                    case 3:
                        ingredientes.add(new Ingrediente (i,TIPO.PESCADO,22.5));
                    break;
                    case 4:
                        ingredientes.add(new Ingrediente (i,TIPO.LEGUMBRES,30.5));
                    break;
                    case 5:
                        ingredientes.add(new Ingrediente (i,TIPO.CEREAL,20.5));
                    break;
                    case 6:
                        ingredientes.add(new Ingrediente (i,TIPO.OTROS,20.5));
                    break;
                default:
                    System.out.println("OPCION NO VÁLIDA");;
                }
            }
            
            proveedores.add(new Proveedor(dni, nombre, ingredientes));
            
               
                System.out.println("Nuevo provedor(" + dni + ") creado" + proveedores.toString());
	}
    //System.out.println("6. MOSTRAR BENEFICIO");
	public static void mostrarBeneficios(LinkedList<Plato> platos, LinkedList<Ingrediente> ingredientes) {
		
		Scanner numeros = new Scanner(System.in);
		System.out.println("6. MOSTRAR BENEFICIO");
		System.out.println("¿De que plato quieres ver el beneficio?: ");
		mostrarPlatos(platos);
		int plato = numeros.nextInt();
		
		double precioPlato = 0;
		double precioIng = 0;
		
		
		for (int i = 0; i < platos.size(); i++) {
			if(platos.get(i).getIdPlato() == plato) {
				precioPlato = platos.get(plato).getPrecio();
				for (int j = 0; j < ingredientes.size(); j++) {
					precioIng += platos.get(plato).getIngredientes().get(j).getPrecio();
				}
			}	
		}
		double beneficio = precioPlato - precioIng;
		System.out.println("Plato: " + platos.get(plato).getNombrePlato() + " Beneficio: " + beneficio);
		
	}

        //System.out.println("7. VENTA DE PLATO");
    public static void ventaPlato (LinkedList<Plato> platos){
    	Scanner enteros = new Scanner(System.in);
                
        System.out.println("--- VENTA DE PLATO ---");
        System.out.println("A continuación se mostrará una lista de los platos disponibles: ");
        mostrarPlatos(platos);
        System.out.println("Eliga mediante el identificador el plato que quiere vender: ");
        int identificador = enteros.nextInt();
            
        for (int i = 0; i < platos.size(); i++) {
            if(platos.get(i).getIdPlato() == identificador) {
                platos.remove(identificador);
            }
        }
    }

    //MostrarPlatos
	public static void mostrarPlatos(LinkedList<Plato> platos) {
		System.out.println("-- LISTA DE PLATOS --");
		if(!platos.isEmpty()) {
			for (int i = 0; i < platos.size(); i++) {
				System.out.println("Identificador: " + (i) + " - " + "Nombre: " + platos.get(i).getNombrePlato()
						+ " - " + "Precio: " + platos.get(i).getPrecio());
			}
		}else
		System.out.println("No hay platos");
	}
}