package Ppal;

public class Hospedaje {
	
	private Cliente persona;
	private Habitacion n_hab;
		
	public Hospedaje(Cliente persona, Habitacion habitacionElegida) {
		this.persona = persona;
		this.n_hab = habitacionElegida;
	}
	
	public Cliente getPersona() {
		return persona;
	}
	public void setPersona(Cliente persona) {
		this.persona = persona;
	}
	public Habitacion getN_hab() {
		return n_hab;
	}
	public void setN_hab(Habitacion n_hab) {
		this.n_hab = n_hab;
	}

	@Override
	public String toString() {
		return "Hospedaje [persona=" + persona + ", n_hab=" + n_hab + "]";
	}
}
