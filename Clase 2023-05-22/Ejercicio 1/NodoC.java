
public class NodoC {
	private String color, ubicacion;
	private double capacidad;
	private NodoC sig, ant;

	public NodoC() {
		sig = ant = null;
	}

	public NodoC getAnt() {
		return ant;
	}

	public void setAnt(NodoC ant) {
		this.ant = ant;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public NodoC getSig() {
		return sig;
	}

	public void setSig(NodoC sig) {
		this.sig = sig;
	}

}
