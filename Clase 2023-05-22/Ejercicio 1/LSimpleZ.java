import java.util.Scanner;

public class LSimpleZ {
	private NodoZ p;

	public LSimpleZ() {
		p = null;
	}

	public NodoZ getP() {
		return p;
	}

	public void setP(NodoZ p) {
		this.p = p;
	}

	public int nroNodos() {
		NodoZ w = getP();
		int c = 0;
		while (w != null) {
			c = c + 1;
			w = w.getSig();
		}
		return c;
	}

	public void adifinal(String nombre, LSimpleIV a, LDobleC b) {
		NodoZ nue = new NodoZ();
		nue.setNombre(nombre);
		nue.setA(a);
		nue.setB(b);
		if (getP() == null)
			setP(nue);
		else {
			NodoZ w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
		}
	}

	public NodoZ eliPrincipio() {
		NodoZ r = getP();
		setP(r.getSig());
		r.setSig(null);
		return r;
	}

	public void leer2(int n) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Zona: ");
			String zona = in.next();
			LSimpleIV aa = new LSimpleIV();
			aa.leer2(in.nextInt());
			LDobleC bb = new LDobleC();
			bb.leer2(in.nextInt());
			adifinal(zona, aa, bb);
		}
	}

	public void mostrar() {
		NodoZ k = getP();
		while (k != null) {
			System.out.println(k.getNombre());
			k.getA().mostrar();
			k.getB().mostrar();
			k = k.getSig();
		}
	}

}
