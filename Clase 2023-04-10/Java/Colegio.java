package Clase10042023;

public class Colegio {
	private String nombre, direccion, turno;
	private int nroEst;
	
	public Colegio() {
		// TODO Auto-generated constructor stub
	}
	
	public void leer() {
		System.out.println("Into nombre, direccion, turno y nroEst");
		nombre = Leer.dato();
		direccion = Leer.dato();
		turno = Leer.dato();
		nroEst = Leer.datoInt();
	}
	
	public void mostrar() {
		System.out.println("[" + nombre + ", " + direccion + ", " + turno + ", " + nroEst + "]");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getNroEst() {
		return nroEst;
	}

	public void setNroEst(int nroEst) {
		this.nroEst = nroEst;
	}
	

}
