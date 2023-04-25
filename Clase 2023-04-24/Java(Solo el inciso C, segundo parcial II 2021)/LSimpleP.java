import java.util.Scanner;

public class LSimpleP {
	private NodoP p;

	public LSimpleP() {
		p = null;
	}

	public NodoP getP() {
		return p;
	}

	public void setP(NodoP p) {
		this.p = p;
	}

	public int nroNodos() {
		NodoP w = getP();
		int c = 0;
		while (w != null) {
			c = c + 1;
			w = w.getSig();
		}
		return c;
	}

	public void adifinal(Producto z) {
		NodoP nue = new NodoP();
		nue.setD(z);
		if (getP() == null)
			setP(nue);
		else {
			NodoP w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
		}
	}
	
	public NodoP eliPrincipio() {
		NodoP r = getP();
		setP(r.getSig());
		r.setSig(null);
		return r;
	}

	public void leer2(int n) {
		for (int i = 0; i < n; i++) {
			Producto x = new Producto();
			x.leer();
			adifinal(x);
		}
	}

	public void mostrar() {
		NodoP k = getP();
		while (k != null) {
			k.getD().mostrar();
			k = k.getSig();
		}
	}

}
