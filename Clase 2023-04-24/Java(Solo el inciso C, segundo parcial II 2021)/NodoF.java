
public class NodoF {
	private FAgropecuaria h;
	private NodoF sig;

	public NodoF() {
		sig = null;
	}

	public NodoF getSig() {
		return sig;
	}

	public void setSig(NodoF sig) {
		this.sig = sig;
	}

	public FAgropecuaria getH() {
		return h;
	}

	public void setH(FAgropecuaria a) {
		this.h = a;
	}

}
