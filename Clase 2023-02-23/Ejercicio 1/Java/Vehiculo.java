package clase23022023b;

public class Vehiculo {
	private String marca, color, modelo;

	public Vehiculo() {
		marca = color = modelo = "";
	}

	public void leer() {
		System.out.println("Into marca, color y modelo:");
		marca = Leer.dato();
		color = Leer.dato();
		modelo = Leer.dato();
	}

	public void mostrar() {
		System.out.println("[" + marca + ", " + color + ", " + modelo + "]");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
