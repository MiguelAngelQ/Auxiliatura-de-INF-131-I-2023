package Clase28022023;

public class Cliente {

	private String ci, nombre;

	public Cliente() {
		ci = nombre = "";
	}

	public void leer() {
		System.out.println("Into ci y nombre: ");
		ci = Leer.dato();
		nombre = Leer.dato();
	}

	public void mostrar() {
		System.out.println("[" + ci + ", " + nombre + "]");
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
