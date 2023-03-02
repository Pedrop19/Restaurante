package Ppal;

public class Trabajador {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private Rango rango;
	private double salario;
	
	
	public Trabajador(String dni, String nombre, String apellidos, Rango rango, double salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rango = rango;
		this.salario = salario;
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
	public Rango getRango() {
		return rango;
	}
	public void setRango(Rango rango) {
		this.rango = rango;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", rango=" + rango
				+ ", salario=" + salario + "]";
	}	
}
