package Ej2;

public class NodoP {
	private String nombre;
	private int precio;
	private NodoP izq, der;

	public NodoP() {
		izq = der = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public NodoP getIzq() {
		return izq;
	}

	public void setIzq(NodoP izq) {
		this.izq = izq;
	}

	public NodoP getDer() {
		return der;
	}

	public void setDer(NodoP der) {
		this.der = der;
	}
}
