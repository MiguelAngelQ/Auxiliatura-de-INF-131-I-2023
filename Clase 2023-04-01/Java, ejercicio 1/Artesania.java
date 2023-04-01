package ExamenPrimero1;

import java.util.Scanner;

public class Artesania {
	private int nroPuesto;
	private String nombreArte;
	private double precioArte;

	public Artesania() {
		nroPuesto = 0;
		nombreArte = "";
		precioArte = 0.0;
	}

	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("Into nroPuesto, nombreArte, precioArte: ");
		nroPuesto = in.nextInt();
		nombreArte = in.next();
		precioArte = in.nextDouble();
	}

	public void mostrar() {
		System.out.println("[" + nroPuesto + ", " + nombreArte + ", " + precioArte + "]");
	}

	public int getNroPuesto() {
		return nroPuesto;
	}

	public void setNroPuesto(int nroPuesto) {
		this.nroPuesto = nroPuesto;
	}

	public String getNombreArte() {
		return nombreArte;
	}

	public void setNombreArte(String nombreArte) {
		this.nombreArte = nombreArte;
	}

	public double getPrecioArte() {
		return precioArte;
	}

	public void setPrecioArte(double precioArte) {
		this.precioArte = precioArte;
	}
	
	

}
