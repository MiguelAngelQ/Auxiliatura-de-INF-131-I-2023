
public class Producto {

	private String nomProd, tipo;
	private int precio, montoVentas;

	public Producto() {

	}

	public void leer() {
		System.out.println("Producto: ");
		System.out.println("nomProd, tipo, precio, montoVentas");
		nomProd = Leer.dato();
		tipo = Leer.dato();
		precio = Leer.datoInt();
		montoVentas = Leer.datoInt();
	}

	public void mostrar() {
		System.out.println("{" + nomProd + " " + tipo + " " + precio + " " + montoVentas + "}");
	}

	public String getNomProd() {
		return nomProd;
	}

	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getMontoVentas() {
		return montoVentas;
	}

	public void setMontoVentas(int montoVentas) {
		this.montoVentas = montoVentas;
	}

}
