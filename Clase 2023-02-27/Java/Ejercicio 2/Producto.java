package Clase28022023;

public class Producto {
	private int idProd;
	private String nombre;
	private int precio;

	public Producto() {
		idProd = 0;
		nombre = "";
		precio = 0;
	}

	public void leer() {
		System.out.println("Into idProd, nombre y precio: ");
		idProd = Leer.datoInt();
		nombre = Leer.dato();
		precio = Leer.datoInt();
	}

	public void mostrar() {
		System.out.println("[" + idProd + ", " + nombre + ", " + precio + "]");
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
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
}
