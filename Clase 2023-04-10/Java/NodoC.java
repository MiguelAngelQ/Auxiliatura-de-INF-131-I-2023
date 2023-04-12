package Clase10042023;

public class NodoC {
	private Colegio a;
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

	

	public Colegio getA() {
		return a;
	}

	public void setA(Colegio a) {
		this.a = a;
	}

	public NodoC getSig() {
		return sig;
	}

	public void setSig(NodoC sig) {
		this.sig = sig;
	}

}
