package Ppal;

import java.util.LinkedList;

public class Plato {
    private int idPlato;
    private String nombrePlato;
    private String descripcion;
    private Nivel nivelDificultad;
    private double precio;
    private Categoria menu;
    private LinkedList<Ingrediente> ingredientes;
    private LinkedList<Empleado> trabajadores;

    public Plato(int idPlato, String nombrePlato, String descripcion, Nivel nivelDificultad, double precio, Categoria menu, LinkedList<Ingrediente> ingredientes, LinkedList<Empleado> trabajadores) {
        this.idPlato = idPlato;
        this.nombrePlato = nombrePlato;
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.precio = precio;
        this.menu = menu;
        this.ingredientes = ingredientes;
        this.trabajadores = trabajadores;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Nivel getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Nivel nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getMenu() {
        return menu;
    }

    public void setMenu(Categoria menu) {
        this.menu = menu;
    }

	public LinkedList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(LinkedList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public LinkedList<Empleado> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(LinkedList<Empleado> trabajadores) {
		this.trabajadores = trabajadores;
	}

	@Override
	public String toString() {
		return "Plato [idPlato=" + idPlato + ", nombrePlato=" + nombrePlato + ", descripcion=" + descripcion
				+ ", nivelDificultad=" + nivelDificultad + ", precio=" + precio + ", menu=" + menu + ", ingredientes="
				+ ingredientes + ", trabajadores=" + trabajadores + "]";
	}
    
    
    
    
}
