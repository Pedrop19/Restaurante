package Ppal;

import java.util.LinkedList;

public class Proveedor {
    private String dni;
    private String nombre;
    private LinkedList<Ingrediente> ingredientes;

    public Proveedor(String dni, String nombre, LinkedList<Ingrediente> ingredientes) {
        this.dni = dni;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
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
    

	public LinkedList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(LinkedList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Proveedor [dni=" + dni + ", nombre=" + nombre + ", ingredientes=" + ingredientes + "]";
	}
    
    
}
