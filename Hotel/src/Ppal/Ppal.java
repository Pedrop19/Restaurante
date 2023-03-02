package Ppal;

import java.util.LinkedList;
import java.util.Scanner;

public class Ppal {
	
	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		LinkedList<Alimento> alimentos = new LinkedList<Alimento>();
		LinkedList <Habitacion> habitaciones = new LinkedList <Habitacion>();
		LinkedList<Hospedaje> hospedajes = new LinkedList<Hospedaje>();
		Alimento pepino = new Alimento(0, "Pepino", 5);
		Alimento cebolla = new Alimento(1, "Cebolla", 0);
		alimentos.add(pepino);
		alimentos.add(cebolla);
		
        int opc = 0;
        do{
        	System.out.println("Bienvenido, eliga una opción para comenzar[1-5]");
            System.out.println("1. ALQUILAR HABITACION");
            System.out.println("2. ELIMINAR HABITACION");
            System.out.println("3. SERVIR BUFFET");
            System.out.println("4. LIMPIAR HABITACION");
            System.out.println("5. SALIR");
            opc = numeros.nextInt();
            
        	switch(opc) {
        	
        		case 1:
        			alquilarHabitacion(habitaciones, hospedajes);
        			break;
        		case 2:
        			darDeBaja(habitaciones, hospedajes);
        			break;
        		case 3:
        			servirBuffet(alimentos);
        			break;
        		case 4:
        			limpiarHabitacion(habitaciones);
        			break;
        	}
        }while(opc !=5);
        
        
    }
	
	public static void alquilarHabitacion(LinkedList<Habitacion> habitaciones, LinkedList<Hospedaje> hospedajes) {
	    Scanner scanner = new Scanner(System.in);
	    
	    // Registrar al cliente
	    System.out.println("Ingrese su nombre:");
	    String nombre = scanner.nextLine();
	    
	    System.out.println("Ingrese su apellido:");
	    String apellido = scanner.nextLine();
	    
	    System.out.println("Ingrese su DNI:");
	    String dni = scanner.nextLine();
	    
	    Cliente cliente = new Cliente(dni, nombre, apellido, apellido);
	    
	    
	    // Mostrar las habitaciones disponibles
	    System.out.println("Habitaciones disponibles:");
	    for (Habitacion habitacion : habitaciones) {
	        if (!habitacion.isOcupada()) {
	            System.out.println(habitacion.getN_habitacion()+ " - " + habitacion.getCategoria());
	        }
	    }
	    
	    // Elegir una habitación
	    System.out.println("Ingrese el número de la habitación que desea alquilar:");
	    int numero = scanner.nextInt();
	    
	    Habitacion habitacionElegida = null;
	    for (Habitacion habitacion : habitaciones) {
	        if (habitacion.getN_habitacion()== numero && !habitacion.isOcupada()) {
	            habitacionElegida = habitacion;
	            break;
	        }
	    }
	    
	    if (habitacionElegida != null) {
	        // Añadir el hospedaje a la lista
	        Hospedaje hospedaje = new Hospedaje(cliente, habitacionElegida);
	        hospedajes.add(hospedaje);
	        habitacionElegida.setOcupada(true);
	        
	        System.out.println("Habitación " + habitacionElegida.getN_habitacion()+ " alquilada con éxito.");
	    } else
	     System.out.println("No se encontró ninguna habitación disponible con ese número.");
	}
	
	public static void darDeBaja(LinkedList<Habitacion> habitaciones, LinkedList<Hospedaje> hospedajes) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Ingrese el número de la habitación que desea alquilar:");
	    int numero = scanner.nextInt();
	    
	    Habitacion habitacionElegida = null;
	    for (int i = 0; i < habitaciones.size(); i++) {
	        if (habitaciones.get(i).getN_habitacion() == numero && habitaciones.get(numero).isOcupada()) {
	            habitaciones.get(numero).setOcupada(false);
	            System.out.println("Hospedaje eliminado con éxito.");
	        }
	    }   
	}
	
	public static void limpiarHabitacion(LinkedList <Habitacion> habitaciones) {
		
		 Scanner num = new Scanner (System.in);
	        Trabajador t1 = new Trabajador("1111111", " Juana ", " De Arco Abierto ", Rango.LIMPIADOR, 32);        
	        Trabajador t2 = new Trabajador("22222", " Juana2 ", " De Arco Abierto2 ", Rango.LIMPIADOR, 32);
	        Habitacion h1 = new Habitacion(69, Categoria.NORMAL, t1, false);
	        Habitacion h2 = new Habitacion(70, Categoria.NORMAL, t2, false);
	        habitaciones.add(h1);
	        habitaciones.add(h2);
	        System.out.println(habitaciones);
	       
	        System.out.println("Introduce un numero de habitacion.");
	        int n_habitacion = num.nextInt();
	       
	        for (int i = 0; i < habitaciones.size(); i++){
	            if (habitaciones.get(i).getN_habitacion() == n_habitacion){
	                System.out.println("La limpiadora de la habitacion " + n_habitacion +  " es: " + habitaciones.get(i).getLimpiador());
	            }
	        }
	}
	
	public static void servirBuffet(LinkedList<Alimento> alimentos) {
		
		Scanner numeros = new Scanner(System.in);
		System.out.println("3. SERVIR BUFFET");
		System.out.println("A continuación se mostrará una lista de todos los productos disponibles: ");
		mostrarProductos(alimentos);
		System.out.println("Elige los alimentos mediante su número de serie: ");
		int n_serie = numeros.nextInt();
		for (int i = 0; i < alimentos.size(); i++) {
			if(alimentos.get(i).getN_serie() == n_serie) {
				if(alimentos.get(n_serie).getCantidad() != 0) {
				System.out.println("A continuación se muestra la cantidad del producto seleccionado: ");
				System.out.println(alimentos.get(n_serie).getCantidad());
				System.out.println("Que cantidad de alimentos quieres usar: ");
				int cantidad = numeros.nextInt();
				alimentos.get(n_serie).setCantidad(alimentos.get(n_serie).getCantidad() - cantidad);
				}else {
				System.out.println("Cantidad: " + alimentos.get(n_serie).getCantidad());
				System.out.println("ERROR: No hay alimentos");
				}
			}
		}
	}

	public static void mostrarProductos(LinkedList<Alimento> alimentos) {
		System.out.println("-- LISTA DE ALIMENTOS --");
		for (int i = 0; i < alimentos.size(); i++) {
			System.out.println("Número de Serie: " + alimentos.get(i).getN_serie() + " - " + "Nombre: " + alimentos.get(i).getNombre()
					+ " - " + "Cantidad: " + alimentos.get(i).getCantidad());
		}
	}
}
