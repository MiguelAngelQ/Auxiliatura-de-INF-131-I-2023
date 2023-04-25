
public class LDobleS {
	private NodoS p;

	public LDobleS() {
		p = null;
	}

	public NodoS getP() {
		return p;
	}

	public void setP(NodoS p) {
		this.p = p;
	}

	public void adifinal(Stand z) {
		NodoS nue = new NodoS();
		nue.setF(z);
		if (getP() == null)
			setP(nue);
		else {
			NodoS w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
			nue.setAnt(w);
		}
	}

	public NodoS eliPrincipio() {
		NodoS w = getP();
		if (w.getSig() == null)
			setP(null);
		else {
			setP(w.getSig());
			w.setSig(null);
			w.setAnt(null);
		}
		return w;
	}

	public NodoS eliFinal() {
		NodoS w = getP();
		if (w.getSig() == null)
			setP(null);
		else {
			while (w.getSig() != null)
				w = w.getSig();
			NodoS q = w.getAnt();
			q.setSig(null);
			w.setAnt(null);
		}
		return w;

	}

	public void leer2(int n) {
		for (int i = 0; i < n; i++) {
			Stand x = new Stand();
			x.leer();
			adifinal(x);
		}
	}

	public void mostrar() {
		NodoS k = getP();
		while (k != null) {
			k.getF().mostrar();
			k = k.getSig();
		}
	}

	public int nroNodos() {
		NodoS w = getP();
		int ans = 0;
		while (w != null) {
			ans += 1;
			w = w.getSig();
		}
		return ans;
	}
}
