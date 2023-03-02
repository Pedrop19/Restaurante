package Ppal;

public class Habitacion {
	
	private int n_habitacion;
	private Categoria categoria;
	private Trabajador limpiador;
	private boolean ocupada;
	
	public Habitacion(int n_habitacion, Categoria categoria, Trabajador limpiador, boolean ocupada) {
		super();
		this.n_habitacion = n_habitacion;
		this.categoria = categoria;
		this.limpiador = limpiador;
		this.ocupada = ocupada;
	}
	
	public int getN_habitacion() {
		return n_habitacion;
	}
	public void setN_habitacion(int n_habitacion) {
		this.n_habitacion = n_habitacion;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Trabajador getLimpiador() {
		return limpiador;
	}
	public void setLimpiador(Trabajador limpiador) {
		this.limpiador = limpiador;
	}
	
	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [n_habitacion=" + n_habitacion + ", categoria=" + categoria + ", limpiador=" + limpiador
				+ "]";
	}
}
