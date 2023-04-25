
public class NodoP {
	private Producto d;
	private NodoP sig;

	public NodoP() {
		sig = null;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}

	public Producto getD() {
		return d;
	}

	public void setD(Producto a) {
		this.d = a;
	}

}
