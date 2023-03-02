package Ppal;

import java.util.LinkedList;
import java.util.Scanner;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private Rango rangos;

    public Empleado(String dni, String nombre, String apellidos, Rango rangos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rangos = rangos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Rango getRangos() {
        return rangos;
    }

    public void setRangos(Rango rangos) {
        this.rangos = rangos;
    }
    
    public static void anadirEmpleado(LinkedList<Empleado> empleados) {
        
	    Scanner texto = new Scanner(System.in);
	    Scanner num = new Scanner(System.in);
	    
	    System.out.println("-- AÑADIR EMPLEADO --");
	    System.out.println("Introduce el DNI del trabajador que vaya a añadir un empleado:");
	    String dni = texto.nextLine();
	    for (int i = 0; i < empleados.size(); i++) {
	        if (empleados.get(i).getDni().equals(dni) && empleados.get(i).getRangos() == Rango.RRHH) {
	            System.out.println("Introduce el dni del nuevo empleado: ");
	            dni = texto.nextLine();
	            System.out.println("Introduce el nombre del nuevo empleado: ");
	            String nombre = texto.nextLine();
	            System.out.println("Introduce los apellidos del nuevo empleado: ");
	            String apellido = texto.nextLine();
	            System.out.println("Introduce un numero para añadir su rango: 1 - CHEF, 2 - PINCHE, 3 - RRHH");
	            int op = num.nextInt();
	            Rango rango = Rango.PINCHE;
	            switch (op) {
	                case 1:
	                    rango = Rango.CHEF;
	                    break;
	                case 2:
	                    rango = Rango.PINCHE;
	                    break;
	                case 3:
	                    rango = Rango.RRHH;
	                    break;
	                default:
	                    System.out.println("ERROR");
	                    break;
	                }
	                System.out.println("CREANDO NUEVO EMPLEADO");
	                Empleado e = new Empleado(dni, nombre, apellido, rango);
	                empleados.add(e);
	                System.out.println(" Empleado creado correctamente.");
	            }
	    }
    }
    
    public static void despedirEmpleado(LinkedList<Empleado> empleados) {
		Scanner texto = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
		System.out.println("Introduce el DNI del trabajador que vaya a despedir a un empleado:");
        String dni = texto.nextLine();
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getDni().equals(dni) && empleados.get(i).getRangos() == Rango.RRHH) {
                System.out.println("Introduce el dni del empleado que quieres despedir");
                dni = texto.nextLine();
                for (int j = 0; j < empleados.size(); j++) {
                    if (empleados.get(j).getDni().equals(dni)) {
                        System.out.println("BORRANDO EMPLEADO");
                        empleados.remove(j);
                        System.out.println("Empleado despedido correctamente.");
                    }
                }
            }
        }
	}
}
