package Recursividad;

public class NodoM {
	private String sigla;
	private LSimpleE a = new LSimpleE();
	private LSimpleE b = new LSimpleE();
	private NodoM sig;

	public NodoM() {
		sig = null;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public LSimpleE getA() {
		return a;
	}

	public void setA(LSimpleE a) {
		this.a = a;
	}

	public LSimpleE getB() {
		return b;
	}

	public void setB(LSimpleE b) {
		this.b = b;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}

}
