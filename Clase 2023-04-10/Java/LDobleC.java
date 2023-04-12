package Clase10042023;

public class LDobleC {
	private NodoC p;

	public LDobleC() {
		p = null;
	}

	public NodoC getP() {
		return p;
	}

	public void setP(NodoC p) {
		this.p = p;
	}

	public void adifinal(Colegio z) {
		NodoC nue = new NodoC();
		nue.setA(z);
		if (getP() == null)
			setP(nue);
		else {
			NodoC w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
			nue.setAnt(w);
			// nue.setAnt(w);
		}
	}

	public NodoC eliPrincipio() {
		NodoC w = getP();
		if (w.getSig() == null)
			setP(null);
		else {
			setP(w.getSig());
			w.setSig(null);
			w.setAnt(null);
		}
		return w;
	}

	public NodoC eliFinal() {
		NodoC w = getP();
		if (w.getSig() == null)
			setP(null);
		else {
			while (w.getSig() != null)
				w = w.getSig();
			NodoC q = w.getAnt();
			q.setSig(null);
			w.setAnt(null);
		}
		return w;

	}

	public void leer2(int n) {
		for (int i = 0; i < n; i++) {
			Colegio x = new Colegio();
			x.leer();
			adifinal(x);
		}
	}

	public void mostrar() {
		NodoC k = getP();
		while (k != null) {
			k.getA().mostrar();
			k = k.getSig();
		}
	}

	public int nroNodos() {
		NodoC w = getP();
		int ans = 0;
		while (w != null) {
			ans += 1;
			w = w.getSig();
		}
		return ans;
	}

	public void adiPrincipio(Colegio x) {
		NodoC u = new NodoC();
		u.setA(x);
		if(getP() == null)
			setP(u);
		else {
			u.setSig(getP());
			getP().setAnt(u);
			setP(u);
		}
	}
}
