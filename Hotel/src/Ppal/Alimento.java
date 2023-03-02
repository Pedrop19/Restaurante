package Ppal;

public class Alimento {

	private int n_serie;
	private String nombre;
	private int cantidad;
	
	
	public Alimento(int n_serie, String nombre, int cantidad) {
		this.n_serie = n_serie;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public int getN_serie() {
		return n_serie;
	}
	public void setN_serie(int n_serie) {
		this.n_serie = n_serie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Alimento [n_serie=" + n_serie + ", nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
}
