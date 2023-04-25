import java.util.Scanner;

public class LSimpleF {
	private NodoF p;

	public LSimpleF() {
		p = null;
	}

	public NodoF getP() {
		return p;
	}

	public void setP(NodoF p) {
		this.p = p;
	}

	public int nroNodos() {
		NodoF w = getP();
		int c = 0;
		while (w != null) {
			c = c + 1;
			w = w.getSig();
		}
		return c;
	}

	public void adifinal(FAgropecuaria z) {
		NodoF nue = new NodoF();
		nue.setH(z);
		if (getP() == null)
			setP(nue);
		else {
			NodoF w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
		}
	}

	public NodoF eliPrincipio() {
		NodoF r = getP();
		setP(r.getSig());
		r.setSig(null);
		return r;
	}

	public void leer2(int n) {
		for (int i = 0; i < n; i++) {
			FAgropecuaria x = new FAgropecuaria();
			x.leer();
			adifinal(x);
		}
	}

	public void mostrar() {
		NodoF k = getP();
		while (k != null) {
			k.getH().mostrar();
			k = k.getSig();
		}
	}

}
