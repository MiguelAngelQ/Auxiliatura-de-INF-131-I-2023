
public class NodoS {
	private Stand f;
	private NodoS sig, ant;

	public NodoS() {
		sig = ant = null;
	}

	public NodoS getAnt() {
		return ant;
	}

	public void setAnt(NodoS ant) {
		this.ant = ant;
	}

	public Stand getF() {
		return f;
	}

	public void setF(Stand a) {
		this.f = a;
	}

	public NodoS getSig() {
		return sig;
	}

	public void setSig(NodoS sig) {
		this.sig = sig;
	}
	
}
