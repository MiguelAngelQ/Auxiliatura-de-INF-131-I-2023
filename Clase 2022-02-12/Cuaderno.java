import java.util.Scanner;

public class Cuaderno {
	private String marca;
	private int nroHojas;
	private String tipo;
	private String tamanio;

	public Cuaderno() {
		marca = "Winner";
		nroHojas = 250;
		tipo = "Empastado";
		tamanio = "Carta";
	}

	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzca marca: ");
		marca = in.next();
		System.out.print("Introduzca nroHojas: ");
		nroHojas = in.nextInt();
		System.out.print("Introduzca tipo: ");
		tipo = in.next();
		System.out.print("Introduzca tamanio: ");
		tamanio = in.next();
	}

	public void mostrar() {
		System.out.println("[ " + marca + ", " + nroHojas + ", " + tipo + ", " + tamanio + " ]");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNroHojas() {
		return nroHojas;
	}

	public void setNroHojas(int nroHojas) {
		this.nroHojas = nroHojas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	

}
