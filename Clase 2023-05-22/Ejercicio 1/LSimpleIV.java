import java.util.Scanner;

public class LSimpleIV {
	private NodoIV p;

	public LSimpleIV() {
		p = null;
	}

	public NodoIV getP() {
		return p;
	}

	public void setP(NodoIV p) {
		this.p = p;
	}

	public int nroNodos() {
		NodoIV w = getP();
		int c = 0;
		while (w != null) {
			c = c + 1;
			w = w.getSig();
		}
		return c;
	}

	public void adifinal(String z) {
		NodoIV nue = new NodoIV();
		nue.setUbicacion(z);
		if (getP() == null)
			setP(nue);
		else {
			NodoIV w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
		}
	}

	public NodoIV eliPrincipio() {
		NodoIV r = getP();
		setP(r.getSig());
		r.setSig(null);
		return r;
	}

	public void leer2(int n) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Isla Verde: ");
			String x = in.next();
			adifinal(x);
		}
	}

	public void mostrar() {
		NodoIV k = getP();
		while (k != null) {
			System.out.println(k.getUbicacion());
			k = k.getSig();
		}
	}

}
